import java.util.ArrayList;

public class searchNodeinBST extends createBst {
    public static boolean search(node root, int val) {
        if (root == null) return false;
        if (root.data == val) {
            return true;
        }
        if (root.data > val) {
            return search(root.left, val);
        } else {
           return  search(root.right, val);
        }
    }
    public static void main(String[] args) {
        int[] arr= {10,13, 4, 8,11, 19, 2,7, 18,23};
        node root = null;
        for(int i = 0 ; i < arr.length ;i++){
            root = bst(root,  arr[i]);
        }
        ArrayList<Integer> al = inorder(root);
        for(int i : al ){
            System.out.println(i + " ");
        }
        boolean a = search(root, 199);
        System.out.println(a);
    }
}
