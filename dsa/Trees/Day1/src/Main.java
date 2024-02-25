import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Nodee{
    int data;
    Nodee left;
    Nodee right;

    public Nodee(int data){
        this.data = data;
        left =null;
        right = null;
    }
    @Override
    public String toString() {
        return Integer.toString(data);
    }

   public  Nodee binaryTree(){
        int x;
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if(x == -1){
            return null;
        }


        Nodee root = new Nodee(x);
        System.out.println("enter the left child of " + x);
        root.left = binaryTree();
        System.out.println("enter the right child of " + x);
        root.right = binaryTree();

        return root;

    }

    public void inOrder(Nodee root){
        if(root ==null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void postOrder(Nodee root){
        if(root ==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void preOrder(Nodee root){
        if(root ==null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public void levelOrder(Nodee root){
        if(root == null) return ;
        Queue<Nodee> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Nodee temp = q.poll();
            System.out.println(temp.data);
            if(temp.left!=null ){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // two form to store data :
        //array form ->
        // linked list form ->
        // stack -lifo -> implement using array and linked list(undo redo)
        // queue -fifo-> implement using array and linked list(whatsapp mssg)

        // why more data structure; ?
        // movie folder -divided bollywood , hollowood;
        // now action movie , drama, comedy ,
        // so on each folder there r more files ;

        // better way to store this movie array or linkedlist?
        // actual location in memory r not sequential for movies
        // so linked list //

        // parent dont have child is leaf lvl 0 1 2 ;
        //ancestor ,root , parents ;
        // if no of nodes r n and edges r n-1
        // no loop

        // first grandfather(root)(parent) is born than father(child)  , uncle(child) , aunt(child) , then each has child

        // TYPE OF TREE :
        // binary Tree: max two child
        // each not has a value a two addresses
        // create class Node which has data , address1 and address2 ,one constructor public node(int value){data=value;leftandrightnull

        //binary tree function if -1 no child exists for a node
        // Node binary Tree(){ int x ; scanner x ; if(x ==-1) return null;  Node root =  new Node(x);
        //binary tree call and go to root leftand root right ;ie: root.left = binary tree();root.right = bianrytree();//
        // it return theaddress ; return root; // print the values

        // in order traversal preorder post order traversal;
        //inorder -> l root r , preorder -> root l r , post =-> l r root;


        Nodee root = new Nodee(0);
        Nodee tree = root.binaryTree();

        System.out.println("inorder");
        tree.inOrder(tree);
        System.out.println("preorder");
        tree.preOrder(tree);
        System.out.println("postorder");
        tree.postOrder(tree);
        System.out.println("level ordertraversal");
        tree.levelOrder(tree);

        // building the tree is O(n) and space(n);
        // worst case n;best base complete bianry tree (height of tree as at a time on stack that much elements r there it;

        //que : count leaf nodes or total nodes or sum of binary tree;

    }
}