package com.zs.composite;

import java.util.ArrayList;

public class Branch implements IBranch,ICorp {

	// �洢�ӽڵ����Ϣ
	private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	// ��֦�ڵ������
	private String name = "";
	// ��֦�ڵ��ְλ
	private String position = "";
	// ��֦�ڵ��нˮ
	private int salary = 0;

	// ͨ�����캯��������֦�ڵ�Ĳ���
	public Branch(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

//	// ����һ������֦�ڵ�
//	public void add(IBranch branch) {
//		this.subordinateList.add(branch);
//	}
//
//	// ����һ��Ҷ�ӽڵ�
//	public void add(ILeaf leaf) {
//		this.subordinateList.add(leaf);
//	}

	// ����Լ���֦�ڵ����Ϣ
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}

	// ����¼�����Ϣ
	public ArrayList<ICorp> getSubordinateInfo() {
		return this.subordinateList;
	}

	@Override
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}

}
