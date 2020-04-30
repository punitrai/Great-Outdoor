package com.cg.go.junit;

import org.junit.Assert;

import org.junit.Test;

import com.cg.go.bean.Product;

public class ProductTesting {

	@Test
	public void Ptest() {
		String expected = "n1000";
		Product p = new Product();
		String actual = p.setProductID(expected);
		Assert.assertEquals(expected,actual);
	}

}
