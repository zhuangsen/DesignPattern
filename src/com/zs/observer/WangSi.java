package com.zs.observer;

public class WangSi implements Observer {

	//��˹�������������л���Լ����ܲ���
	public void update(String str){
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(str);
		System.out.println("��˹������Ŀ�����...\n");
	}
	
	//һ����˹�л���Ϳޣ�ʹ��
	private void cry(String context){
		System.out.println("��˹����Ϊ"+context+"�����������ұ���ѽ��");
	}
}
