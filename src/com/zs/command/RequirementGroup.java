package com.zs.command;

public class RequirementGroup extends Group {

	//�ͻ�Ҫ���������ȥ������̸
	@Override
	public void add() {
		System.out.println("�ҵ�������...");
	}

	//�ͻ�Ҫ������һ������
	@Override
	public void change() {
		System.out.println("�ͻ�Ҫ���޸�һ������...");
	}

	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ������...");
	}

	@Override
	public void find() {
		System.out.println("�ͻ�Ҫ������һ������...");
	}

	@Override
	public void plan() {
		System.out.println("�ͻ�Ҫ���������ƻ�...");
	}

}
