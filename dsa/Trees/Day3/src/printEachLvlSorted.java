import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class printEachLvlSorted{
    private static void help(Nodee root, ArrayList<ArrayList<Integer>> al ){
        Queue<Nodee> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0 ;i<size;i++){
                Nodee node = q.poll();
                a.add(node.data);
                if(node.left != null){q.add(node.left);}
                if(node.right!=null){q.add(node.right);}
            }
            Collections.sort(a);
            al.add(a);
        }
    }

    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(55);
        root.right = new Nodee(66);
        root.left.left = new Nodee(67);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(44);
        root.right.right.right = new Nodee(88);
        root.right.right.right.right = new Nodee(9) ;

        ArrayList<ArrayList<Integer>> al  = new ArrayList();
        help(root,al);
        for(ArrayList<Integer> a : al){
            for(int aa : a){
                System.out.print(aa);
            }
            System.out.println();
        }
    }
}

