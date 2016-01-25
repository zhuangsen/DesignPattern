package com.zs.bridge;

public class IPodCorp extends Corp {

	public IPodCorp(Product product) {
		super(product);
	}

	//�ҿ�ʼ����IPod��
	@Override
	protected void produce() {
		System.out.println("������IPod...");
	}

	//ɽկ��IPod�ܳ���������ѽ
	@Override
	protected void sell() {
		System.out.println("iPod����...");
	}
	
	//��׬Ǯ
	public void makeMoney(){
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}

}
