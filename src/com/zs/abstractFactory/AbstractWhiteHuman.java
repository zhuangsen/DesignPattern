package com.zs.abstractFactory;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void cry() {
		System.out.println("��ɫ���ֻ��");
	}

	@Override
	public void laugh() {
		System.out.println("��ɫ���ֻ��Ц�����Ե�Ц��");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ�㶼�ǵ��ֽ�");

	}

}
