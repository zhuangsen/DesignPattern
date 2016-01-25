package com.zs.observer;

import java.util.ArrayList;
import java.util.Observable;



public class HanFeiZi extends Observable {

	/*
	// 韩非子是否在吃饭，作为监控的判断标准
	private boolean isHaveBreakfast = false;
	// 韩非子是否在娱乐
	private boolean isHaveFun = false;

	// 韩非子要吃饭了
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		this.isHaveBreakfast = true;
	}

	// 韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		this.isHaveFun = true;
	}

	// 以下是bean的基本方法，getter/setter，不多说
	public boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}

	public void setHaveBreakfast(boolean isHaveBreakfast) {
		this.isHaveBreakfast = isHaveBreakfast;
	}

	public boolean isHaveFun() {
		return isHaveFun;
	}

	public void setHaveFun(boolean isHaveFun) {
		this.isHaveFun = isHaveFun;
	}*/
	
/*	//把李斯声明出来
	private ILiSi liSi =new LiSi();
	
	//韩非子要吃饭了
	public void haveBreakfast(){
		System.out.println("韩非子:开始吃饭了...");
		//通知李斯
		this.liSi.update("韩非子在吃饭");
	}
	
	//韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
	public void haveFun(){
		System.out.println("韩非子:开始娱乐了...");
		this.liSi.update("韩非子在娱乐");
	}*/
	
	
	
/*	//定义个变长数组，存放所有的观察者
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	//增加观察者
	public void addObserver(Observer observer){
		this.observerList.add(observer);
	}
	
	//删除观察者
	public void deleteObserver(Observer observer){
		this.observerList.remove(observer);
	}
	
	//通知所有的观察者
	public void notifyObservers(String context){
		for(Observer observer:observerList){
			observer.update(context);
		}
	}
	
	//韩非子要吃饭了
	public void haveBreakfast(){System.out.println("韩非子:开始吃饭了...");
		//通知所有的观察者
		this.notifyObservers("韩非子在吃饭");
	}
	
	//韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
	public void haveFun(){
		System.out.println("韩非子:开始娱乐了...");
		this.notifyObservers("韩非子在娱乐");
	}*/
	
	
	
	//韩非子要吃饭了
	public void haveBreakfast(){
		System.out.println("韩非子:开始吃饭了...");
		//通知所有的观察者
		super.setChanged();
		super.notifyObservers("韩非子在吃饭");
	}
	//韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
	public void haveFun(){
		System.out.println("韩非子:开始娱乐了...");
		super.setChanged();
		this.notifyObservers("韩非子在娱乐");
	}

}
