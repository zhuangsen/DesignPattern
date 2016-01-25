package com.zs.bridge;

public class HouseCorp extends Corp{

	public HouseCorp(Product product) {
		super(product);
	}

	@Override
	protected void produce() {
		System.out.println("���ز���˾�Ƿ���...");
	}

	@Override
	protected void sell() {
		System.out.println("���ز���˾���۷���...");
	}
	
	//���ز���˾��High�ˣ�׬Ǯ��������
	public void makeMoney(){
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}
}
