package com.zs.proxy;

public class XiMenQing {
	
	public static void main(String[] args) {
		//把王婆叫出来
		WangPo wangPo = new WangPo();
		
		//然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏
		wangPo.makeEyesWithMan();//看到没，虽然表面上是王婆在做，实际上爽的是潘金莲
		wangPo.happyWithMan();
		
		//改编一下历史，贾氏被西门庆勾走
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo1 = new WangPo(jiaShi);
		wangPo1.makeEyesWithMan();
		wangPo1.happyWithMan();
	}
}
