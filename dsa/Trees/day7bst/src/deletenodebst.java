import static jdk.vm.ci.code.CodeUtil.minValue;

public class deletenodebst {
    public static void main(String[] args) {
        // case1 : node to be deleted is a leaf node // return null
        // case2 : node has only one child //
        //case3 : node has two child :
        // go to left and big biggest or go to the right and pick smallest;

        Nodee root = new Nodee(10);
        root.left = new Nodee(5);
        root.right = new Nodee(12);
        root.left.left = new Nodee(1);
        root.left.right = new Nodee(6);

        root.right.left = new Nodee(11);
        root.right.right = new Nodee(13);

        deleteNode(root, 10);
    }

    public static Nodee deleteNode(Nodee root, int x) {
        // i found the x data == root. data
        if (root == null) return null;

        if (x < root.data) {
            root.left = deleteNode(root.left, x);
        } else if (x > root.data) {
            root.right = deleteNode(root.right, x);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            Nodee minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public static  Nodee findMin(Nodee node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
