package com.zs.chainOfResponsibility;

/*public class Father implements IHandler {

	// δ����Ů������ʾ����
	public void HandleMessage(IWomen women) {
		System.out.println("Ů������ʾ�ǣ�" + women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��");
	}
}*/

public class Father extends Handler{
	
	//����ֻ����Ů��������
	public Father(){
		super(1);
	}
	//���׵Ĵ�
	@Override
	public void response(IWomen women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}
}