package easy;

public class reverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		head.next = second;
		second.next = third;
		third.next = fourth;
		//fourth.next = second;

		ListNode output = reverseList(head);

		//Print
		ListNode temp = output;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		
		
	}
	
	public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

}
