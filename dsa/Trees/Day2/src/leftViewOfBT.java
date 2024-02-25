import java.util.LinkedList;
import java.util.Queue;

public class leftViewOfBT {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(6);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(4);
        root.right.right.right = new Nodee(8);
        root.right.right.right.right = new Nodee(9);

        int[] ans = leftView(root);
        for(int a : ans){
            System.out.println(a);
        }
    }

    private static int[] leftView(Nodee root) {
        int[] ans = new int[6];
        Queue<Nodee> q = new LinkedList<>();
        int k = 0 ;
        q.add(root);
        while(!q.isEmpty()){
            int lvl = q.size();

            ans[k++] = q.peek().data;
            for(int i = 0 ;i<lvl;i++){
                Nodee temp = q.poll();
                if(temp.left !=null )q.add(temp.left);
                if(temp.right !=null) q.add(temp.right);
            }
        }

        return ans;
    }
}
