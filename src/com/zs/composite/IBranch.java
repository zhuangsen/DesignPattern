package com.zs.composite;

import java.util.ArrayList;

public interface IBranch {

	//�����Ϣ
	public String getInfo();
	
//	//�������ݽڵ㣬�����з����µ��з�һ��
//	public void add(IBranch branch);
//	
//	//����Ҷ�ӽڵ�
//	public void add(ILeaf leaf);
	
	//�ܹ�����С������Ҷ�ڵ㣩�����Ǿ�����֦�ڵ㣩
	public void addSubordinate(ICorp corp);
	
	//����¼���Ϣ
	public ArrayList<ICorp> getSubordinateInfo();
	
}