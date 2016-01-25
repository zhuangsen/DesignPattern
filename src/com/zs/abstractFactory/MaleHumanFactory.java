package com.zs.abstractFactory;

public class MaleHumanFactory extends AbstractHumanFactory {

	//����һ�����Ժ�����
	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	//����һ�����԰�����
	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	//����һ�����Ի�����
	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}

}
