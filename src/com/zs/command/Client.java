package com.zs.command;

public class Client {
	
	public static void main(String[] args) {
		/*//���ȿͻ��ҵ�������˵������̸���󣬲��޸�
		System.out.println("-----------�ͻ�Ҫ������һ������-----------");
		Group rp = new RequirementGroup();
		//�ҵ�������
		rp.find();
		//����һ������
		rp.add();
		//Ҫ�����ƻ�
		rp.plan();
		
		System.out.println("----------�ͻ�Ҫ��ɾ��һ��ҳ��-----------");
		Group pg = new PageGroup();
		//�ҵ�������
		pg.find();
		//����һ������
		pg.delete();
		//Ҫ�����ƻ�
		pg.plan();*/
		
		//�������ǵĽ�ͷ��
		Invoker vo = new Invoker();
		
		//�ͻ�Ҫ������һ������
		//System.out.println("-----------�ͻ�Ҫ������һ������-------------");
		System.out.println("-----------�ͻ�Ҫ��ɾ��һ��ҳ��-------------");
		//�ͻ���������������
		//Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		
		//��ͷ�˽��ܵ�����
		vo.setCommand(command);
		
		//��ͷ��ִ������
		vo.action();
	}
}
