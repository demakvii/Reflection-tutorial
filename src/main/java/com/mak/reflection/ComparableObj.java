package com.mak.reflection;

import java.util.List;

import com.mak.reflection.test.ComparableObjContext;

public class ComparableObj implements ComparableObjConstant, IComparable {

	private Object obj;
	private boolean isEqual;
	private List<Object> ignoreList;

	public ComparableObj(Object obj, List<Object> ignoreList) {

		this.obj = obj;
		this.ignoreList = ignoreList;
		this.isEqual = false;
	}

	public ComparableObj(Object obj, List<Object> ignoreList, boolean isEqual) {

		this.obj = obj;
		this.ignoreList = ignoreList;
		this.isEqual = isEqual;
	}

	public String typeOfObject(Object obj) {
		if (obj instanceof Integer)
			return INTEGER_OBJ;
		if (obj instanceof Double)
			return WDOUBLE_OBJ;
		if (obj instanceof Float)
			return WFLOAT_OBJ;
		if (obj instanceof List) {
			return LIST_OBJ;
		}
		if (obj instanceof String)
			return STRING_OBJ;
		if (obj instanceof Object)
			return OBJECT_OBJ;

		return UNDEFINED_OBJ;

	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isEqual() {
		return isEqual;
	}

	public void setEqual(boolean isEqual) {
		this.isEqual = isEqual;
	}

	public List<Object> getIgnoreList() {
		return ignoreList;
	}

	public void setIgnoreList(List<Object> ignoreList) {
		this.ignoreList = ignoreList;
	}

	@Override
	public ComparableObjContext compareObject(Object object) {
		if (this.obj == null && object == null)
			return new ComparableObjContext(null, null, true);
		if (this.obj != null && object == null)
			return new ComparableObjContext(this.obj, null, false);
		if (this.obj == null && object != null)
			return new ComparableObjContext(object, null, false);
		
		return new ComparableObjContext(this.obj, object, true);
	}
}
