import java.util.ArrayList;

public class morrisTraversal {
    public static void main(String[] args) {
        //inorder: ->
        // tell root to go to left and point the right most element to root;
        // who ever left do the above operation

       //(root.left == null go to root.right

        //if(root.left !=null cur == root.left and go to curr right most element and point to root;
        // if link is already present then break it print me and go to right
        // if my left not exist print me and go to my right

        Nodee root = new Nodee(10);
        root.left = new Nodee(2);
        root.right = new Nodee(-25);
        root.left.left = new Nodee(20);
        root.left.right = new Nodee(1);

        root.right.left = new Nodee(3);
        root.right.right = new Nodee(4);

       ArrayList<Integer> al =  morris(root);
       for(int a : al){
           System.out.println(a + " ");
       }

    }
    public static ArrayList<Integer> morris(Nodee root){

        ArrayList<Integer> al = new ArrayList<>();

        while(root!=null){
            if(root.left == null){// left is null
                al.add(root.data);
                root = root.right;
            }else{
                if(root.left != null){// if left not null
                    Nodee curr = root.left;
                    while(curr.right!=null & curr.right != root){
                        curr = curr.right;
                    }
                    if(curr.right == null){// make the link
                        curr.right = root;
                        root = root.left;
                    }else{// break the link
                        curr.right = null;
                        al.add(root.data);
                        root = root.right ;
                    }
                }
            }
        }
        return al ;
    }
}
