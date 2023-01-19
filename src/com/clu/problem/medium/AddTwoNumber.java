package com.clu.problem.medium;

/**
 * Problem 2
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * It has exceeded the max numbers in java
 */
public class AddTwoNumber {
	
	public static void main(String[] args) {
		AddTwoNumber solution = new AddTwoNumber();
		
		// Output: [7,0,8]
				
		ListNode x1 = new ListNode(3);
		ListNode x2 = new ListNode(4, x1);
		ListNode x3 = new ListNode(2, x2);
		
		ListNode y1 = new ListNode(4);
		ListNode y2 = new ListNode(6, y1);
		ListNode y3 = new ListNode(5, y2);
		
		ListNode xy = solution.addTwoNumbers(x3, y3);
		
		System.out.println("xy = " + xy);
		
/*		
		
		ListNode a1 = new ListNode(9);

		ListNode b1 = new ListNode(9);
		ListNode b2 = new ListNode(9, b1);
		ListNode b3 = new ListNode(9, b2);
		ListNode b4 = new ListNode(9, b3);
		ListNode b5 = new ListNode(9, b4);
		ListNode b6 = new ListNode(9, b5);
		ListNode b7 = new ListNode(9, b6);
		ListNode b8 = new ListNode(9, b7);
		ListNode b9 = new ListNode(9, b8);
		ListNode b10 = new ListNode(9, b9);
		
		ListNode ab = solution.addTwoNumbers(a1, b10);
		
		System.out.println("ab = "  + ab);
		
*/
	

		// Output: [0]
		ListNode c1 = new ListNode(0);
		ListNode d1 = new ListNode(0);
		ListNode cd = solution.addTwoNumbers(c1, d1);
		
		System.out.println("cd = " + cd);
		
		
		/*
         * Expected  [8,9,9,9,0,0,0,1]
		 */
		ListNode e1 = new ListNode(9);
		ListNode e2 = new ListNode(9, e1);
		ListNode e3 = new ListNode(9, e2);
		ListNode e4 = new ListNode(9, e3);
		ListNode e5 = new ListNode(9, e4);
		ListNode e6 = new ListNode(9, e5);
		ListNode e7 = new ListNode(9, e6);

		ListNode f1 = new ListNode(9);
		ListNode f2 = new ListNode(9, f1);
		ListNode f3 = new ListNode(9, f2);
		ListNode f4 = new ListNode(9, f3);

		ListNode ef = solution.addTwoNumbers(e7, f4);
		
		System.out.println("ef = "  + ef);
		
	}

	/**
	 * Need to be recursive to resolve this , but it will need improvement
	 * Runtime 140 ms Beats 5.14%
	 * Memory Beats 52.39%
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode result = null;
		
		result = addTwoNumbers(result, l1, l2, 0);
		
		return result;
		
	}
	
	public ListNode addTwoNumbers(ListNode result, ListNode l1, ListNode l2, int overflow) {
		if (result == null) {
			overflow = 0;
		}
		
		ListNode newL1 = (l1 == null) ? null: l1.next;
		ListNode newL2 = (l2 == null) ? null: l2.next;
		
		int l1Val = (l1 == null)?0:l1.val;
		int l2Val = (l2 == null)?0:l2.val;
		
		int total = l1Val + l2Val;
		
		int value = total + overflow;
		
		if (value >= 10) {
			overflow = 1;
			value = value % 10;
		} else {
			overflow = 0;
		}
		
		if (newL1 == null && newL2 == null && overflow == 0) {
			return new ListNode(value);
		} else if (newL1 == null && newL2 == null && overflow == 1) {
			return new ListNode(value, new ListNode(1));
		} else {
			return new ListNode(value, addTwoNumbers(new ListNode(value), newL1, newL2, overflow));
		}
			
	}

	/**
	 * this solution won't work if the number exceeded the java MAX_VALUE: 2147483647
	 * 
	 * 1565 / 1568 test cases passed
	 */
	public ListNode addTwoNumbers_v1(ListNode l1, ListNode l2) {
		
		long value1 = l1.val;
		long i = 10;
		while (l1.next != null) {
			l1 = l1.next;
			value1 = value1 + l1.val *i;
			i*=10;
			
		}
		long value2 = l2.val;
		
		i = 10;
		while (l2.next != null) {
			l2 = l2.next;
			value2 = value2 + l2.val * i;
			i*=10;
		}
		
		String str = String.valueOf(value1 + value2);
		
		ListNode result = null;
		for (int j=0; j<str.length(); j++) {
			String y = String.valueOf(str.charAt(j));
			int x = Integer.valueOf(y);
			
			if (result == null) {
				result = new ListNode(x);
			} else {
				result = new ListNode(x, result);
			}
			
			
		}
		return result;

	}

}
