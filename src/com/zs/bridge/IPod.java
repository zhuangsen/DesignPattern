package com.zs.bridge;

public class IPod extends Product{

	@Override
	public void beProducted() {
		System.out.println("����������iPod���������...");
	}

	@Override
	public void beSelled() {
		System.out.println("������iPod����ȥ...");
	}

}
