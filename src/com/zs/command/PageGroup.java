package com.zs.command;

public class PageGroup extends Group {

	@Override
	public void add() {
		System.out.println("�ҵ�������...");
	}

	@Override
	public void change() {
		System.out.println("�ͻ�Ҫ���޸�һ�����...");
	}

	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ�����...");
	}

	@Override
	public void find() {
		System.out.println("�ͻ�Ҫ������һ�����...");
	}

	@Override
	public void plan() {
		System.out.println("�ͻ�Ҫ��������ƻ�...");
	}

}
