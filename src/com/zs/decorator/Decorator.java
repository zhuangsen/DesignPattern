package com.zs.decorator;

public abstract class Decorator extends SchoolReport {

	//������Ҫ֪�����ĸ��ɼ���
	private SchoolReport sr;
	
	//���캯�������ݳɼ�������
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	
	//�ɼ�������Ҫ��������
	@Override
	public void report() {
		this.sr.report();
	}

	//���껹��Ҫǩ��
	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
