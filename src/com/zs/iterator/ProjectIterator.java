package com.zs.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
	//所有的项目都放在这里ArrayList中
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	
	private int currentItem = 0;
	
	//构造函数传入projectList
	public ProjectIterator(ArrayList<IProject> projectList){
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		//定义返回值
		boolean b = true;
		if(this.currentItem>=projectList.size()||
				this.projectList.get(this.currentItem) == null){
			b = false;
		}
		return b;
	}

	//去得下一个值
	@Override
	public IProject next() {
		return (IProject)this.projectList.get(this.currentItem++);
	}

	//删除一个对象
	@Override
	public void remove() {
		//暂时没有使用到
	}

}
