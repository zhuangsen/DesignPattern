package com.zs.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
	//���е���Ŀ����������ArrayList��
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	
	private int currentItem = 0;
	
	//���캯������projectList
	public ProjectIterator(ArrayList<IProject> projectList){
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		//���巵��ֵ
		boolean b = true;
		if(this.currentItem>=projectList.size()||
				this.projectList.get(this.currentItem) == null){
			b = false;
		}
		return b;
	}

	//ȥ����һ��ֵ
	@Override
	public IProject next() {
		return (IProject)this.projectList.get(this.currentItem++);
	}

	//ɾ��һ������
	@Override
	public void remove() {
		//��ʱû��ʹ�õ�
	}

}
