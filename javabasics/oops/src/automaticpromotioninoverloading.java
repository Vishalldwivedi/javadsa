class call{
    public void show(int a){
        System.out.println("int" + a);
    }

    public void show(byte a){
        System.out.println("byte" + a);
    }

    public void show(long a){
        System.out.println("long" + a);
    }

    public void show(double a){
        System.out.println("double" + a);
    }

    public void show(float a){
        System.out.println("float" + a);
    }
}
public class automaticpromotioninoverloading {
    public static void main(String[] args) {
        call obj = new call();

        obj.show(3);// by default int
    }
}
