package com.zs.templateMethod;

public class HummerH2Model extends HummerModel {

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛...");
	}

	@Override
	public void enginBoom() {
		System.out.println("悍马H2引擎声音是这样的...");
	}

	@Override
	public void start() {
		System.out.println("悍马H2发动...");
	}

	@Override
	public void stop() {
		System.out.println("悍马H1停车...");
	}

	//默认没有喇叭
	@Override
	protected boolean isAlarm() {
		return false;
	}

}
