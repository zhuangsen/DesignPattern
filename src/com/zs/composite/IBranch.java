package com.zs.composite;

import java.util.ArrayList;

public interface IBranch {

	//获得信息
	public String getInfo();
	
//	//增加数据节点，例如研发部下的研发一组
//	public void add(IBranch branch);
//	
//	//增加叶子节点
//	public void add(ILeaf leaf);
	
	//能够增加小兵（树叶节点）或者是经理（树枝节点）
	public void addSubordinate(ICorp corp);
	
	//获得下级信息
	public ArrayList<ICorp> getSubordinateInfo();
	
}