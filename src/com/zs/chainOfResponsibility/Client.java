package com.zs.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// �����ѡ����Ů��
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "��Ҫ��ȥ���"));
		}
/*		// ����������ʾ����
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		for (IWomen women : arrayList) {
			if (women.getType() == 1) { // δ�����Ů����ʾ����
				System.out.println("\n--------Ů��������ʾ-------");
				father.HandleMessage(women);
			} else if (women.getType() == 2) { // �ѻ��ٸ�����ʾ�ɷ�
				System.out.println("\n--------�������ɷ���ʾ-------");
				husband.HandleMessage(women);
			} else if (women.getType() == 3) { // ĸ����ʾ����
				System.out.println("\n--------ĸ���������ʾ-------");
				son.HandleMessage(women);
			} else {
				// ��ʱɶҲ����
			}
		}*/
		
		
		//����������ʾ����
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		//������ʾ˳��
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women:arrayList){
			father.HandleMessage(women);
		}
	}
}
