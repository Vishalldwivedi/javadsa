import java.util.ArrayList;

public class whichHasKleavsNoes {
  private static int leafNode(Nodee root ,int  k,  ArrayList<Integer> al ){// pass by refernce becuse i want it to be single al
      // first if the root of left and right r null return 1 as that will be the leaf node
      // if root = null return 0 ; that node has nothing

      if(root == null ) return 0 ;
        if(root.left == null && root.right == null){
            return 1;
        }
        int leafLeft  = leafNode(root.left,k, al);
        int leafRight = leafNode(root.right,k , al);

        if(leafLeft+leafRight == k ){
            al.add(root.data);
        }

        return leafRight + leafLeft;
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
        // go to every node a count he leaf node
        ArrayList<Integer> al = new ArrayList<>();

        leafNode(root, 1, al);
        for(int a : al){
            System.out.println(a);
        }

    }
}
