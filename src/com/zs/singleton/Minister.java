package com.zs.singleton;

/**
 * �����
 * @author Administrator
 *
 */
public class Minister {
	public static void main(String[] args) {
		//��һ��
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo();
		
		//�ڶ���
		Emperor emperor2 = Emperor.getInstance();
		emperor2.emperorInfo();
		
		//������
		Emperor emperor3 = Emperor.getInstance();
		emperor3.emperorInfo();
	}
}
