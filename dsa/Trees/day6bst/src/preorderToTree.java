public class preorderToTree {
    public static void main(String[] args) {
        // 40 , 30 , 35 , 80 , 100 ;
        // i must get the range or comparision method

        // min = int_min , max = int_max
        // min < 40 <max;
        //40 left = min < 30 < 40 , 40 .right =  40 < x < max
        // 40  right -> 40 < val  < 80.
        // 80 right -> 80< val < intmax ie: val = 100 ;

        // root (min and max) -> x1(root)
        //left = min<x2<x1(x2 left) min<x4<x2 , right =  x1<x3<max (x3 right)-> x3<x5<max
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

    }
}
