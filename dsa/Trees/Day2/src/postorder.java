import java.net.Inet4Address;
import java.util.*;

public class postorder {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(7);
        root.right.right = new Nodee(8);
        ArrayList<Integer> al = new ArrayList<>();



        post(root,al);
       // Collections.reverse(al);
        for(int a : al){
            System.out.println(a);
        }
    }
    public static void post(Nodee a , ArrayList<Integer> ans){
        // rlroot -> it is reverse of the preorder;
        Stack<Nodee> s = new Stack<>();
        s.push(a);
        while(!s.isEmpty()){
            Nodee t = s.pop();
            ans.add(t.data);
//            if(t.left!=null){s.push(t.left);}
//                if(t.right!=null){s.push(t.right);
//                }
            if(t.right!=null){s.push(t.right);}
            if(t.left!=null){s.push(t.left);
            }
        }
    }
}
