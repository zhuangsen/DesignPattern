package com.zs.abstractFactory;

public class NvWa {

	public static void main(String[] args) {
		//��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		
		//�ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		//�����߽�����ϣ���ʼ�������ˣ�
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		femaleYellowHuman.sex();
	}
}
