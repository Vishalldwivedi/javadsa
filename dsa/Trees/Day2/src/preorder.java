import java.util.ArrayList;
import java.util.Stack;

public class preorder {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(7);
        root.right.right = new Nodee(8);
        ArrayList<Integer> ans = new ArrayList();
         preorderr(root,ans);
         for(int a : ans){
             System.out.println(a);
         }
    }
    // l right root;\
    //// print in the order root , right , left;(reverse the order u will get postorder);
    // first push in stack root;
    // jab tak stack khali nahi hota
    // print top elm and also pop it
    // right push
    // left push
    public static void preorderr(Nodee root , ArrayList<Integer> ans){
     Stack<Nodee> s = new Stack<>();
     s.push(root);
     while(!s.isEmpty()){
         Nodee temp = s.peek();
         s.pop();
         if(temp.right!=null){
             s.push(temp.right);
         }
         if(temp.left != null){
             s.push(temp.left);
         }
         ans.add(temp.data);
     }

    }
}

