package com.zs.templateMethod;

public class HummerH2Model extends HummerModel {

	@Override
	public void alarm() {
		System.out.println("����H2����...");
	}

	@Override
	public void enginBoom() {
		System.out.println("����H2����������������...");
	}

	@Override
	public void start() {
		System.out.println("����H2����...");
	}

	@Override
	public void stop() {
		System.out.println("����H1ͣ��...");
	}

	//Ĭ��û������
	@Override
	protected boolean isAlarm() {
		return false;
	}

}
