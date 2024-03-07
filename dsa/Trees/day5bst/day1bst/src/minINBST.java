import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class minINBST extends createBst{
    public static void main(String[] args) {
        int[] arr= {10,13, 4, 8,11, 19, 2,7, 18,23};
        node root = null;
        for(int i = 0 ; i < arr.length ;i++){
            root = bst(root,  arr[i]);
        }
        // bt inorder is in ascending order l n r

        ArrayList<Integer> al = inorder(root);
        int ans = min(root);
        System.out.println(ans);
        int an = kthLargest(root,1 );
        System.out.println(an);
       node roott =  insertNodeBst(root, 33);
       ArrayList<Integer> all = inorder(roott);
        System.out.println(all.getLast());
    }
    public static int min(node root){
        if(root== null) return -1;

        if(root.left ==null){
           return root.data;
        }
        return min(root.left);

    }
    public static int kthLargest(node root, int k){
        ArrayList<Integer> al = inorder(root);
        ListIterator<Integer> lst = al.listIterator(al.size()); // start from the end of the list
        while (lst.hasPrevious() && k > 0) {
            int currentElement = lst.previous();
            k--;
            if (k == 0) {
                // Print or return the kth largest element
                // System.out.println(currentElement);
                return currentElement;
            }
        }
        // Handle the case where k is greater than the number of elements in the BST
        return -1;
    }
    public static node insertNodeBst(node root, int val){
        if(root == null){
            node neww = new node(val);
            return neww;
        }
        if(root.data > val){
            root.left = insertNodeBst(root.left, val);
        }else{
            root.right = insertNodeBst(root.right,val);
        }
        return root;
    }
}
