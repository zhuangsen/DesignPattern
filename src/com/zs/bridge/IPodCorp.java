package com.zs.bridge;

public class IPodCorp extends Corp {

	public IPodCorp(Product product) {
		super(product);
	}

	//我开始生产IPod了
	@Override
	protected void produce() {
		System.out.println("我生产IPod...");
	}

	//山寨的IPod很畅销，便宜呀
	@Override
	protected void sell() {
		System.out.println("iPod畅销...");
	}
	
	//狂赚钱
	public void makeMoney(){
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}

}
