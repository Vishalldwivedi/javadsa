import java.util.Scanner;
// abs(left - right height) -1 , 0 , 1 -> which one -> if balanced value is greater than 1 // left side unbalanced
// -1< balance value  right side unbalanced
//
// first enter the value
// ro to left or right  till find null and create it self  while returning check the balancing
// update the height and check balance factor
//abs(left - right height) -1 , 0 , 1 -> which one -> if balanced value is greater than 1 // left side unbalanced
//// -1< balance value  right side unbalanced
public class avl {
    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            height = 1;
            left = null;
            right = null;
        }
    }
    public static  int getheight(Node root){
        if(root == null) return 0 ;
        return root.height;
    }
//       3 root
//     2  temp
//    1
    public static Node rotateright(Node root){
        Node temp = root.left;
        root.left = temp.right;
        temp.right = root;
        updateheight(root);
        updateheight(temp);
        return temp ;
    }
//    1 root
//      2 temp
//        3
    public static Node rotateleft(Node root){
        Node temp = root.right;
        root.right  = temp.left;
        temp.left = root;
        updateheight(root);
        updateheight(temp);
        return temp ;
    }
//        3 root// left right problem
//    1 left
//        2
    // rotateleft(root.left) then rotateright(root);

//    1 // right left problem
//        3
//    2
    // rotateright(root.right) then rotateleft(root);
public static void  updh(Node root){
       int lefthei = getheight(root.left);
       int right = getheight(root.right);
       root.height = 1+Math.max(lefthei,right);
}
public static Node balancing(Node root){
        if(root == null) return null;
        // update the height
    // check balnce factor left - right ->
    // 1< left is unbalanced  ,  < -1 / right unbalaced
    updh(root);
    int balance = getheight(root.left) - getheight(root.right);
    if(balance>1){// left unbalncing
        // ll
        if(getheight(root.left.left)>=getheight(root.left.right)){
            root = rotateright(root);// as new node is added on that side
        }else{// lr
            root.left = rotateleft(root.left);
           root =  rotateright(root);
        }
    }else if(balance < -1 ){// rr
        if(getheight(root.right.right)>=getheight(root.right.left)){
            root = rotateleft(root);
        }else {// rl
            root.right = rotateright(root.right);
            root = rotateright(root);
        }// right unbalancing // rr or rl unbalacing
    }
    return root;
}
public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
}
public static void preorder(Node root){
        if(root == null) return ;
    System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
}
public static void updateheight(Node root){

        int lefth= getheight(root.left);
        int righth = getheight(root.right);

        root.height= 1+Math.max(lefth,righth);
}
    public static void main(String[] args) {
        // 1 , 2 , 3 can be arranged into 3! ways as bst
        // in rr problem= rotateleft (root);
        // in ll problem  = rotateright(root);
        // in lr problem = rotateleft(root.left) then rotateright(root)
        // in rl problem = rotateright(root.right) then rotateleft(root)

        Node root = null;
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.println("Enter values to insert into the BST (-1 to exit):");
        while (true) {
            val = sc.nextInt();
            if (val != -1) {
                root = insertInBST(root, val);
            } else {
                break;
            }
        }
        System.out.println("BST constructed successfully.");
        sc.close();

        inorder(root);
        System.out.println();
        preorder(root);
    }

    public static Node insertInBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
           root.left = insertInBST(root.left, val);
        } else {
            root.right = insertInBST(root.right, val);
        }
        return balancing(root);
    }
}
/*
first enter the element in the tree
go either left or right part
till it finds null create it self and return
while returning first update the hight and check balance factor
if balance > 1 // left side unbalancing ll or lr
if balance < -1 // right rise unbalancing rr or rl
 */