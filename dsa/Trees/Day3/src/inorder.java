import java.util.ArrayList;
import java.util.Stack;

public class inorder {
    private static ArrayList<Integer> iterative(Nodee root)  {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Nodee> st = new Stack<>();
        Nodee node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                al.add(node.data);
                node = node.right;
            }
        }
        return al ;
    }
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(6);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(4);
        root.right.right.right = new Nodee(8);
        root.right.right.right.right = new Nodee(9);

        ArrayList<Integer> al = iterative (root);
        for(int a : al){
            System.out.println(a);
        }


    }
}
