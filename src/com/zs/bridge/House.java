package com.zs.bridge;

public class House extends Product {

	//�������Ͷ���ծ�£��ô�Ҳ�Ǹ�����
	@Override
	public void beProducted() {
		System.out.println("�������ķ�����������ӵ�...");
	}

	@Override
	public void beSelled() {
		System.out.println("���������ķ�������ȥ��...");
	}

	
	
}
