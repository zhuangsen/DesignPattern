package com.zs.facade;

public interface LetterProcess {
	//����Ҫд�ŵ�����
	public void writeContext(String context);
	
	//���д�ŷ�
	public void fillEnvelope(String address);
	
	//���ŷŵ��ŷ���
	public void letterInotoEnvelope();
	
	//Ȼ���ʵ�
	public void sendLetter();
}
