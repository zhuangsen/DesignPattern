package com.zs.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		
		baseInfoMap.put("userName", "���Ա��������...");
		baseInfoMap.put("mobileNumber", "���Ա���ĵ绰��...");
		
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		
		homeInfo.put("homeTelNumber", "Ա���ļ�ͥ�绰��...");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��...");
		
		return homeInfo;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		
		officeInfo.put("jobPosition", "����˵�ְλ��...");
		officeInfo.put("officeTelNumber", "Ա���İ칫�绰��...");
		
		return officeInfo;
	}

}
