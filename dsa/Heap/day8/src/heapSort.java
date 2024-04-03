import java.util.Scanner;

public class heapSort {// max heap i can create // heapify given element placing it in its correct position
    // swap first elem with last elem
    // decrease size of array by one
    // compare with child nodes of child greater swap(heapify) repeat
    // time complexity n element nlogn (worst case)
    // in place algo no extra space.
    //eg: 10 , 7 , 8 , 4, 3 ,2
    // 2 3 4 7 8 10 in place
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[ ] nums = new int[n];
        for(int i = 0 ;i< n ;i++){
            nums[i]= sc.nextInt();
        }
        // first create max heap
        for(int i =nums.length/2-1;i>=0;i--){
            heapify(nums,i,nums.length);
        }
        // heapsort
        for(int i = nums.length-1;i>=0;i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums,0,i);
        }
     for(int i : nums){
         System.out.println(i);
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
            heapify(arr, largest, size);
        }
    }
}

