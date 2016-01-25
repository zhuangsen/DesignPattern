package com.zs.factoryMethod;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {

	//给一个接口，返回这个接口的所有实现类
	public static List<Class> getAllClassByInterface(Class c){
		
		//返回结果
		List<Class> returnClassList = new ArrayList<Class>();
		//如果不是接口，则不做处理
		if(c.isInterface()){
			//获得当前包名
			String packageName = c.getPackage().getName();
//			System.out.println(packageName);
			
			//获得当前包下以及包下的所有的类
			List<Class> allClass = getClasses(packageName);
//			System.out.println(allClass.size());
			//判断是否是同一接口
			for(int i =0; i<allClass.size();i++){
				
//				System.out.println(allClass.get(i).getName());
				//判断是不是一个接口
				if(c.isAssignableFrom(allClass.get(i))){
					//本身不加进去
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
	 * 从一个包中查找出所有的类，在jar包中不能查找
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
