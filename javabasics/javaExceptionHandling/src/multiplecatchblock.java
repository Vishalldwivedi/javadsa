public class multiplecatchblock {
    public static void main(String[] args) {
        int n = 4 ;
        int n2 = 2 ;

        int ans  = 0 ;
        int arr [] = {1,2,3,4,5,6};
        String name = null;

        try{
            ans = n/name.length();
        System.out.println(arr[6]);

        }
        catch(ArithmeticException obj ){
            System.out.println("stay in out limits" + " " + obj);
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("can not use zero " + " " + obj);

        }
        catch(Exception obj){// as exception is a superclass
            System.out.println("unknown exceptoin " + " " + obj );
        }
        System.out.println(ans);
    }
}
