package com.zs.singleton;

public class SingletonPattern {

	/*
	private static SingletonPattern singletonPattern = null;
	//���Ʋ���ֱ�Ӳ���һ��ʵ��
	private SingletonPattern(){
		
	}
	
	public SingletonPattern getInstance(){
		if(this.singletonPattern == null){
			//�����û���򴴽�һ��
			this.singletonPattern = new SingletonPattern();
		}
		return this.singletonPattern;
	}
	*/
	
	private static final SingletonPattern singletonPattern = new SingletonPattern();
	
	//���Ʋ���ֱ�Ӳ���һ��ʵ��
	private SingletonPattern(){
		
	}
	
	public synchronized static SingletonPattern getInstance(){
		return singletonPattern;
	}
	
}
