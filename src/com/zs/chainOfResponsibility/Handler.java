package com.zs.chainOfResponsibility;

public abstract class Handler {

	// �ܴ���ļ���
	private int level = 0;
	// ���δ��ݣ���һ������������˭
	private Handler nextHanlder;

	// ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����
	public Handler(int _level) {
		this.level = _level;
	}

	// һ��Ů�ԣ�Ů�������ӻ�����ĸ�ף�Ҫ���֣���Ҫ�����������
	public final void HandleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHanlder != null) { // �к������ڣ��Ű������������
				this.nextHanlder.HandleMessage(women);
			} else { // �Ѿ�û�к����������ˣ����ô�����
				System.out.println("-----------û�ط���ʾ�ˣ� �������� ---------\n");
			}
		}
	}

	/*
	 * ����������㴦��ķ��أ���Ӧ����������һ�����ڵ��ˣ����� Ů�������ˣ���������ʾ�Ƿ���Թ�֣��Ǹ��׾�Ӧ�ø���Ů����Ӧ�����ɷ���ʾ
	 */
	public void setNext(Handler _handler) {
		this.nextHanlder = _handler;
	}

	// ����ʾ�ǵ�ȻҪ��Ӧ
	public abstract void response(IWomen women);
}
