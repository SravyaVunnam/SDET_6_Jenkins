package com.TESTNG.practice;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = {"smoke"})
	public void testAndroidapp() {
		System.out.println("testAndroidapp");

	}
	@Test(groups = {"sanity"})
	public void testWebapp() {
		System.out.println("testWebapp");
	}

	@Test(groups = {"regression"})
	public void testWebapp1() {
		System.out.println("testWebapp1");


	}

}
