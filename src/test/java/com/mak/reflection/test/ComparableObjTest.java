package com.mak.reflection.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.mak.reflection.ComparableObj;
import com.mak.reflection.ComparableObjConstant;
import com.mak.reflection.CustomObject;

public class ComparableObjTest implements ComparableObjConstant {


	@Test
	public void testTypeOfObject() {
		Object obj = new Integer(2);
		ComparableObj comparableObj = new ComparableObj(null, null);
		assertThat(comparableObj.typeOfObject(obj), is(INTEGER_OBJ));
	}

	@Test
	public void testCompareObject() throws Exception {
		CustomObject obj1 = new CustomObject("mayur", 12);
		CustomObject obj2 = new CustomObject("mayur", 12);
		ComparableObj comparableObj = new ComparableObj(obj1, null);
		ComparableObjContext resultObj = comparableObj.compareObject(obj2);
		if(!resultObj.isEqual()){
			
		}
	}

}
