package com.zs.templateMethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�ͻ�����H1�ͺţ���ȥ������
		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarm(true);
		//������������
		h1.run();
		
		//�ͻ���H2�ͺţ���ȥ��ˣ��
		HummerModel h2 = new HummerH2Model();
		h2.run();
	}

}
