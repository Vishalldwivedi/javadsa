public class lapmstap {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node3 = new ListNode();
        ListNode node = node3;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            }else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if(list1!=null){
            node.next  = list1;
        }
        if(list2!=null){
            node.next  = list2;
        }
        return node3.next;

    }
    public static void main(String[] args) {

ListNode node = new ListNode(1);
node.next = new ListNode(2);
node.next.next = new ListNode(4);

        ListNode node2 = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(4);

        ListNode ans = mergeTwoLists(node,node2);

while(ans!=null){
    System.out.println(ans.val);
    ans = ans.next;
}

    }
}
