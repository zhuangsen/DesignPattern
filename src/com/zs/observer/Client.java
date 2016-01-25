package com.zs.observer;

import java.util.Observer;

public class Client {
	public static void main(String[] args) throws InterruptedException {
/*		// ����������Ӻ���˹
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		// �۲����
		Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
		// ��ʼ�����̣߳����
		watchBreakfast.start();
		// �۲��������
		Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
		watchFun.start();
		// Ȼ���������ǿ����������ڸ�ʲô
		Thread.sleep(1000); // ���̵߳ȴ�1����������ִ��
		hanFeiZi.haveBreakfast();
		// ������������
		Thread.sleep(1000);
		hanFeiZi.haveFun();*/
		
/*		//�����������
		HanFeiZi hanFeiZi = new HanFeiZi();
		//Ȼ���������ǿ����������ڸ�ʲô
		hanFeiZi.haveBreakfast();
		//������������
		hanFeiZi.haveFun();*/
		
		
		//�����۲��߲�������
		Observer liSi = new LiSi();
		//Observer wangSi = new WangSi();
		//Observer liuSi = new LiuSi();
		//�����������
		HanFeiZi hanFeiZi = new HanFeiZi();
		//���Ǻ��˸�����ʷ������������������������ڹ۲캫����
		hanFeiZi.addObserver(liSi);
		//hanFeiZi.addObserver(wangSi);
		//hanFeiZi.addObserver(liuSi);
		//Ȼ���������ǿ����������ڸ�ʲô
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
