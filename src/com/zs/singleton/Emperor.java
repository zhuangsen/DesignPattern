package com.zs.singleton;

public class Emperor {

	//定义一个皇帝放在那里，然后给这个皇帝名字
	private static Emperor emperor = null;
	
	private Emperor(){
		//世俗和道德的约束，目的就是不让你产生第二个皇帝
	}
	
	public static Emperor getInstance(){
		if(emperor == null){
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public static void emperorInfo(){
		System.out.println("我就是皇帝某某某.....");
	}
}
