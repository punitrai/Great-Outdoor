package com.cg.go.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.go.bean.ProductMaster;

public class ProductmasterTest {
	
	ProductMaster pro = new ProductMaster();
@Test
public void test1(){
	String expected="qwerty123";
	String actual=pro.setUsername(expected);
	assertEquals(expected,actual);
	
}
@Test
public void test2(){
	String expected="qwerty123@";
	String actual=pro.setPassword(expected);
	assertEquals(expected,actual);
	
}
@Test
public void test3(){
	String expected="abcd@gmail.com";
	String actual=pro.setEmail(expected);
	assertEquals(expected,actual);
	
}
@Test
public void test4(){
	long expected=12345456;
	long actual=pro.setPhNum(expected);
	assertEquals(expected,actual);
	
}
}
