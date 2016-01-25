package com.zs.factoryMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class HumanFactory{
	
	//����һ��map����ʼ������Human���󶼷�������
	private static HashMap<String, Human> humans = new HashMap<String, Human>();

	// ����һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ�
	public static Human createHuman(Class c) {
		// ����һ�����͵�����
		Human human = null;

		try {
			//���map���У���ֱ�Ӵ�ȡ�������ó�ʼ����
			if(humans.containsKey(c.getSimpleName())){
				human = humans.get(c.getSimpleName());
			}else{
				human = (Human) Class.forName(c.getName()).newInstance();
				
				//�ŵ�MAP��
				humans.put(c.getSimpleName(), human);
			}
			
			
			
			
			//human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("����ָ�����ֵ���ɫ");
		} catch (IllegalAccessException e) {
			System.out.println("���ֶ������");
		} catch (ClassNotFoundException e) {
			System.out.println("�쵰����ָ���������Ҳ�����");
		}
		return human;
	}
	
	//Ů������ˣ���һ�������������¯��������ɶ���־�ɶ����
	public static Human createHuman(){
		//����һ�����͵�����
		Human human = null;
		
		//�����ǻ���ɶ��ٸ�ʵ���࣬���ٸ�����
		List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
		
		Random random = new Random();
//		System.out.println(concreteHumanList.size());
		int rand = random.nextInt(concreteHumanList.size());
		
		human = createHuman(concreteHumanList.get(rand));
		return human;
	}
}
