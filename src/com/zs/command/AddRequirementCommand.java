package com.zs.command;

public class AddRequirementCommand extends Command {

	//ִ������һ�����������
	@Override
	public void execute() {
		//�ҵ�������
		super.rg.find();
		
		//����һ������
		super.rg.add();
		
		//ҳ��ҲҪ����
		super.pg.add();
		
		//����ҲҪ����
		super.cg.add();
		
		//�����ƻ�
		super.rg.plan();
	}

}
