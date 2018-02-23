package com.mak.reflection;

import java.lang.reflect.Method;

/**
 * @author Mayur Kalekar
 *
 */
public class ReflectionTut1 {

	private String name;

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Method[] methods = Object.class.getMethods();

		for (Method method : methods) {
			System.out.println("Method : " + method.getName());
		}
		System.out.println("------------------");
		try {
			Class<?> className = Class
					.forName("com.mak.reflection.ReflectionTut1");
			Method[] methods1 = className.getMethods();
			System.out.println(className.getModifiers());
			Package packageName = className.getPackage();
			System.out.println("Package name : " + packageName);
			System.out.println("Super Class : " + className.getSuperclass());
			System.out.println("Interface : " + className.getInterfaces());
			for (Method method : methods1) {
				System.out.println("Method by class name: " + method.getName());
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
