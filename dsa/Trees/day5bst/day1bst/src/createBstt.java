public class createBstt {
    public static node bst(node root, int val){
        if(root == null){
            root = new node(val);
            return root;
        }
        // left side;
        if(root.data > val){
            root.left = bst(root.left,val);
            return root;
        }else{
            root.right  = bst(root.right,val);
            return root;
        }
    }
    }
