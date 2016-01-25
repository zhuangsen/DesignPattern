package com.zs.decorator;

public class Father {

	public static void main(String[] args) {
//		//�ɼ����ù���
//		SchoolReport sr = new FouthGradeSchoolReport();
//		
//		//���ɼ���
//		sr.report();
//		
//		//ǩ�������룡
		
		
//		//�������ĳɼ����ù���
//		SchoolReport sr = new SugarFouthGradeSchoolReport();
//		
//		//���ɼ���
//		sr.report();
//		
//		//Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
//		sr.sign("�ϰ�");
		
		
		//�ɼ����ù���
		SchoolReport sr;
		sr = new FouthGradeSchoolReport(); // ԭװ�ĳɼ���
		
		//������߷�˵���ĳɼ���
		sr = new HighSchoolDecorator(sr);
		
		//�ּ��˳ɼ�������˵��
		sr = new SortDecorator(sr);
		
		//���ɼ���
		sr.report();
		
		//Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
		sr.sign("�ϰ�");
	}
}
