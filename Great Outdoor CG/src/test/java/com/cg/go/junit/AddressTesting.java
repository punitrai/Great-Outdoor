package com.cg.go.junit;

import  org.junit.Assert;

import org.junit.Test;

import com.cg.go.bean.Address;

public class AddressTesting {

	@Test
	public void test1() {
		String expected  = "Kolkata";
		Address a = new Address();
		String actual = a.setCity(expected);
		Assert.assertEquals(expected,actual);
	
	}
	
	@Test
	public void test2() {
		String expected  = "West Bengal";
		Address a = new Address();
		String actual = a.setCity(expected);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		String expected  = "India";
		Address a = new Address();
		String actual = a.setCity(expected);
		Assert.assertEquals(expected,actual);
	}



}
