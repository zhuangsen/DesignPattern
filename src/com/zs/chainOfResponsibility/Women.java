package com.zs.chainOfResponsibility;

public class Women implements IWomen {

	/*
	 * ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״�� 1---δ���� 2---���� 3---����
	 */
	private int type = 0;
	// ��Ů����ʾ
	private String request = "";

	// ���캯�����ݹ�������
	public Women(int _type, String _request) {
		this.type = _type;
		//this.request = _request;

		// Ϊ����ʾ�ÿ��㣬�����������˵㴦��
		switch (this.type) {
		case 1:
			this.request = "Ů���������ǣ�" + _request;
			break;
		case 2:
			this.request = "���ӵ������ǣ�" + _request;
			break;
		case 3:
			this.request = "ĸ�׵������ǣ�" + _request;
		}
	}

	// ����Լ���״��
	public int getType() {
		return this.type;
	}

	// ��ø�Ů������
	public String getRequest() {
		return this.request;
	}
}
