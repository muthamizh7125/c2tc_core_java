package com.tnsif.day19;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		
		IStatements s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}
