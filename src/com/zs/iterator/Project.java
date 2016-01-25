package com.zs.iterator;

import java.util.ArrayList;

public class Project implements IProject {
	//����һ����Ŀ�б�
	private ArrayList<IProject> projectList = new ArrayList<IProject>();

	//��Ŀ����
	private String name = "";
	
	//��Ŀ��Ա����
	private int num = 0;
	
	//��Ŀ����
	private int cost = 0;
	
	public Project(){
		
	}
	
	//����һ�����캯�����������ϰ���Ҫ��������Ϣ�洢����
	public Project(String name, int num, int cost){
		this.name = name;
		this.num = num;
		this.cost = cost;
	}
	
	//������Ŀ����Ϣ
	@Override
	public String getProjectInfo() {
		String info = "";
		
		//�����Ŀ������
		info = info + "��Ŀ������:"+this.name;
		//�����Ŀ����
		info = info + "\t��Ŀ����:"+this.num;
		//��Ŀ����
		info = info +"\t��Ŀ����:"+this.cost;
		return info;
	}

	//������Ŀ
	@Override
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name,num,cost));
	}

	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}

}
