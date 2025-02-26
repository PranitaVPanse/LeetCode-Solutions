package easy;

public class mergeTwoSortedLists {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	ListNode list1 = new ListNode(1);
			list1.next = new ListNode(2);
			list1.next.next = new ListNode(4);
			
			ListNode list2 = new ListNode(1);
			list2.next = new ListNode(3);
			list2.next.next = new ListNode(4);
			
			ListNode result = mergeTwoLists(list1, list2);

			ListNode temp = result;
			while(temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			
	}

	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// TODO Auto-generated method stub
		
			//create a new list as output
		ListNode output = new ListNode(0);
		ListNode last = output;
		
		while(list1 != null && list2 != null) {
			if(list1.val > list2.val) {
				last.next = list2;			//assign list2 value
				list2 = list2.next;			//iterate list2
			} else {
				last.next = list1;			//assign list1 value
				list1 = list1.next;			//iterate list1
			}
			last = last.next;				//iterate last
		}
		
		last.next = list1 == null ? list2 : list1;			//if list1 is null assign last.next as list2, otherwise assign it as list1
		return output;
	}

}


/*Leet code Problem statement

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.*/
