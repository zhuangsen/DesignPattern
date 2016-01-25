package com.zs.abstractFactory;

public enum HumanEnum {

	//�����������������Ͷ��������
	YellowMaleHuman("com.zs.AbstractFactory.YellowMaleHuman"),
	YellowFemleHuman("com.zs.AbstractFactory.YellowFemaleHuman"),
	WhiteMaleHuman("com.zs.AbstractFactory.WhiteMaleHuman"),
	WhiteFemaleHuman("com.zs.AbstractFactory.WhiteFemaleHuman"),
	BlackMaleHuman("com.zs.AbstractFactory.BlackMaleHuman"),
	BlackFemaleHuman("com.zs.AbstractFactory.BlackFemaleHuman");
	
	private String value="";
	//���幹�캯����Ŀ����Data(value)���͵���ƥ��
	private HumanEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
