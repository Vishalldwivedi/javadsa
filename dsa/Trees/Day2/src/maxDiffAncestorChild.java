public class maxDiffAncestorChild {
    public static void  main(String[] args) {
        Nodee root = new Nodee(4);
        root.left = new Nodee(5);
        root.right = new Nodee(6);
        root.left.left = new Nodee(7);
        root.right.right = new Nodee(8);
        int[] diff = new int[1];
        diff[0] = Integer.MIN_VALUE;
        maxdiff(root,root.data,root.data,diff);
      //  return diff[0];
        System.out.println(diff[0]);
    }
    public static void maxdiff(Nodee root, int min , int max, int diff[]){// go in preorder form
            if(root == null) return ;//
        max = Math.max(max,root.data);
        min = Math.min(min,root.data);
        diff[0] = Math.max(diff[0], Math.abs(max - min));
        maxdiff(root.left,min,max,diff);
       maxdiff(root.right,min,max,diff);

    }
}
