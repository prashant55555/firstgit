package com.qa.test;

import java.io.IOException;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try{
			int x=2;
		
		int y=0;
		System.out.println("1st one"+x/y);
		System.out.println("2st one");
	}
		catch(Exception ae){
			System.out.println("Exception handling");
		}
		System.out.println("2st one");}

}
