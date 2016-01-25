package com.zs.adapter;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//没有与外系统连接的时候，是这样写的
		//IUserInfo youngGirl = new UserInfo();
		
		//外部系统数据
		IUserInfo youngGirl = new OuterUserInfo();
		//从数据库中查到101个
		for(int i=0;i<101;i++){
			youngGirl.getMobileNumber();
		}
	}

}
