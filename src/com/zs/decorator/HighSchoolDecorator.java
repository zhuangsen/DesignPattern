package com.zs.decorator;

public class HighSchoolDecorator extends Decorator {

	//构造函数
	public HighSchoolDecorator(SchoolReport sr) {
		super(sr);
	}

	//我要回报最高成绩
	private void reportHighScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}

	//最高成绩我要在老爸看成绩单前告诉他
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
	}
	 
	
}
