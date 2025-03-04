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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 ==null) return list2;
        if(list2==null) return list1;
        ListNode temp=null;//initially it will be null or 1 node
        ListNode res=null;//to keep track the res
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){//comparing two lists
            if(temp==null){
                  temp=list1;
                  res=temp;//here it will return res if it one node
            }
            else{
                temp.next=list1;
                temp=temp.next;
            }
            list1=list1.next;
        }
        else{
            if(temp==null){
                temp=list2;
                res=temp;
            }
            else{
                temp.next=list2;
                temp=temp.next;
            }
            list2=list2.next;
        }
        }

        while(list1 != null){// if list 1 is not null then add remaining all elements
           temp.next=list1;//add the list1  
           temp=temp.next;//move it
           list1=list1.next;//mov the list
        }
        while(list2 != null){
            temp.next=list2;
            temp=temp.next;
            list2=list2.next;
        }//here any one while will be executed if it null 
        return res;//here we return res head which will carry the remaining elements
    }
}