package com.zs.observer;

public class LiuSi implements Observer {

	//��˹���۲쵽�����ӻ���Լ�Ҳ��һ��������
	public void update(String str){
		System.out.println("��˹���۲쵽�����ӻ����ʼ������...");
		this.happy(str);
		System.out.println("��˹���汻������\n");
	}
	
	//һ���������б仯�����Ϳ���
	private void happy(String context){
		System.out.println("��˹����Ϊ" +context+",���������ҿ���ѽ��" );
	}
}
