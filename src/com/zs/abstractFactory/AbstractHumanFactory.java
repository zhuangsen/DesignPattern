package com.zs.abstractFactory;

public abstract class AbstractHumanFactory implements HumanFactory {
	/**
	 * ����һ���Ա����֣�����һ�����������רҵ�����ǲ�����Ʒ�Ǽ�
	 */
	
	protected Human createHuman(HumanEnum humanEnum){
		Human human = null;
		
		//������ݽ�������һ��Enum�о����һ��Element�Ļ����򲻴���
		if(humanEnum.getValue().equals("")){
			try {
				//ֱ�Ӳ���һ��ʵ��
				human = (Human)Class.forName(humanEnum.getValue()).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return human;
	}
	
}
