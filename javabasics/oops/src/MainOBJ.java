
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class test{
    int a  = 4 ;//instance variable
    String name = "vis" ;
}
public class MainOBJ {
    public static void main(String[] args) {
        // local variable
       test tx = new test();// tx is a reference variable // when we compile .java  file it becomes .class(bytecode)\
        System.out.println(tx.name);
        System.out.println(tx.a);

        test tx2 = new test();
        tx.name = "vishal";
        tx.a = 4;
        System.out.println(tx2.name);
        System.out.println(tx2.a);

    }
}