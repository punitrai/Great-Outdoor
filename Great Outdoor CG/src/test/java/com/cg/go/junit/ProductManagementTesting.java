package com.cg.go.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cg.go.bean.ProductManagementSystem;

public class ProductManagementTesting {
ProductManagementSystem p=new ProductManagementSystem();
	@Test
	public void test1() {
		String expected="A100";
		String actual=p.setProductId(expected);
		assertEquals(expected,actual);
		}
	
	@Test
	public void test2() {
		String expected="Iphone";
		String actual=p.setProductName(expected);
		assertEquals(expected,actual);
	}
	@Test
	public void test3() {
		int expected=100;
		int actual=p.setQuantity(100);
		assertEquals(expected,actual);
		}
	@Test
   public void test4() {
	   Object expected=15000.5;
	   Object actual=p.setPrice((double) expected);
	   assertEquals(expected,actual);
   }
	@Test
	public void test5() {
		String expected="blue";
		String actual=p.setColour(expected);
		assertEquals(expected,actual);
		
	}
	@Test
	public void test6() {
		String expected="Adidas";
		String actual=p.setManufacturer(expected);
		assertEquals(expected,actual);
	}
	@Test
	public void test7() {
		int expected=2;
		int actual=p.setProductCategory(expected);
		assertEquals(expected,actual);
	}
}

