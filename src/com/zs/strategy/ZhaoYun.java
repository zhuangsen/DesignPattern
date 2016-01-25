package com.zs.strategy;

public class ZhaoYun {

	/**
	 * 这就是策略模式，高内聚低耦合的特点也表现出来了，还有一个就是
	 * 扩展性，也就是OCP原则，策略类可以继续增加下去，只要修改Context.java
	 * 就可以了
	 * @param args
	 */
	public static void main(String[] args) {
		Context context;
		System.out.println("----------刚刚到吴国的时候拆第一个---------");
		context = new Context(new BackDoor());//拿到妙计
		context.operate(); //拆开执行
		System.out.println("\n\n\n\n\n\n\n\n");
		
		//刘备乐不思蜀，拆第二个了
		System.out.println("-------------刘备乐不思蜀了，拆第二个了-----------");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("\n\n\n\n\n\n\n\n");
		
		//孙权的小兵追了，咋办？拆第三个
		System.out.println("------孙权的小兵追了，咋办？拆第三个--------");
		context = new Context(new BlockEnemy());
		context.operate();
		System.out.println("\n\n\n\n\n\n\n\n");
	}

}
