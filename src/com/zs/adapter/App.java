package com.zs.adapter;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//û������ϵͳ���ӵ�ʱ��������д��
		//IUserInfo youngGirl = new UserInfo();
		
		//�ⲿϵͳ����
		IUserInfo youngGirl = new OuterUserInfo();
		//�����ݿ��в鵽101��
		for(int i=0;i<101;i++){
			youngGirl.getMobileNumber();
		}
	}

}
