package com.zs.iterator;

public interface IProject {
	//������Ŀ
	public void add(String name, int num, int cost);
	
	//���ϰ����￴���ľ�����Ŀ����Ϣ
	public String getProjectInfo();
	
	//���һ�����Ա������Ķ���
	
	public IProjectIterator iterator();
}
