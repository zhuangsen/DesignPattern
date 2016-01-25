package com.zs.abstractFactory;

public enum HumanEnum {

	//把世界上所有人类型都定义出来
	YellowMaleHuman("com.zs.AbstractFactory.YellowMaleHuman"),
	YellowFemleHuman("com.zs.AbstractFactory.YellowFemaleHuman"),
	WhiteMaleHuman("com.zs.AbstractFactory.WhiteMaleHuman"),
	WhiteFemaleHuman("com.zs.AbstractFactory.WhiteFemaleHuman"),
	BlackMaleHuman("com.zs.AbstractFactory.BlackMaleHuman"),
	BlackFemaleHuman("com.zs.AbstractFactory.BlackFemaleHuman");
	
	private String value="";
	//定义构造函数，目的是Data(value)类型的相匹配
	private HumanEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
