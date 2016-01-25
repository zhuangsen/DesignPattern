package com.zs.strategy;

public class Context {
	//���캯������Ҫʹ���ĸ����
	private IStrategy strategy;
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	//ʹ�ü�ı�ˣ����ҳ�����
	public void operate(){
		this.strategy.operate();
	}
}
