package com.tnsif.day_4.secondpackage;
import day_4.firstpackage.Base;
public class Executor {
	public static void main(String[] args) 
		Base b1 = new Base();
		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}