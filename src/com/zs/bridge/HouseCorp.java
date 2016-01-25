package com.zs.bridge;

public class HouseCorp extends Corp{

	public HouseCorp(Product product) {
		super(product);
	}

	@Override
	protected void produce() {
		System.out.println("房地产公司盖房子...");
	}

	@Override
	protected void sell() {
		System.out.println("房地产公司出售房子...");
	}
	
	//房地产公司很High了，赚钱计算利润
	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}
}
