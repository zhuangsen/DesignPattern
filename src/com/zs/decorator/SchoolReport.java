package com.zs.decorator;

public abstract class SchoolReport {

	//成绩单的主要展示的就是你的成绩情况
	public abstract void report();
	
	//成绩单要家长签字，这个事最要命
	public abstract void sign(String name);
}
