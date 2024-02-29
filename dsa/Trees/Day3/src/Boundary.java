import java.lang.reflect.Array;
import java.util.ArrayList;

public class Boundary {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);


        // level order left side then write the bottom(leafNode)(except left and right) and right(reverse form except leaf)


        ArrayList<Integer> al = bound(root);
        System.out.println(al);

    }

    private static ArrayList<Integer> bound(Nodee root) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(root.data);
        left(root.left,a);
        if(root.left !=null && root.right!= null) {
            leaf(root, a);

        }
        right(root.right, a);

        return a ;
    }

    private static void left(Nodee root , ArrayList<Integer> a){
        if(root == null || root.left == null && root.right == null)return ;
        a.add(root.data);
        if(root.left!=null){
            left(root.left,a);
        }else{
            left(root.right,a);
        }
return ;
    }
    private static void right(Nodee root , ArrayList<Integer> a){
        if(root == null) return ;
        if(root.left == null && root.right == null) return ;

        if(root.right!=null){
            right(root.right, a);
        }else{
            right(root.left , a);
        }
        a.add(root.data);
        return ;

    }
    private static void leaf(Nodee root, ArrayList<Integer> a){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            a.add(root.data);
            return ;
        }
        leaf(root.left,a);
        leaf(root.right,a);

    }
}
