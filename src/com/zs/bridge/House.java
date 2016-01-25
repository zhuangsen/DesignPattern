package com.zs.bridge;

public class House extends Product {

	//豆腐渣就都负债呗，好歹也是个房子
	@Override
	public void beProducted() {
		System.out.println("生产出的房子是这个样子的...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出来的房子卖出去了...");
	}

	
	
}
