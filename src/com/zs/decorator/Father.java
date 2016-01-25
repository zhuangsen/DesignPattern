package com.zs.decorator;

public class Father {

	public static void main(String[] args) {
//		//成绩单拿过来
//		SchoolReport sr = new FouthGradeSchoolReport();
//		
//		//看成绩单
//		sr.report();
//		
//		//签名？休想！
		
		
//		//美化过的成绩单拿过来
//		SchoolReport sr = new SugarFouthGradeSchoolReport();
//		
//		//看成绩单
//		sr.report();
//		
//		//然后老爸，一看，很开心，就签名了
//		sr.sign("老爸");
		
		
		//成绩单拿过来
		SchoolReport sr;
		sr = new FouthGradeSchoolReport(); // 原装的成绩单
		
		//加了最高分说明的成绩单
		sr = new HighSchoolDecorator(sr);
		
		//又加了成绩排名的说明
		sr = new SortDecorator(sr);
		
		//看成绩单
		sr.report();
		
		//然后老爸，一看，很开心，就签名了
		sr.sign("老爸");
	}
}
