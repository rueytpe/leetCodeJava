package com.clu.problem.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem 13
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 For example, 2 is written
 * as II in Roman numeral, just two ones added together. 12 is written as XII,
 * which is simply X + II. The number 27 is written as XXVII, which is XX + V +
 * II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. X can be placed
 * before L (50) and C (100) to make 40 and 90. C can be placed before D (500)
 * and M (1000) to make 400 and 900. Given a roman numeral, convert it to an
 * integer.
 *
 * 
 * 
 * 
 */
public class RomanToInteger {
	
	public static void main(String[] args) {
		RomanToInteger solution = new RomanToInteger();
		System.out.println("MCM = " + solution.romanToInt("MCM"));
		System.out.println("MCD = " + solution.romanToInt("MCD"));
		System.out.println("III = " + solution.romanToInt("III"));
		System.out.println("XL = " + solution.romanToInt("XL"));
		System.out.println("XC = " + solution.romanToInt("XC"));
		System.out.println("XXX = " + solution.romanToInt("XXX"));
		System.out.println("IV = " + solution.romanToInt("IV"));
		System.out.println("IX = " + solution.romanToInt("IX"));
		System.out.println("LVIII = " + solution.romanToInt("LVIII"));
		System.out.println("MCMXCIV = " + solution.romanToInt("MCMXCIV"));
		System.out.println("DCXXI = " + solution.romanToInt("DCXXI"));
		System.out.println("MMMCC = " + solution.romanToInt("MMMCC"));
		
	}

    public int romanToInt(String roman) {
    	if (roman == null || roman.length() < 1 || roman.length() > 15) {
    		throw new RuntimeException("the input length must be <=1 and >= 15");
    	}
    	Pattern pattern = Pattern.compile("[IVXLCDM]*");
    	
    	Matcher matcher = pattern.matcher(roman);
    	if(!matcher.matches()) {
    		throw new RuntimeException("only allow characters: ('I', 'V', 'X', 'L', 'C', 'D', 'M')");
    		
    	}
    	
        int sum = 0;
        
        for (int i=0; i<roman.length(); i++) {
        	char c = roman.charAt(i);
        	if ('M' == c && i >= 1 && 'C' == roman.charAt(i-1)) {
        		sum += 900;
        	} else if ('D' == c && i >= 1 && 'C' == roman.charAt(i-1)) {
        		sum += 400;
        	} else if ('M' == c) {
        		sum += 1000;
        	} else if ('V' == c && i >= 1 && 'I' == roman.charAt(i-1)) {
        		sum += 4;
        	} else if ('X' == c && i >= 1 && 'I' == roman.charAt(i-1)) {
        		sum += 9;
        	} else if ('V' == c) {
        		sum += 5;
        	} else if ('L' == c && i >= 1 && 'X' == roman.charAt(i-1)) {
        		sum += 40;
        	} else if ('C' == c && i >= 1 && 'X' == roman.charAt(i-1)) {
        		sum += 90;
        	} else if ('L' == c) {
        		sum += 50;
        	} else if ('X' == c && (i == roman.length() -1 || (i < roman.length() - 1 && 'L' != roman.charAt(i+1) && 'C' != roman.charAt(i+1))) ) {
        		sum += 10;
        	} else if ('I' == c && roman.length() > i + 1 && 'X' != roman.charAt(i+1)  && 'V' != roman.charAt(i+1)) {
        		sum += 1;
        	} else if ('I' == c && i == roman.length() - 1) {
        		sum += 1;
        	} else if ('D' == c) {
        		sum += 500;
        	} else if ('C' == c && roman.length() > i + 1 && 'D' != roman.charAt(i+1) && 'M' != roman.charAt(i+1)) {
        		sum += 100;
        	} else if ('C' == c && roman.length() == i + 1 ) {
        		sum += 100;
        	}
        }
        
        
        return sum;
    }
    

}
