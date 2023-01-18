package com.clu.problem.medium;

/**
 * Problem 12
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * XL            40
 * L             50
 * XC            90
 * C             100
 * CD            400
 * D             500
 * CM            900
 * M             1000
 *
 */
public class IntegerToRoman {
	
	public static void main(String[] args) {
		IntegerToRoman solution = new IntegerToRoman();
		int num = 1994;
		System.out.println("test " + num + " =" + solution.intToRoman(num) );
		num = 58;
		System.out.println("test " + num + " =" + solution.intToRoman(num) );
		num = 3;
		System.out.println("test " + num + " =" + solution.intToRoman(num) );
	}
	
    public String intToRoman(int num) {
    	if (num <= 0) {
    		return "";
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int numM = num/1000;
    	
    	for (int i=0; i<numM; i++) {
    		sb.append("M");
    	}
    	
    	int remaining = num%1000;
  //  	System.out.println("remaining 1 = " + remaining);
    	
    	// CM = 900
    	int numCM = remaining/900;
    	remaining = remaining%900;
 //   	System.out.println("remaining 2 = " + remaining);
    	
    	for (int i=0; i<numCM; i++) {
    		sb.append("CM");
    	}
    	
    	// D = 500
    	int numD = remaining/500;
    	remaining = remaining%500;
//    	System.out.println("remaining  3 = " + remaining);
    	
    	for (int i=0; i<numD; i++) {
    		sb.append("D");
    	}
    	
    	
    	// CD = 400
    	int numCD = remaining/400;
    	remaining = remaining%400;
//    	System.out.println("remaining  4 = " + remaining);
    	
    	for (int i=0; i<numCD; i++) {
    		sb.append("CD");
    	}
    	
    	// C = 100
    	int numC = remaining/100;
    	remaining = remaining%100;
//    	System.out.println("remaining  5 = " + remaining);
    	
    	for (int i=0; i<numC; i++) {
    		sb.append("C");
    	}
    	
    	// XC = 90
    	int numXC = remaining/90;
    	remaining = remaining%90;
 //   	System.out.println("remaining  6 = " + remaining);
    	
    	for (int i=0; i<numXC; i++) {
    		sb.append("XC");
    	}
    	
    	
    	// L = 50
    	int numL = remaining/50;
    	remaining = remaining%50;
//    	System.out.println("remaining  7 = " + remaining);
    	
    	for (int i=0; i<numL; i++) {
    		sb.append("L");
    	}
    	
    	// XL = 40
    	int numXL = remaining/40;
    	remaining = remaining%40;
//    	System.out.println("remaining  8 = " + remaining);
    	
    	for (int i=0; i<numXL; i++) {
    		sb.append("XL");
    	}
    	
    	
    	// X = 10
    	int numX = remaining/10;
    	remaining = remaining%10;
//    	System.out.println("remaining  9 = " + remaining);
    	
    	for (int i=0; i<numX; i++) {
    		sb.append("X");
    	}
    	
    	// IX = 9
    	int numIX = remaining/9;
    	remaining = remaining%9;
//    	System.out.println("remaining  10 = " + remaining);
    	
    	for (int i=0; i<numIX; i++) {
    		sb.append("IX");
    	}
    	
    	
    	// V = 5
    	int numV = remaining/5;
    	remaining = remaining%5;
//    	System.out.println("remaining  11 = " + remaining);
    	
    	for (int i=0; i<numV; i++) {
    		sb.append("V");
    	}
    	
    	
    	
    	// IV = 4
    	int numIV = remaining/4;
    	remaining = remaining%4;
//    	System.out.println("remaining  12 = " + remaining);
    	
    	for (int i=0; i<numIV; i++) {
    		sb.append("IV");
    	}
    	
    	for (int i=0; i<remaining; i++) {
    		sb.append("I");
    	}
    	
    	
    	
    	return sb.toString();
        
    }
}
