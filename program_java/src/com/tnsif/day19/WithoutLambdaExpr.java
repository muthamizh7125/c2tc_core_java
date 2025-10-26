package com.tnsif.day19;

public class WithoutLambdaExpr {
	 public static void main(String[] args) {  
	        
	    	//without lambda, 
	    	//Message implementation using anonymous class  
	     
	        IStatements s=new IStatements() {
	        	public String show()
	        	{
	        		return "Welcome to Lambda Expression";
	        	}};
	        	
	        	System.out.println(s.show());
	        
	        		
	       
	    }  
}
