package com.clu.problem.easy;

/**
 * Problem 14
 * 
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string
 *
 * 
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix solution = new LongestCommonPrefix();
		System.out.println("The response of [\"flower\",\"flow\",\"flight\"] is " + solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));

		System.out.println("The response of [\"dog\",\"racecar\",\"car\"] is " + solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));

		System.out.println("The response of [\"flower\",\"flower\",\"flower\",\"flower\"] is " + solution.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));


	}
	
    public String longestCommonPrefix(String[] strs) {
    	
    	if (strs == null) {
    		return "";
    	}
        
    	if (strs.length == 1) {
    		return strs[0];
    	}
    	
    	String str0 = strs[0];
    	String commonPrefix = "";
    	for (int i=1; i<=str0.length(); i++) {
    		String tempCommonPrefix = str0.substring(0, i);
        	for (int j = 1; j< strs.length; j++) {
        		if (strs[j].indexOf(tempCommonPrefix) != 0) {
        			return commonPrefix;
        		}
        		
        	}
        	commonPrefix = tempCommonPrefix;
    	}
    	
    	return commonPrefix;

    }

}
