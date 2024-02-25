import java.util.ArrayList;

public class NodesAtOddlvl {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(6);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(4);
        root.right.right.right = new Nodee(8);
        root.right.right.right.right = new Nodee(9);

        ArrayList<Nodee> ans= oddlvl(root);
        for(Nodee a : ans){
            System.out.println(a);
        }
    }

    private static ArrayList<Nodee> oddlvl(Nodee root) {
        ArrayList<Nodee> ans = new ArrayList<>();
        int lvl = 1;

        preOrder(root,lvl,ans);
        return ans;
    }
    private static void preOrder(Nodee root, int lvl , ArrayList<Nodee> ans){
        if(root == null) return ;
        if(lvl % 2 != 0){
            ans.add(root);
        }
        preOrder(root.left,lvl+1,ans);
        preOrder(root.right,lvl+1,ans);
    }
}

