package com.zs.proxy;

public class XiMenQing {
	
	public static void main(String[] args) {
		//�����Žг���
		WangPo wangPo = new WangPo();
		
		//Ȼ���������˵����Ҫ���˽���happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ
		wangPo.makeEyesWithMan();//����û����Ȼ������������������ʵ����ˬ�����˽���
		wangPo.happyWithMan();
		
		//�ı�һ����ʷ�����ϱ������카��
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo1 = new WangPo(jiaShi);
		wangPo1.makeEyesWithMan();
		wangPo1.happyWithMan();
	}
}
