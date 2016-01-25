package com.zs.chainOfResponsibility;

/*public class Father implements IHandler {

	// 未出嫁女儿来请示父亲
	public void HandleMessage(IWomen women) {
		System.out.println("女儿的请示是：" + women.getRequest());
		System.out.println("父亲的答复是:同意");
	}
}*/

public class Father extends Handler{
	
	//父亲只处理女儿的请求
	public Father(){
		super(1);
	}
	//父亲的答复
	@Override
	public void response(IWomen women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
	}
}