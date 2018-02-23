package com.mak.reflection;

/**
 * @author Mayur Kalekar
 *
 */
public class PrivateObject {

	private int obj = 0;

	/**
	 * @param obj
	 */
	public PrivateObject(int obj) {
		this.obj = obj;
	}

	/**
	 * @param newObj
	 * @return
	 */
	private int thisIsAPrivateMethod(int newObj) {
		return this.obj + newObj;
	}
}
