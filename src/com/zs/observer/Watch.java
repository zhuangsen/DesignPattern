package com.zs.observer;

public class Watch extends Thread {

	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;

	// ͨ�����캯�����ݲ�������Ҫ��ص���˭,˭�����,Ҫ���ʲô
	public Watch(HanFeiZi _hanFeiZi, LiSi _liSi, String _type) {
		this.hanFeiZi = _hanFeiZi;
		this.liSi = _liSi;
		this.type = _type;
	}

/*	@Override
	public void run() {
		while (true) {
			if (this.type.equals("breakfast")) { // ����Ƿ��ڳ����
				// ������ֺ������ڳԷ�����֪ͨ��˹
				if (this.hanFeiZi.isHaveBreakfast()) {
					this.liSi.update("�������ڳԷ�");
					// ����״̬���������
					this.hanFeiZi.setHaveBreakfast(false);
				}
			} else {// ����Ƿ�������
				if (this.hanFeiZi.isHaveFun()) {
					this.liSi.update("������������");
					this.hanFeiZi.setHaveFun(false);
				}
			}
		}
	}*/
}
