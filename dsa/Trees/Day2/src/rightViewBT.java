import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class rightViewBT {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(6);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(4);
        root.right.right.right = new Nodee(8);
        root.right.right.right.right = new Nodee(9);
        int[] ans = right(root);
        for(int a : ans){
            System.out.println(a);
        }
    }

    private static int[] right(Nodee root) {
        Queue<Nodee> q = new LinkedList<>();
        q.offer(root);
        int[] ans = new int[7];
        int k = 0 ;
        while(!q.isEmpty()){
            int size = q.size();
            Nodee lastNode = null;

            for(int i = 0 ;i< size;i++){
                Nodee d = q.poll();
                lastNode = d;
                if(d.left!=null)q.offer(d.left);
                if(d.right!=null)q.offer(d.right);
            }
            ans[k++] = lastNode.data;
        }
        return ans;
    }
}
