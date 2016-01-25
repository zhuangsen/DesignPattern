package com.zs.factoryMethod;

public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----------������ĵ�һ�����ǰ���------------");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();

		System.out.println("-----------������ĵڶ������������ģ�����---------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();

		System.out.println("-----------������ĵ��������������ģ���ɫ����----------");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();

		// Ů洷����ˣ�����ɶ���־�ɶ���֣��հ�
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\n-----------�����������----------");

			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}
	}

}
