package com.mak.reflection;

import java.lang.reflect.Field;

public class ReflectionTutField {

	public int numberOne = 10;
	public String stringOne = "My Value";

	public static void main(String[] args) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<?> aClass = ReflectionTutField.class;
		Field[] fields = aClass.getFields();
		System.out.println("fields size :" + fields.length);
		for (Field field : fields) {
			System.out.println("Field Type:" + field.getType()
					+ " Field Value:" + field.get(new ReflectionTutField()));
		}

		Field numberOneField = aClass.getField("numberOne");
		ReflectionTutField obj = new ReflectionTutField();

		System.out.println("Search from class : " + numberOneField
				+ " Current Value : " + numberOneField.get(obj));

		numberOneField.set(obj, 14);

		System.out.println("Search from class : " + numberOneField
				+ " Current Value : " + numberOneField.get(obj));

	}

}
