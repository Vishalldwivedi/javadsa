import java.lang.reflect.Array;
import java.util.ArrayList;

class node{
    node left ;
    node right ;

    int data ;

    node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class createBst {
    public static node bst(node root, int val){
        if(root == null){
            root = new node(val);
            return root;
        }
        // left side;
        if(root.data > val){
            root.left = bst(root.left,val);
            return root;
        }else{
            root.right  = bst(root.right,val);
            return root;
        }
    }
    public static ArrayList<Integer> inorder(node root){
        ArrayList<Integer> al = new ArrayList<>();
    if(root == null) return new ArrayList<>();
    al.addAll(inorder(root.left));
    al.add(root.data);
    al.addAll(inorder(root.right ));
    return al ;
    }
    public static void main(String[] args) {
        int[] arr= {10,13, 4, 8,11, 19, 2,7, 18,23};
        node root = null;
        for(int i = 0 ; i < arr.length ;i++){
            root = bst(root,  arr[i]);
        }
        // bt inorder is in ascending order l n r

     ArrayList<Integer> al = inorder(root);
     for(int i : al){
         System.out.print(i  + " ");
     }


    }
}
