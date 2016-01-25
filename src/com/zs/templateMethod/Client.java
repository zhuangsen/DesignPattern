package com.zs.templateMethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//客户开着H1型号，出去遛弯了
		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarm(true);
		//汽车跑起来了
		h1.run();
		
		//客户开H2型号，出去玩耍了
		HummerModel h2 = new HummerH2Model();
		h2.run();
	}

}
