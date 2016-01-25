package com.zs.composite;

import java.util.ArrayList;

public interface IRoot {
	//�õ��ܾ������Ϣ
	public String getInfo();
	
	//�ܾ����±�Ҫ��С������Ҫ������С���������з����ܾ������Ǹ���֦�ڵ�
	public void add(IBranch branch);
	
	//��Ҫ��������Ҷ�ڵ�
	public void add(ILeaf leaf);
	
	//��Ȼ�����ӣ���Ҫ��Ҫ�ܹ��������������ܾ���֪������������Щ��
	public ArrayList getSubordinateInfo();
}
