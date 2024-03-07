public class maxpathsum1 {
   static int sum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Nodee root = new Nodee(10);
        root.left = new Nodee(2);
        root.right = new Nodee(-25);
        root.left.left = new Nodee(20);
        root.left.right = new Nodee(1);

        root.right.left = new Nodee(3);
        root.right.right = new Nodee(4);
       int ans = findMaxSum(root);
        System.out.println(ans);

    }
            //Function to return maximum path sum from any node in a tree.
           public static int findMaxSum(Nodee node) {
                helper(node);
                return sum;
            }

           public static int helper(Nodee node) {
                if (node == null) return 0;

                int left = helper(node.left);
                int right = helper(node.right);
                if (left <= 0) left = 0;
                if (right <= 0) right = 0;

                sum = Math.max(sum, node.data + left + right);
                return node.data + Math.max(left, right);

            }
        }

