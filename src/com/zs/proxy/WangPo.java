package com.zs.proxy;

public class WangPo implements KindWomen {

	private KindWomen kindWomen;
	public WangPo(){//Ĭ�ϵĻ����˽����Ĵ���
		this.kindWomen = new PanJinLian();
	}
	
	//������ʹKindWomend���κ�һ��Ů�˵Ĵ���ֻҪ������һ����
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	@Override
	public void happyWithMan() {
		this.kindWomen.happyWithMan();//�Լ����ˣ��ɲ��ˣ�����������ĵĴ���
	}

	@Override
	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan();//������ô�����䣬˭����������
	}

}
