import java.util.Scanner;

class farmer{
    int pa;
    float time ;
    float si;
   static float ri;// memory is created only one time and shared by all the objects

   static{
       ri = 8.5f;
   }

    void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("please enter the amount req");;
        pa = sc.nextInt();
        System.out.println("please mention time");
        time = sc.nextFloat();
        ri= 8.5f;
    }
    void compute(){
        si = (pa*ri*time)/100f;
    }
    void display(){
        System.out.println("si is :"+ si);
    }
}
public class staticproject2 {
    public static void main(String[] args) {
farmer f1 = new farmer();
f1.input();
f1.compute();
f1.display();
farmer f2 = new farmer();
        f2.input();
        f2.compute();
        f2.display();
    }
}
