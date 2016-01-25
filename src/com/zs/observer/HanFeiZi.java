package com.zs.observer;

import java.util.ArrayList;
import java.util.Observable;



public class HanFeiZi extends Observable {

	/*
	// �������Ƿ��ڳԷ�����Ϊ��ص��жϱ�׼
	private boolean isHaveBreakfast = false;
	// �������Ƿ�������
	private boolean isHaveFun = false;

	// ������Ҫ�Է���
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		this.isHaveBreakfast = true;
	}

	// �����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.isHaveFun = true;
	}

	// ������bean�Ļ���������getter/setter������˵
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
	
/*	//����˹��������
	private ILiSi liSi =new LiSi();
	
	//������Ҫ�Է���
	public void haveBreakfast(){
		System.out.println("������:��ʼ�Է���...");
		//֪ͨ��˹
		this.liSi.update("�������ڳԷ�");
	}
	
	//�����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun(){
		System.out.println("������:��ʼ������...");
		this.liSi.update("������������");
	}*/
	
	
	
/*	//������䳤���飬������еĹ۲���
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	//���ӹ۲���
	public void addObserver(Observer observer){
		this.observerList.add(observer);
	}
	
	//ɾ���۲���
	public void deleteObserver(Observer observer){
		this.observerList.remove(observer);
	}
	
	//֪ͨ���еĹ۲���
	public void notifyObservers(String context){
		for(Observer observer:observerList){
			observer.update(context);
		}
	}
	
	//������Ҫ�Է���
	public void haveBreakfast(){System.out.println("������:��ʼ�Է���...");
		//֪ͨ���еĹ۲���
		this.notifyObservers("�������ڳԷ�");
	}
	
	//�����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun(){
		System.out.println("������:��ʼ������...");
		this.notifyObservers("������������");
	}*/
	
	
	
	//������Ҫ�Է���
	public void haveBreakfast(){
		System.out.println("������:��ʼ�Է���...");
		//֪ͨ���еĹ۲���
		super.setChanged();
		super.notifyObservers("�������ڳԷ�");
	}
	//�����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun(){
		System.out.println("������:��ʼ������...");
		super.setChanged();
		this.notifyObservers("������������");
	}

}
