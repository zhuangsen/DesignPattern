package com.zs.iterator;

import java.util.ArrayList;

public class Boss {

	public static void main(String[] args) {
		//����һ��List��������е���Ŀ����
		ArrayList<IProject> projectList = new ArrayList<IProject>();
		
		
		//���������ս��Ŀ
		projectList.add(new Project("�����ս��Ŀ",10,100000));
		//����Ťתʱ����Ŀ
		projectList.add(new Project("Ťתʱ����Ŀ",100,10000000));
		//���ӳ��˸�����Ŀ
		projectList.add(new Project("���˸�����Ŀ",10000,1000000000));
		
		//���100����Ŀ
		for(int i = 4; i<104; i++){
			projectList.add(new Project("��"+i+"����Ŀ",i*5,i*100000));
		}
		
		//����һ��ArrayList�������е����ݶ�ȡ��
//		for(IProject project: projectList){
//			System.out.println(project.getProjectInfo());
//		}
		
		IProject project = new Project();
		//���������ս��Ŀ
		project.add("�����ս��Ŀ",10,100000);
		//����Ťתʱ����Ŀ
		project.add("Ťתʱ����Ŀ",100,10000000);
		//���ӳ��˸�����Ŀ
		project.add("���˸�����Ŀ",10000,1000000000);
		//���100����Ŀ
		for(int i = 4; i<104; i++){
			project.add("��"+i+"����Ŀ",i*5,i*100000);
		}
		
		//����һ��ArrayList�������е����ݶ�ȡ��
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject)projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
