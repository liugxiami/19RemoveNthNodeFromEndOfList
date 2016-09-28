package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    ListNode root=buildLinkList();
        ListNode res=removeNthFromEnd(root,3);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
    //Given a linked list,remove the nth node from the end of list and return its head.
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode p=head;
        ListNode q=head;                    //two pointers
        for (int i = 1; i <= n; i++) {
            q=q.next;                       //前指针走n步
        }
        while(q.next!=null){                //前后指针同步走
            q=q.next;
            p=p.next;
        }
        p.next=p.next.next;                 //后指针的next指向next.next
        return head;
    }
    public static ListNode buildLinkList(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        return head;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
