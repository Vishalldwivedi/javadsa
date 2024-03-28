import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Node{
    int data;
    Node left;
    Node right ;
    Node(int x){
        this.data = x;
        left = null;
        right = null;
    }
}
public class Main {
    public static void main(String[] args) {

     // worst case // order of n bst
        // balanced worst case log n time
        //left height -right height == -1 ,0,1

        // nlogn n after sorting the array so creating n log n
        // search in log n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Node root = createBbst(arr, 0, n-1);
        inorder(root);

    }
    public static void inorder(Node root){// if my tree is sorted
        if(root == null) return ;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void preorder(Node  root){// tell if i can create a tree perfactly balanced or not
        if(root == null) return ;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBbst(int[] arr , int s , int e ){


        if(s>e) return null;
        int mid = s +(e-s)/2;
        Node root = new Node(arr[mid]);
        root.left = createBbst(arr, s, mid-1);
        root.right = createBbst(arr, mid+1, e);
        return root;
    }
}