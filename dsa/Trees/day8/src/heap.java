import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class heap {
    public static void main(String[] args) {
        // bst n time , insertion n time, delete n time// sorted way

        //bbst searching power is log n// optimize as well as sorted
        // insert log n
        // deletion log n

        // we want biggest or smallest data from the tree emergency case;
        //priority queue/heap -> 5g fastest 4g fast 3g slow
        //heap holds complete binary tree property
        //heap=> maxheap , min heap
//        //  10//maxheap
//        4       8
//     3    1  2    4

//               1 // min heap
//       6                   7
//  8         10     11              9

        // when removing from the top choose the last node from the cbt to attach to the top
        // then arrange and put it in its write position by comparing

        // insertion in heap -> logn if n elements r there - > nlogn
        //

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] maxheap = new int[n];
        for (int i = 0; i < n; i++) {
            maxheap[i] = sc.nextInt();
        }
        // Build max heap
        insertHeap(maxheap);

        // Print max heap
        for (int i = 0; i < n; i++) {
            System.out.print(maxheap[i] + " ");
        }
        ArrayList<Integer> list = new ArrayList<>();
       for(int i : maxheap){
           list.add(i);
       }
       DeleteHeap(list);
    }
    public static void insertHeap(int[] mh) {// [4,7]->[7,4]
        int ind = mh.length - 1;
        int par;
        while (ind > 0) {
            par = (ind - 1) / 2;
            // Parent is smaller, break the loop
            if (mh[par] >= mh[ind]) {
                break;
            }
            // Swap parent and child
            int temp = mh[par];
            mh[par] = mh[ind];
            mh[ind] = temp;
            ind = par; // Update index to parent
        }
    }// time complexity : nlogn// approx in the last level n/2 elements r present and rest n/2
    // best case : n
    // delete from the top :
    // and pick the last one ; left child (2*index +1 ) , right child (2*index+2)
    // largest = index
    //if if(left<size(prevent segmentation error) && maxheap[left] > maxheap[largest]{ largest = left}
    //if if(right<size && maxheap[right] > maxheap[largest[{largest  = right}
    // if(largest ! = index){
    // swap(maxheap[largest], maxheap[ind])
//heapify (maxheap,largest);
    public static void DeleteHeap(ArrayList<Integer> maxheap){
        // replace first elem by last element;
        Integer lastElement =maxheap.remove(maxheap.size() - 1);
        // Add the last element at the beginning  // delete last elem
        maxheap.add(0, lastElement);
        // correct pos mai la kr jao
        heapify(maxheap,0);

    }
    public static void heapify(ArrayList<Integer> maxheap, int i ){// logn delete
        // 0 1 2 3
        // 4 8 7 3
        int size = maxheap.size();

        int largest = i ;
        int left = 2*i +1 ;
        int right = 2*i + 2 ;
        //first check for left side
        if(left<size && maxheap.get(left)>maxheap.get(largest)){
            largest = left;
        }
        // check for right side;
        if(right<size && maxheap.get(right)>maxheap.get(largest)){
            largest = right;
        }

        if(largest != i){// larger element if present i need to swap
            maxheap.set(largest, maxheap.get(i));
            maxheap.set(i,maxheap.get(largest));
            heapify(maxheap,largest);
        }
    }

}// why this maxheap is usefull i have the nlogn sorting way also -> we can optimize it to n
// start from the last node which is childs and compare if its child is bigger than parent swap
// second last n/4*1 (worst case can go to 1 down) 3rd last(n/8*2) 2ndfromtop(n/16*3) + 1st(n/32*4)
// n (1/4+2/8+3/16+4/32+5/64 ,, , )
// n( constant) => n
//HOW TO FIND THE LAST PARENT
// for 3 size index is 0 // 3/2-1 = 0
// for 4 size arr index is 1 // 4/2 -1 = 1
// for 5 size arr index is 1  // 5/2 -1 = 1
// for 6 size arr index is 2
// for 7 size arr index is 2 // 7/2 -1 = 2
// for(int i = size/2 ;i >=0 ;i--){heapify(maxheap, i-1 );}

