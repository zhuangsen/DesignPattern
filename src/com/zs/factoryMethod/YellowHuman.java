package com.zs.factoryMethod;

public class YellowHuman implements Human {

	@Override
	public void cry() {
		System.out.println("��ɫ���ֻ��");
	}

	@Override
	public void laugh() {
		System.out.println("��ɫ���ֻ��Ц���Ҹ�ѽ��");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ӽ�");
	}

}
