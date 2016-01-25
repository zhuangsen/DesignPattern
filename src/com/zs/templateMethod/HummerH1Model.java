package com.zs.templateMethod;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;//是否要响喇叭

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	public void enginBoom() {
		System.out.println("悍马H1引擎声是这样的...");
	}



	@Override
	public void start() {
		System.out.println("悍马H1发动...");
	}


	@Override
	public void stop() {
		System.out.println("悍马H1停车...");
	}

	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	//要不要响喇叭，是由客户来决定的
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
