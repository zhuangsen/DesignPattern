package com.zs.templateMethod;

public abstract class HummerModel {
	//���ȣ����ģ��Ҫ�ܹ���������
	protected abstract void start();
	
	//�ܷ�������Ҫ��ͣ����
	protected abstract void stop();
	
	//���Ȼ������
	protected abstract void alarm();
	
	//�������
	protected abstract void enginBoom();
	
	/**
	 * ��������Ǻ�����˼�ģ���Ҫ�ܣ��ǿ϶�Ҫ������ֹͣ�˵ȣ�Ҳ����Ҫ������������
	 */
	final public void run() {
		//�ȷ�������
		this.start();
		//���濪ʼ����
		this.enginBoom();
		//Ȼ��Ϳ�ʼ���ˣ��ܵĹ���������һ�����������Ͱ�����
		//this.alarm();
		//��������������죬����������Ͳ���
		if(this.isAlarm()){
			this.alarm();
		}
		//����Ŀ�ĵؾ�ͣ��
		this.stop();
	}
	
	//���ӷ�����Ĭ�������ǻ����
	protected boolean isAlarm(){
		return true;
	}
}
