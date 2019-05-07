package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.OpenBrowser;

//import Helper.OpenBrowser;

public class Demo {
	@Test
	public void login() throws Exception{
		OpenBrowser.startbrowser("FireFox", "https://www.google.com");
		}
	
	
	
	/*public void sum(){
	int a = 10;
	int b = 22;
	Assert.assertEquals(32, a+b);
	System.out.println("sum");
	}
	public void sum1(){
		int a = 10;
		int b = 22;
		Assert.assertEquals(32, a+b);
		System.out.println("sum");
		}
	public void sum2(){
		int a = 10;
		int b = 21;
		Assert.assertEquals(32, a+b);
		System.out.println("sum");
		}
	public void sum3(){
		int a = 10;
		int b = 28;
		Assert.assertEquals(38, a+b);
		System.out.println("sum");*/
		}


