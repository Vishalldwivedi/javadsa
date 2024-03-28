public class closestdifftok {
    public static void main(String[] args) {
        Nodee root = new Nodee(10);
        root.left = new Nodee(2);
        root.right = new Nodee(-25);
        root.left.left = new Nodee(20);
        root.left.right = new Nodee(1);

        root.right.left = new Nodee(3);
        root.right.right = new Nodee(4);

         int ans = closestt(root , 21);
        System.out.println(ans);
    }
    public static int closestt(Nodee root, int k ){
        if(root==null) return Integer.MAX_VALUE;
        if(root.data == k ) return 0 ;
        if(k>root.data) {
           return Math.min(k-root.data  ,closestt(root.right,k));
        }else{
          return   Math.min(root.data-k  , closestt(root.left,k));
        }

    }
}
