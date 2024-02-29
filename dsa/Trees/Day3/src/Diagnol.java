import java.util.*;

public class Diagnol {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(6);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(4);
        root.right.right.right = new Nodee(8);
        root.right.right.right.right = new Nodee(9);
        ArrayList<Integer> al = new ArrayList<>();
        diag(root,al);
        System.out.println(al);
    }
    private static void diag(Nodee root, ArrayList<Integer> al){
        Queue<Nodee> q = new LinkedList<>();
        if(root == null) return ;
        q.add(root);

        Map<Integer,ArrayList<Integer>> m = new HashMap<>();

        while(!q.isEmpty()){
            Nodee curr =   q.poll();

            int diagnol = 0 ;
            while(curr!=null){
                m.putIfAbsent(diagnol, new ArrayList<>());
                m.get(diagnol).add(curr.data);

                if(curr.left !=null){
                    q.add(curr.left);
                }
                curr = curr.right;
            }
            diagnol ++ ;
        }

        for(ArrayList<Integer> val : m.values()){
            al.addAll(val);
        }

    }
}
