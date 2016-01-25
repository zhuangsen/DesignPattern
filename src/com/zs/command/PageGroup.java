package com.zs.command;

public class PageGroup extends Group {

	@Override
	public void add() {
		System.out.println("找到美工组...");
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一项界面...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一项界面...");
	}

	@Override
	public void find() {
		System.out.println("客户要求增加一项界面...");
	}

	@Override
	public void plan() {
		System.out.println("客户要求界面变更计划...");
	}

}
