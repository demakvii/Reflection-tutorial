package com.mak.reflection;

import java.lang.reflect.Method;

public class ReflectionTutGetSet {

	private int intOne;
	private String stringOne;

	public static void main(String[] args) {
		Class<?> aClass = ReflectionTutGetSet.class;
		Method[] methods = aClass.getMethods();
		for (Method method : methods) {
			if (isGetter(method))
				System.out.println("getter: " + method);
			else if (isSetter(method))
				System.out.println("Setter: " + method);
		}
	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getParameterCount() != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterCount() != 1)
			return false;
		if (!void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	public String getStringOne() {
		return stringOne;
	}

	public void setStringOne(String stringOne) {
		this.stringOne = stringOne;
	}

	public int getIntOne() {
		return intOne;
	}

	public void setIntOne(int intOne) {
		this.intOne = intOne;
	}

}
