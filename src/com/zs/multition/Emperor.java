package com.zs.multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {

	//最多只能有两个皇帝
	private static int maxNumOfEmperor = 2;
	//皇帝叫什么名字
	private static ArrayList<String> emperorInfoList = new ArrayList<String>(maxNumOfEmperor);
	//装皇帝的列表
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>(maxNumOfEmperor);
	//正在被人尊称的是哪个皇帝
	private static int countNumOfEmperor = 0;
	
	//先把2个皇帝生产出来
	static {
		//把所有的皇帝都生产出来
		for(int i=0; i<maxNumOfEmperor;i++){
			emperorList.add(new Emperor("皇" +(i+1)+"帝"));
		}
	}
	
	//就这么多皇帝了，不允许在推举一个皇帝(new 一个皇帝)
	private Emperor(){
		
	}
	private Emperor(String info){
		emperorInfoList.add(info);
	}
	
	public static Emperor getInstance(){
		Random random = new Random();
		//随机拉出来一个皇帝，只要是个精神领袖就行
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	//皇帝叫什么名字呀
	public static void emperorInfo(){
		System.out.println(emperorInfoList.get(countNumOfEmperor));
	}
}
