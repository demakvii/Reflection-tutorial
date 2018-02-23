package com.mak.reflection;

import java.lang.annotation.Annotation;

public class ReflectionTutAnnotation {

	public static void main(String[] args) {
		Class<?> aClass = TheClass.class;
		Annotation[] annotations = aClass.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				System.out.println("name: " + myAnnotation.name() + " value: "
						+ myAnnotation.value());
			}
		}
	}

}
