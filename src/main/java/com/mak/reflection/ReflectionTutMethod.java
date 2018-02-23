package com.mak.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTutMethod {

	public String someMethodInClass(String param) {
		return param;
	}

	public static String someStaticMethodInClass(String param) {
		return param;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class<?> aClass = Class
				.forName("com.mak.reflection.ReflectionTutMethod");
		Method[] methods = aClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		Method method = aClass.getDeclaredMethod("someMethodInClass",
				new Class[] { String.class });
		System.out.println(method);

		Method method1 = aClass.getDeclaredMethod("someStaticMethodInClass",
				new Class[] { String.class });

		// Invoking
		ReflectionTutMethod obj = new ReflectionTutMethod();
		Object returnValue = method.invoke(obj, "Yes");
		System.out.println("Value returned from someMethodInClass : "
				+ returnValue);
		System.out.println("Value returned from someStaticMethodInClass : "
				+ method1.invoke(null, "Yes Static"));

	}

}
