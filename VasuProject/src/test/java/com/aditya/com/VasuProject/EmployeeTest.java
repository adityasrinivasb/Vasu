package com.aditya.com.VasuProject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class EmployeeTest {
	
	Employee e;
	
	@Test
	public void testName() {
		e = new Employee();
		e.setName("Srinivas");
		Assert.assertEquals("Srinivas", e.getName());
	}
}