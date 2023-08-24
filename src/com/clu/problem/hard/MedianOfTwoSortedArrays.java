package com.clu.problem.hard;

/**
 * Problem 4 (Hard)
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 *
 */
public class MedianOfTwoSortedArrays {


	/*
	 * This solution beat 45.71%, needs to be improved
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		double result = 0;
		int[] merged;
		
		if ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) {
			merged = new int[] {};
		} else if ((nums1 == null || nums1.length == 0) && nums2.length > 0) {
			merged = nums2;
		} else if ((nums2 == null || nums2.length == 0) && nums1.length > 0) {
			merged = nums1;
		} else {
			merged = new int[nums1.length + nums2.length];
			
			for (int i=0, j=0, k=0; i<nums1.length || j<nums2.length;) {
				if (nums1[i] > nums2[j]) {
					merged[k++] = nums2[ j++];
					if (j >= nums2.length) {
						while (i < nums1.length) {
							merged[k++] = nums1[i++];
						}
						break;
					}
				} else if (nums1[i] <= nums2[j]) {
					merged[k++] = nums1 [i++];
					if (i >= nums1.length) {
						while (j < nums2.length) {
							merged[k++] = nums2[j++];
						}
						break;
					}
				}
			}

		}
		
		int mid = merged.length/2;
		if (merged.length % 2 != 0) {
			result = merged[mid];
		} else {
			result = (double)(merged[mid]*0.5 + merged[mid - 1]*0.5);
		}
				

		
		return result;
	}
	
	public static void main(String[] args) {

		MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();


		int[] nums1;
		int[] nums2;
		
		nums1 = new int[]{ 1, 2 };
		nums2 = new int[]{ 3, 4};
		double result = solution.findMedianSortedArrays(nums1, nums2);

		System.out.println("result = " + result);
		

		nums1 = new int[]{ };
		nums2 = new int[]{1};
		result = solution.findMedianSortedArrays(nums1, nums2);

		System.out.println("result = " + result);
		
		
	}

}
