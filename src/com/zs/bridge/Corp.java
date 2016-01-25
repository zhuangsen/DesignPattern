package com.zs.bridge;

public abstract class Corp {
	/**
	 * �ǹ�˾��Ӧ���������ɣ��¹���ʲô�����˾��������ҵ��˾
	 * ��ÿ����˾�������Ķ�������һ����������ʵ���������
	 */
	
	//����һ����Ʒ���󣬳�����ˣ���֪��������ʲô��Ʒ
	private Product product;
	
	//���캯���������ඨ�崫�ݾ���Ĳ�Ʒ����
	public Corp(Product product){
		this.product = product;
	}
	
	protected abstract void produce();
	
	/**
	 * �в�Ʒ�ˣ��ǿ϶�Ҫ����ѽ���������㹫˾��ô����
	 */
	protected abstract void sell();
	
	//��˾�Ǹ�ʲô�ģ�׬Ǯ��ѽ����׬Ǯɵ�ӲŸ�
	public void makeMoney(){
		
		//ÿ����˾����һ����������
		this.product.beProducted();
		
		//Ȼ������
		this.product.beSelled();
	}
}
