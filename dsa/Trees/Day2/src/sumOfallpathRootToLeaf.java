public class sumOfallpathRootToLeaf {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);

        int ans = pathsum(root,0);
        System.out.println(ans);
    }
    public static int pathsum(Nodee root, int sum){
        if(root == null) return 0 ;
        sum = sum * 10 + root.data;
        if(root.left  == null && root.right == null) {
            return sum;
        }

        int left = pathsum(root.left,sum);
        int right = pathsum(root.right, sum);

        return left + right;
    }
}
