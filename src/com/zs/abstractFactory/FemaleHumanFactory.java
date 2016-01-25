package com.zs.abstractFactory;

public class FemaleHumanFactory extends AbstractHumanFactory {

	//����һ��Ů�Ժ�����
	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

	//����һ��Ů�԰�����
	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

	//����һ��Ů�Ի�����
	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowFemleHuman);
	}

}
