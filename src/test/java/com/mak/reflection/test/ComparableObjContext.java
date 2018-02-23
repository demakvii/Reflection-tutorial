package com.mak.reflection.test;

public class ComparableObjContext {

	private boolean isEqual;
	private Object greaterObj;
	private Object lesserObj;
	
	public ComparableObjContext(Object greaterObj, Object lesserObj, boolean isEqual) {

		this.greaterObj = greaterObj;
		this.lesserObj = lesserObj;
		this.isEqual = isEqual;
	}

	public boolean isEqual() {
		return isEqual;
	}

	public void setEqual(boolean isEqual) {
		this.isEqual = isEqual;
	}

	public Object getGreaterObj() {
		return greaterObj;
	}

	public void setGreaterObj(Object greaterObj) {
		this.greaterObj = greaterObj;
	}

	public Object getLesserObj() {
		return lesserObj;
	}

	public void setLesserObj(Object lesserObj) {
		this.lesserObj = lesserObj;
	}
	
	
}
