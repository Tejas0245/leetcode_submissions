/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

      for (ListNode list : lists){
        if(list!=null){
        pq.add(list); //adding head of each sub linkedlist
        }
      } 

      ListNode head= new ListNode(0); //for mergelist (to return)
      ListNode curr = head;         //to traverse through the merged list
 
      while(!pq.isEmpty()){
        ListNode node = pq.poll();  //head of the node with the smallest value
        curr.next = node;      //join the node to merged linkedlist
        curr = curr.next;      //traverse curr to next node
        if(node.next != null){
            pq.add(node.next);   //add the next node of the current shortest head
        }
      }
      return head.next;

    }
}