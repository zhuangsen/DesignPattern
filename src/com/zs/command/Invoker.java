package com.zs.command;

public class Invoker {

	//ʲô����
	private Command command;
	
	//�ͻ���������
	public void setCommand(Command command){
		this.command = command;
	}
	
	//ִ�пͻ�������
	public void action(){
		this.command.execute();
	}
}
