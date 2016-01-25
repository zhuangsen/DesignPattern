package com.zs.bridge;

public class ClothesCorp extends Corp {

	public ClothesCorp(Product product) {
		super(product);
	}

	//服装公司生产的就是衣服了
	@Override
	protected void produce() {
		System.out.println("服装公司生产衣服...");
	}

	//服装公司买服装，可只卖服装，不买穿衣服的模特
	@Override
	protected void sell() {
		System.out.println("服装公司出售衣服...");
	}

	//服装公司部景气，但怎么说也是赚钱行业
	public void makeMoney(){
		super.makeMoney();
		System.out.println("服装公司赚小钱...");
	}
}
