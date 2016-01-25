package com.zs.strategy;

public class ZhaoYun {

	/**
	 * ����ǲ���ģʽ�����ھ۵���ϵ��ص�Ҳ���ֳ����ˣ�����һ������
	 * ��չ�ԣ�Ҳ����OCPԭ�򣬲�������Լ���������ȥ��ֻҪ�޸�Context.java
	 * �Ϳ�����
	 * @param args
	 */
	public static void main(String[] args) {
		Context context;
		System.out.println("----------�ոյ������ʱ����һ��---------");
		context = new Context(new BackDoor());//�õ����
		context.operate(); //��ִ��
		System.out.println("\n\n\n\n\n\n\n\n");
		
		//�����ֲ�˼�񣬲�ڶ�����
		System.out.println("-------------�����ֲ�˼���ˣ���ڶ�����-----------");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("\n\n\n\n\n\n\n\n");
		
		//��Ȩ��С��׷�ˣ�զ�죿�������
		System.out.println("------��Ȩ��С��׷�ˣ�զ�죿�������--------");
		context = new Context(new BlockEnemy());
		context.operate();
		System.out.println("\n\n\n\n\n\n\n\n");
	}

}
