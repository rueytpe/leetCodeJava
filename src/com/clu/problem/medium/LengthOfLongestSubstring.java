package com.clu.problem.medium;

/**
 * Problem 3
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 */
public class LengthOfLongestSubstring {

	public LengthOfLongestSubstring() {

	}

	public static void main(String[] args) {
		
		LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
		
		String inputString = "";
	

		int result = solution.lengthOfLongestSubstring(inputString);

		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);


	
		inputString = "bbbbb";
		
		result = solution.lengthOfLongestSubstring(inputString);
		
		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);
		
		
		
		inputString = "abcabcbb";
		
		result = solution.lengthOfLongestSubstring(inputString);
		
		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);


		
		
		inputString = null;
		
		result = solution.lengthOfLongestSubstring(inputString);
		
		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);


		inputString = " ";
		
		result = solution.lengthOfLongestSubstring(inputString);
		
		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);



	    inputString = "pwwkew";
		
		result = solution.lengthOfLongestSubstring(inputString);
		
		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);


		inputString = "dvdf";
		
		result = solution.lengthOfLongestSubstring(inputString);
		
		System.out.println("inputString = \""  + inputString + "\", lengthOfLongestSubstring = " + result);



	}

	
	/**
	 * This soluton beat 5%
	 */
    public int lengthOfLongestSubstring(String s) {
    	
    	int result = 0;
   
    	if (s == null || s.length() == 0) {
    		return 0;
    	}

    	int firstIndex = 0;

    	String currLongest = "";
    	String currRead = "";

    	String newSubString = "";
    	int i = 0;
    	while (i < s.length()) {
    		String letter = s.substring(i, i+1);
    		if (newSubString.indexOf(letter) >= 0) {
    			firstIndex++ ;
    			i = firstIndex;
    			newSubString = s.substring(i, i+1);
    			currRead = s.substring(i, i+1);
    			i++;
    		} else {
    			currRead = currRead + letter;
    			newSubString = s.substring(firstIndex, ++i);
    		}

			currLongest = (newSubString.length() > currLongest.length()) ? newSubString:currLongest;
			

    	}
        
    	result = currLongest.length();
    	System.out.print("currLongest = " + currLongest + ", ");
    	return result;
    }
}
