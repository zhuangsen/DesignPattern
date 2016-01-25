package com.zs.templateMethod;

public abstract class HummerModel {
	//首先，这个模型要能够发动起来
	protected abstract void start();
	
	//能发动，还要能停下来
	protected abstract void stop();
	
	//喇叭会出声音
	protected abstract void alarm();
	
	//引擎会响
	protected abstract void enginBoom();
	
	/**
	 * 这个方法是很有意思的，它要跑，那肯定要启动，停止了等，也就是要调用其他方法
	 */
	final public void run() {
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.enginBoom();
		//然后就开始跑了，跑的过程中遇到一条狗挡道，就按喇叭
		//this.alarm();
		//喇叭想让它响就响，不想让它响就不响
		if(this.isAlarm()){
			this.alarm();
		}
		//到达目的地就停车
		this.stop();
	}
	
	//钩子方法，默认喇叭是会响的
	protected boolean isAlarm(){
		return true;
	}
}
