package com.clu.problem.easy;

public class MergeAlternately {
	
	public static void main(String[] args) {
		MergeAlternately solution = new MergeAlternately();
		System.out.println("The response of [\"abc\",\"pqr\"] is " + solution.mergeAlternately("abc", "pqr"));
		System.out.println("The response of [\"ab\",\"pqrs\"] is " + solution.mergeAlternately("ab", "pqrs"));

		System.out.println("The response of [\"abcd\",\"pq\"] is " + solution.mergeAlternately("abcd", "pq"));

	}
	
    public String mergeAlternately(String word1, String word2) {
    	
    	StringBuilder  sb = new StringBuilder();
    	
    	int length = word1.length() <= word2.length() ? word1.length(): word2.length();
    	
		for (int i = 0; i< length; i++) {
			sb.append(word1.charAt(i)).append(word2.charAt(i));
		}
		
    	if (word1.length() > length) {
    		sb.append(word1.substring(length));
    	} else {
    		sb.append(word2.substring(length));
    	}
    	
    	return sb.toString();

    }
}
