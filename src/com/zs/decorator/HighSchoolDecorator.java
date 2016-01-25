package com.zs.decorator;

public class HighSchoolDecorator extends Decorator {

	//���캯��
	public HighSchoolDecorator(SchoolReport sr) {
		super(sr);
	}

	//��Ҫ�ر���߳ɼ�
	private void reportHighScore(){
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}

	//��߳ɼ���Ҫ���ϰֿ��ɼ���ǰ������
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
	}
	 
	
}
