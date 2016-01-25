package com.zs.proxy;

public class WangPo implements KindWomen {

	private KindWomen kindWomen;
	public WangPo(){//默认的话是潘金莲的代理
		this.kindWomen = new PanJinLian();
	}
	
	//她可以使KindWomend的任何一个女人的代理，只要你是这一类型
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	@Override
	public void happyWithMan() {
		this.kindWomen.happyWithMan();//自己老了，干不了，可以让年轻的的代替
	}

	@Override
	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan();//王婆这么大年龄，谁看她跑媚眼
	}

}
