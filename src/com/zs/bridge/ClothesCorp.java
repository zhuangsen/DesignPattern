package com.zs.bridge;

public class ClothesCorp extends Corp {

	public ClothesCorp(Product product) {
		super(product);
	}

	//��װ��˾�����ľ����·���
	@Override
	protected void produce() {
		System.out.println("��װ��˾�����·�...");
	}

	//��װ��˾���װ����ֻ����װ�������·���ģ��
	@Override
	protected void sell() {
		System.out.println("��װ��˾�����·�...");
	}

	//��װ��˾������������ô˵Ҳ��׬Ǯ��ҵ
	public void makeMoney(){
		super.makeMoney();
		System.out.println("��װ��˾׬СǮ...");
	}
}
