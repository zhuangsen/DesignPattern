package com.zs.facade;

public class LetterProcessImpl implements LetterProcess {

	@Override
	public void fillEnvelope(String address) {
		System.out.println("��д�ռ��˵�ַ������..."+address);
	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("���ŷŵ��ŷ���...");
	}

	@Override
	public void sendLetter() {
		System.out.println("�ʵ��ż�....");
	}

	@Override
	public void writeContext(String context) {
		System.out.println("��д�ŵ�����..."+context);
	}

}
