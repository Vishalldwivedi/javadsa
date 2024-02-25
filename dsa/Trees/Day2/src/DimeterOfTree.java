import org.w3c.dom.Node;

class DimeterOfTree {

    public static int Dimeter(Nodee root){
    int ans[] = new int[1];
    Dimeter2(root,ans);
    return ans[0];
}
    public static int Dimeter2(Nodee root ,int[]ans ){

       if(root == null ) return 0 ;
       int left = Dimeter(root.left);
       int right = Dimeter(root.right);

       ans[0]= Math.max(ans[0],1+left+right);

       return 1+Math.max(left , right);


    }
    public static void main(String[] args) {
// pattern : that two nodes will be a leaf node
        // find the max hight of left and right ;
        // in every node we need to find this

        // ans = Max(ans,1+left + right;
        // return 1 + max(left+right) height
        //base condition root exist or null if(root == null return 0 )
        // ifroot exist ask for left and right height max and return 1+max(left,right)
        //

        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(6);
        root.left.left.left = new Nodee(7);
        root.right.right = new Nodee(4);
        root.right.right.right = new Nodee(8);
        root.right.right.right.right = new Nodee(9);

        int ans = Dimeter(root);
        System.out.println(ans);
    }
}
