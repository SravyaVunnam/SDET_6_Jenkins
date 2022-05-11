package com.TESTNG.practice;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = {"smoke"})
	public void testIOSapp() {
		System.out.println("testIOSapp");

	}
	@Test(groups = {"regression"})
	public void testdesktopapp() {
		System.out.println("testdesktopapp");
		
	}

}
