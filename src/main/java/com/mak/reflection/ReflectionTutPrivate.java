package com.mak.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTutPrivate {

	/**
	 * @param args
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 */
	public static void main(String args[]) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException,
			InvocationTargetException {
		PrivateObject obj = new PrivateObject(1);
		Field field = PrivateObject.class.getDeclaredField("obj");
		field.setAccessible(true);
		System.out.println(field.get(obj));
		field.set(obj, 2);
		System.out.println(field.get(obj));

		Method[] methods = PrivateObject.class.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		Method method = PrivateObject.class.getDeclaredMethod(
				"thisIsAPrivateMethod", new Class[] { int.class });
		method.setAccessible(true);
		System.out.println("Private method invoke : " + method.invoke(obj, 12));
	}
}
