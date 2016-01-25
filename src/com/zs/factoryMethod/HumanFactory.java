package com.zs.factoryMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class HumanFactory{
	
	//定义一个map，初始化过的Human对象都放在这里
	private static HashMap<String, Human> humans = new HashMap<String, Human>();

	// 定义一个烤箱，泥巴塞进去，人就出来，这个太先进
	public static Human createHuman(Class c) {
		// 定义一个类型的人类
		Human human = null;

		try {
			//如果map中有，则直接从取出，不用初始化了
			if(humans.containsKey(c.getSimpleName())){
				human = humans.get(c.getSimpleName());
			}else{
				human = (Human) Class.forName(c.getName()).newInstance();
				
				//放到MAP中
				humans.put(c.getSimpleName(), human);
			}
			
			
			
			
			//human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("必须指定人种的颜色");
		} catch (IllegalAccessException e) {
			System.out.println("人种定义错误！");
		} catch (ClassNotFoundException e) {
			System.out.println("混蛋，你指定的人种找不到！");
		}
		return human;
	}
	
	//女娲生气了，把一团泥巴塞到八卦炉，哎生产啥人种就啥人种
	public static Human createHuman(){
		//定义一个类型的人类
		Human human = null;
		
		//首先是获得由多少个实现类，多少个人种
		List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
		
		Random random = new Random();
//		System.out.println(concreteHumanList.size());
		int rand = random.nextInt(concreteHumanList.size());
		
		human = createHuman(concreteHumanList.get(rand));
		return human;
	}
}
