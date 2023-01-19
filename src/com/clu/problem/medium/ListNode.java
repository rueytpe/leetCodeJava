package com.clu.problem.medium;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(String.valueOf(val));
		
		ListNode temp = next;
		while (temp != null) {
			sb.append("->").append(String.valueOf(temp.val));
			temp = temp.next;
		}

		return sb.toString();
		
	}
}
