package com.zs.observer;

import java.util.Observer;
import java.util.Observable;

public class LiSi implements Observer {
	/*// ������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	public void update(String str) {
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(str);
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}

	// �㱨����ʼ��
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}*/
	
	
	//������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	@Override
	public void update(Observable observable,Object obj){
		System.out.println("��˹���۲쵽��˹�����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(obj.toString());
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}
	//�㱨����ʼ��
	private void reportToQiShiHuang(String reportContext){
		System.out.println("��˹�����棬���ϰ壡�������л��--->"+reportContext);
	}

}
