package com.zs.factoryMethod;

public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----------造出来的第一批人是白人------------");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();

		System.out.println("-----------造出来的第二批人是这样的：黑人---------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();

		System.out.println("-----------造出来的第三批人是这样的：黄色人种----------");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();

		// 女娲烦躁了，爱是啥人种就啥人种，烧吧
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\n-----------随机产生人了----------");

			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}
	}

}
