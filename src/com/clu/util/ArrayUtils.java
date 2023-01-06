package com.clu.util;

public class ArrayUtils {
	
	public static String printArray(int nums[]) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i< nums.length -1; i++) {
			sb.append(nums[i]).append(",");
		}
		sb.append(nums[nums.length - 1]).append("]");
		return sb.toString();
	}

}
