package com.mak.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTutConstructor {

	private int numberOne;
	private String stringOne;

	public ReflectionTutConstructor() {

	}

	public ReflectionTutConstructor(int numberOne) {
		this.numberOne = numberOne;
	}

	public ReflectionTutConstructor(String stringOne) {
		this.stringOne = stringOne;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Class<?> aClass = Class
				.forName("com.mak.reflection.ReflectionTutConstructor")/*
																		 * String.
																		 * class
																		 */;
		Constructor<?> newConstructor = ReflectionTutConstructor.class
				.getConstructor(String.class);
		ReflectionTutConstructor newObj = (ReflectionTutConstructor) newConstructor
				.newInstance("constructor-arg1");
		Constructor<?>[] constructors = aClass.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
			System.out.println(constructor.getParameterTypes());
		}

	}

}
