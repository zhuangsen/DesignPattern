package com.zs.iterator;

import java.util.ArrayList;

public class Boss {

	public static void main(String[] args) {
		//定义一个List，存放所有的项目对象
		ArrayList<IProject> projectList = new ArrayList<IProject>();
		
		
		//增加星球大战项目
		projectList.add(new Project("星球大战项目",10,100000));
		//增加扭转时空项目
		projectList.add(new Project("扭转时空项目",100,10000000));
		//增加超人改造项目
		projectList.add(new Project("超人改造项目",10000,1000000000));
		
		//这边100个项目
		for(int i = 4; i<104; i++){
			projectList.add(new Project("第"+i+"个项目",i*5,i*100000));
		}
		
		//遍历一下ArrayList，把所有的数据都取出
//		for(IProject project: projectList){
//			System.out.println(project.getProjectInfo());
//		}
		
		IProject project = new Project();
		//增加星球大战项目
		project.add("星球大战项目",10,100000);
		//增加扭转时空项目
		project.add("扭转时空项目",100,10000000);
		//增加超人改造项目
		project.add("超人改造项目",10000,1000000000);
		//这边100个项目
		for(int i = 4; i<104; i++){
			project.add("第"+i+"个项目",i*5,i*100000);
		}
		
		//遍历一下ArrayList，把所有的数据都取出
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject)projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
