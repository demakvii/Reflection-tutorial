package com.mak.reflection;

import java.util.Arrays;
import java.util.List;

public class GenericMyClass {

	protected List<String> stringList = Arrays.asList("abc","bcd");
	
	public List<String> getStringList() {
		return this.stringList;
	}
}
