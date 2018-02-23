package com.mak.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectionTutGenerics {

	public static void main(String args[]) throws NoSuchMethodException,
			SecurityException {
		Method method = GenericMyClass.class.getMethod("getStringList", null);
		Type returnType = method.getReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			Type[] typeArguments = type.getActualTypeArguments();
			for (Type type2 : typeArguments) {
				Class typeArgClass = (Class) type2;
				System.out.println(" typeArgClass = " + typeArgClass);
			}
		}
	}
}
