package com.zs.facade;

public class ModenPostOffice {

	private LetterProcess letterProcess = new LetterProcessImpl();
	private Police letterPolice = new Police();
	
	
	//д�ţ���װ��Ͷ�ݣ�һ�廯��
	public void sendLetter(String context,String address){
		//����д��
		letterProcess.writeContext(context);
		
		//д���ŷ�
		letterProcess.fillEnvelope(address);
		
		//����Ҫ����ż���
		letterPolice.checkLetter(letterProcess);
		
		//���ŷŵ��ŷ���
		letterProcess.letterInotoEnvelope();
		
		//�ʵ��ż�
		letterProcess.sendLetter();
	}
}
