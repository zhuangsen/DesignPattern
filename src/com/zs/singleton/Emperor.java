package com.zs.singleton;

public class Emperor {

	//����һ���ʵ۷������Ȼ�������ʵ�����
	private static Emperor emperor = null;
	
	private Emperor(){
		//���׺͵��µ�Լ����Ŀ�ľ��ǲ���������ڶ����ʵ�
	}
	
	public static Emperor getInstance(){
		if(emperor == null){
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public static void emperorInfo(){
		System.out.println("�Ҿ��ǻʵ�ĳĳĳ.....");
	}
}
