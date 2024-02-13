//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Studen{
    String name ;
    int age ;
    Studen(String name,  int age){
        this.name = name;
        this.age = age;
    }
}


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Studen s = new Studen("vis" , 19);

    }
}