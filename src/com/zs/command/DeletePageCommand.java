package com.zs.command;

public class DeletePageCommand extends Command {

	//ִ��ɾ��һ��ҳ�������
	@Override
	public void execute() {
		//�ҵ�ҳ����
		super.pg.find();
		
		//ɾ��һ��ҳ��
		super.pg.delete();
		
		//�����ƻ�
		super.pg.plan();
	}

}
