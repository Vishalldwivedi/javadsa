

public class twoTreeIdenticalornot {
    public  static boolean isIdentical(Nodee root1, Nodee root2)
    {
        if(root1 == null && root2 == null) return true;
        if(root1 == null && root2 !=null) return false;
        if(root1 !=null && root2 == null) return false;

        if(root1.data != root2.data) return false;

        return isIdentical(root1.left ,root2.left)
        &&  isIdentical(root1.right, root2.right);


    }
    public static void main(String[] args) {
        Nodee root1 = new Nodee(1);
        root1.left = new Nodee(2);
        root1.right = new Nodee(3);

        Nodee root2 = new Nodee(1);
        root2.left = new Nodee(2);
        root2.right = new Nodee(3);
        root2.left.left = new Nodee(4);

        // Check if the trees are identical
        boolean result = isIdentical(root1, root2);
        System.out.println(result);

        // in recursion solve the first node rest will we be solved automatically
    }
}
