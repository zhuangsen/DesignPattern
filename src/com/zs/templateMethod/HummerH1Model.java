package com.zs.templateMethod;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;//�Ƿ�Ҫ������

	@Override
	public void alarm() {
		System.out.println("����H1����...");
	}

	@Override
	public void enginBoom() {
		System.out.println("����H1��������������...");
	}



	@Override
	public void start() {
		System.out.println("����H1����...");
	}


	@Override
	public void stop() {
		System.out.println("����H1ͣ��...");
	}

	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	//Ҫ��Ҫ�����ȣ����ɿͻ���������
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
