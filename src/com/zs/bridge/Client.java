package com.zs.bridge;

public class Client {
	public static void main(String[] args) {
//		System.out.println("------------���ز���˾������������е�---------");
//		//���ҵ��ҵĹ�˾
//		HouseCorp houseCorp = new HouseCorp();
//		//������ô��Ǯ
//		houseCorp.makeMoney();
//		System.out.println("\n");
//		
//		System.out.println("-----------��װ��˾���������е�-------------");
//		ClothesCorp clothCorp = new ClothesCorp();
//		clothCorp.makeMoney();
//		System.out.println("\n");
//		
//		System.out.println("-----------ɽկ��˾���������е�-------------");
//		IPodCorp iPodCorp = new IPodCorp();
//		iPodCorp.makeMoney();
		
		House house = new House();
		System.out.println("------------���ز���˾������������е�---------");
		//���ҵ��ҵĹ�˾
		HouseCorp houseCorp = new HouseCorp(house);
		//������ô׬Ǯ
		houseCorp.makeMoney();
		System.out.println("\n");
		
		//ɽկ��˾�����Ĳ�Ʒ�ܶ࣬������ֻҪָ����Ʒ�ͳ���
		System.out.println("-----------ɽկ��˾���������е�-------------");
		IPodCorp iPodCorp = new IPodCorp(new Clothes());
		iPodCorp.makeMoney();
	}
}
