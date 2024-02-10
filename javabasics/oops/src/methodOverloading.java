
class cal{
public int add(int a , int b){// method over loading // same name different parameters
    return a + b ;
}
    public int add(int a , int b,int c){
        return a + b + c;
    }
    public double add(double a , double b){
    return a + b ;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        cal obj = new cal();
        int result = obj.add(4,3);// in  compile time it will deside which method to call
        int reslut =obj.add(3,4,5);
        double res = obj.add(3,3.3);
        System.out.println(result);
        System.out.println(reslut);
        System.out.println(res);
    }
}
