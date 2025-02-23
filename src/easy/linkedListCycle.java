package easy;

public class linkedListCycle {

	public static void main(String[] args) {


		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		head.next = second;
		second.next = third;
		third.next = fourth;
		//fourth.next = second;

		boolean output = hasCycle(head);
		System.out.println("Output: " +output);
	}

	private static boolean hasCycle(ListNode head) {

		if(head == null) {
			return false;
		}

		ListNode slow = head;
		ListNode fast = head.next;

		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}

			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node. */

/* Floyd's Hare and tortoise theorem
 * 
 * Hare and tortoise start the race
 * As Hare is faster that tortoise it jumps two nodes (fast.next.next)
 * As Tortoise is slow it jumps only one node (slow.next)
 * 
 * if ( tortoise and hare are in the same position)
 * 		there is a loop
 * else
 * 		there is no loop
 * 
 */
