public class sumTree {
    public static void main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(2);
        root.right = new Nodee(2);
        root.left.left  = new Nodee(5);

        root.left.left.left  = new Nodee(100);


        boolean ans =sumT(root);
        System.out.println(ans);
    }
   public static boolean  sumT(Nodee root){

        return helpp(root) != - 1;
    }
    public static int helpp(Nodee root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        int left = helpp(root.left);//left sum
        int right = helpp(root.right);//right sum;

        if(left == -1 || right == -1||(root.data != left + right) )return -1;
        return root.data + left + right;
        }
    }

