import java.util.ArrayList;
import java.util.Scanner;

public class heapAdvanceN {
    // why this maxheap is usefull i have the nlogn sorting way also -> we can optimize it to n
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[ ] arr = new int[n];
        for(int i = 0 ;i< n ;i++){
            arr[i]= sc.nextInt();
        }
        for(int  i = n/2-1;i>=0;i--){// n complexity
            heapify(arr, i , n  );
        }
        for(int i = 0 ;i< n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void heapify(int[] arr, int i, int size ){//logn
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }
}

