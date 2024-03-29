package com.clu.problem.easy;

import java.util.HashMap;
import java.util.Map;

import com.clu.util.ArrayUtils;

/**
 * Problem 1
 * Two Sum (Easy)
 * 
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 */
public class TwoSum {

	public static void main(String[] args) {
		String test = "test";
		System.out.println(test.charAt(1) == 'e');

		TwoSum solution = new TwoSum();
		System.out.println("response1 = " + ArrayUtils.printArray(solution.twoSum(new int[] { 2, 7, 11, 15 }, 9)));

		System.out.println("response1 = " + ArrayUtils.printArray(solution.twoSum(new int[] { 3, 2, 4 }, 6)));

		System.out.println("response1 = " + ArrayUtils.printArray(solution.twoSum(new int[] { 3, 3}, 6)));

	}

	/*
	 * Improved solution
	 * 
	 * Runtime beat 99.47%, Memory beat 53.98%
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = null;
		if (nums == null || nums.length <= 1) {
			return result;
		}
		Map<Integer, Integer> numMap = new HashMap<>();
		numMap.put(nums[0],0);
		for (int i = 1; i < nums.length; i++) {
			Integer firstNumber = numMap.get(target - nums[i]);
			if (firstNumber == null) {
				numMap.put(nums[i], i);
				continue;
			} else {
				result = new int[]{firstNumber, i};
				return result;
			}
		}
		return result;
	}
	
	public int[] twoSum_v1(int[] nums, int target) {
		if (nums == null || nums.length <= 1) {
			return null;
		}
		for (int i = 0; i < nums.length; i++) {
			int numberi = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int numberj = nums[j];
				if (numberi + numberj == target) {
					return new int[] { i, j };
				}
			}

		}
		return null;
	}
}
