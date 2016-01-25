package com.zs.observer;

import java.util.Observer;

public class Client {
	public static void main(String[] args) throws InterruptedException {
/*		// 定义出韩非子和李斯
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		// 观察早餐
		Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
		// 开始启动线程，监控
		watchBreakfast.start();
		// 观察娱乐情况
		Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
		watchFun.start();
		// 然后这里我们看看韩非子在干什么
		Thread.sleep(1000); // 主线程等待1秒后后再往下执行
		hanFeiZi.haveBreakfast();
		// 韩非子娱乐了
		Thread.sleep(1000);
		hanFeiZi.haveFun();*/
		
/*		//定义出韩非子
		HanFeiZi hanFeiZi = new HanFeiZi();
		//然后这里我们看看韩非子在干什么
		hanFeiZi.haveBreakfast();
		//韩非子娱乐了
		hanFeiZi.haveFun();*/
		
		
		//三个观察者产生出来
		Observer liSi = new LiSi();
		//Observer wangSi = new WangSi();
		//Observer liuSi = new LiuSi();
		//定义出韩非子
		HanFeiZi hanFeiZi = new HanFeiZi();
		//我们后人根据历史，描述这个场景，有三个人在观察韩非子
		hanFeiZi.addObserver(liSi);
		//hanFeiZi.addObserver(wangSi);
		//hanFeiZi.addObserver(liuSi);
		//然后这里我们看看韩非子在干什么
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
