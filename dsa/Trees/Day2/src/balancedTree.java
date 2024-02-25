public class balancedTree {

    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(7);
        root.right.right = new Nodee(8);


        boolean ans =isbalanced(root);
        System.out.println(ans);
    }

    private static boolean isbalanced(Nodee root) {
        return help(root) != -1; // to true else false;
    }

    private static int help(Nodee root) {
        if(root == null) return 0 ;
        int left = help(root.left);
        int right = help(root.right);

        if(left == -1 || right == -1) return -1;
        if(Math.abs(left - right )>1) return -1;
        return 1 + Math.max(left,right);
    }
}
