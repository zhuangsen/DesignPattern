package com.zs.abstractFactory;

public class MaleHumanFactory extends AbstractHumanFactory {

	//创建一个男性黑种人
	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	//创建一个男性白种人
	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	//创建一个男性黄种人
	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}

}
