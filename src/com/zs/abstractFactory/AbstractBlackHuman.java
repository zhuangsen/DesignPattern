package com.zs.abstractFactory;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void cry() {
		System.out.println("���˻��");
	}

	@Override
	public void laugh() {
		System.out.println("���˻�Ц");
	}

	@Override
	public void talk() {
		System.out.println("���˿���˵����һ����������");
	}

}
