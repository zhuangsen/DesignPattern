package com.zs.factoryMethod;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {

	//��һ���ӿڣ���������ӿڵ�����ʵ����
	public static List<Class> getAllClassByInterface(Class c){
		
		//���ؽ��
		List<Class> returnClassList = new ArrayList<Class>();
		//������ǽӿڣ���������
		if(c.isInterface()){
			//��õ�ǰ����
			String packageName = c.getPackage().getName();
//			System.out.println(packageName);
			
			//��õ�ǰ�����Լ����µ����е���
			List<Class> allClass = getClasses(packageName);
//			System.out.println(allClass.size());
			//�ж��Ƿ���ͬһ�ӿ�
			for(int i =0; i<allClass.size();i++){
				
//				System.out.println(allClass.get(i).getName());
				//�ж��ǲ���һ���ӿ�
				if(c.isAssignableFrom(allClass.get(i))){
					//�����ӽ�ȥ
					if(!c.equals(allClass.get(i))){
						returnClassList.add(allClass.get(i));
					}
				}
			}
		}
		//System.out.println(returnClassList);
		return returnClassList;
	}
	
	/**
	 * ��һ�����в��ҳ����е��࣬��jar���в��ܲ���
	 * @param packageName
	 * @return
	 */
	private static List<Class> getClasses(String packageName){
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//		System.out.println(classLoader.getClass().getName());
		String path = packageName.replace('.', '/');
//		System.out.println(path);
		Enumeration<URL> resources = null;
		try {
			resources = classLoader.getResources(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<File> dirs = new ArrayList<File>();
		while(resources.hasMoreElements()){
			URL resource = resources.nextElement();
			System.out.println(resource.getFile()+"\n"+resource.getPath());
			dirs.add(new File(resource.getFile()));
		}
		
		ArrayList<Class> classes = new ArrayList<Class>();
		for(File directory : dirs){
			classes.addAll(findClasses(directory,packageName));
		}
//		System.out.println(classes);
		return classes;
	}
	
	/**
	 * 
	 * @param directory
	 * @param packageName
	 * @return
	 */
	private static List<Class> findClasses(File directory,String packageName){
		List<Class> classes = new ArrayList<Class>();
		if(!directory.exists()){
			return classes;
		}
		File[] files = directory.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				assert !file.getName().contains(".");
				System.out.println(file.getName());
				classes.addAll(findClasses(file, packageName+"."+file.getName()));
			}else if(file.getName().endsWith(".class")){
				try {
					Class clazz = Class.forName(packageName+"."+file.getName().substring(0,file.getName().length()-6));
					classes.add(clazz);
					System.out.println(clazz.getName());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
//		System.out.println(classes);
		return classes;
	}
}
