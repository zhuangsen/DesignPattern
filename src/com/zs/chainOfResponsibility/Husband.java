package com.zs.chainOfResponsibility;

/*public class Husband implements IHandler {
	// �������ɷ���ʾ
	public void HandleMessage(IWomen women) {
		System.out.println("���ӵ���ʾ�ǣ�" + women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��");
	}

}*/

public class Husband extends Handler {
	//�ɷ�ֻ�������ӵ�����
	public Husband(){
		super(2);
	}
	//�ɷ���ʾ�Ĵ�
	@Override
	public void response(IWomen women) {
		System.out.println("--------�������ɷ���ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
	}
}