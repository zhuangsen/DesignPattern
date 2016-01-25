package com.zs.singleton;

public class SingletonPattern {

	/*
	private static SingletonPattern singletonPattern = null;
	//限制不能直接产生一个实例
	private SingletonPattern(){
		
	}
	
	public SingletonPattern getInstance(){
		if(this.singletonPattern == null){
			//如果还没有则创建一个
			this.singletonPattern = new SingletonPattern();
		}
		return this.singletonPattern;
	}
	*/
	
	private static final SingletonPattern singletonPattern = new SingletonPattern();
	
	//限制不能直接产生一个实例
	private SingletonPattern(){
		
	}
	
	public synchronized static SingletonPattern getInstance(){
		return singletonPattern;
	}
	
}
