package com.zs.observer;


public interface Observable {

	//����һ���۲���
	public void addObserver(Observer observer);
	//ɾ��һ���۲��ߣ������Ҳ������㿴��
	public void deleteObserver(Observer observer);
	//��ȻҪ�۲죬�ҷ����ı�����ҲӦ��������������֪ͨ�۲���
	public void notifyObservers(String context);
}
