package com.zs.multition;

public class Minister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ministerNum = 10;//10����
		
		for(int i= 0; i<ministerNum;i++){
			Emperor emperor = Emperor.getInstance();
			System.out.println("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			emperor.emperorInfo();
		}
	}

}
