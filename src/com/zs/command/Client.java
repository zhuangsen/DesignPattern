package com.zs.command;

public class Client {
	
	public static void main(String[] args) {
		/*//首先客户找到需求组说，过来谈需求，并修改
		System.out.println("-----------客户要求增加一个需求-----------");
		Group rp = new RequirementGroup();
		//找到需求组
		rp.find();
		//增加一个需求
		rp.add();
		//要求变更计划
		rp.plan();
		
		System.out.println("----------客户要求删除一个页面-----------");
		Group pg = new PageGroup();
		//找到美工组
		pg.find();
		//增加一个需求
		pg.delete();
		//要求变更计划
		pg.plan();*/
		
		//定义我们的接头人
		Invoker vo = new Invoker();
		
		//客户要求增加一项需求
		//System.out.println("-----------客户要求增加一个需求-------------");
		System.out.println("-----------客户要求删除一个页面-------------");
		//客户给我们下命令来
		//Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		
		//接头人接受到命令
		vo.setCommand(command);
		
		//接头人执行命令
		vo.action();
	}
}
