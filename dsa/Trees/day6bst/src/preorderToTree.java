import java.util.ArrayList;
import java.util.List;

public class preorderToTree {
    public static void main(String[] args) {
        // 40 , 30 , 35 , 80 , 100 ;
        // i must get the range or comparision method

        // min = int_min , max = int_max
        // min < 40 <max;
        //40 left = min < 30 < 40 , 40 .right =  40 < x < max
        // 40  right -> 40 < val  < 80.
        // 80 right -> 80< val < intmax ie: val = 100 ;

        // root (min and max) -> x1(root)
        //left = min<x2<x1(x2 left) min<x4<x2 , right =  x1<x3<max (x3 right)-> x3<x5<max
        Nodee root = help();
        ArrayList<Integer> result = new ArrayList<>();
        postOrderHelper(root, result);
       for(int i : result){
           System.out.println(i);
       }

    }


    // Helper function to perform the postorder traversal recursively.
    public  static void postOrderHelper(Nodee node, ArrayList<Integer> result) {
        if (node == null)
            return;

        // Traverse left subtree
        postOrderHelper(node.left, result);

        // Traverse right subtree
        postOrderHelper(node.right, result);

        // Visit the current node
        result.add(node.data);
    }

    public static Nodee help (){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int[]ind = new int[1];
        int size = 0 ;
        int[] pre = {40,30,35,80,100};
        Nodee root =  find(pre,min,max ,ind,size);
        return root;
    }
    public static Nodee find(int[] pre , int min ,int max , int[] ind , int size){
        if(ind[0] >= size || pre[ind[0]]> max) return null; // as 80 is greater than 30 and root 40 so return
        Nodee root = new Nodee(pre[ind[0]]);
        ind[0]++;
        if(ind[0] == size) return root;
        root.left = find(pre,min,pre[ind[0]],ind,size);
        root.right = find(pre,pre[ind[0]] , max , ind , size);
        return root ;
    }
}
