package com.zs.chainOfResponsibility;

/*public class Son implements IHandler {

	// Ŀǰ�������ʾ
	public void HandleMessage(IWomen women) {
		System.out.println("ĸ�׵���ʾ�ǣ�" + women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��");
	}
}
*/

public class Son extends Handler {
	//����ֻ����ĸ�׵�����
	public Son(){
		super(3);
	}
	//���ӵĴ�
	public void response(IWomen women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}
}