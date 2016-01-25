package com.zs.bridge;

public class IPod extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产出来的iPod是这个样子...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出iPod卖出去...");
	}

}
