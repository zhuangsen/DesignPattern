package com.zs.multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {

	//���ֻ���������ʵ�
	private static int maxNumOfEmperor = 2;
	//�ʵ۽�ʲô����
	private static ArrayList<String> emperorInfoList = new ArrayList<String>(maxNumOfEmperor);
	//װ�ʵ۵��б�
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>(maxNumOfEmperor);
	//���ڱ�����Ƶ����ĸ��ʵ�
	private static int countNumOfEmperor = 0;
	
	//�Ȱ�2���ʵ���������
	static {
		//�����еĻʵ۶���������
		for(int i=0; i<maxNumOfEmperor;i++){
			emperorList.add(new Emperor("��" +(i+1)+"��"));
		}
	}
	
	//����ô��ʵ��ˣ����������ƾ�һ���ʵ�(new һ���ʵ�)
	private Emperor(){
		
	}
	private Emperor(String info){
		emperorInfoList.add(info);
	}
	
	public static Emperor getInstance(){
		Random random = new Random();
		//���������һ���ʵۣ�ֻҪ�Ǹ������������
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	//�ʵ۽�ʲô����ѽ
	public static void emperorInfo(){
		System.out.println(emperorInfoList.get(countNumOfEmperor));
	}
}
