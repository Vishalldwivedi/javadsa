//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

@FunctionalInterface
interface demo{// functional interface
    void display();

        }


class plane{// this is super, base , parent class;
    public void planFly(){
        System.out.println("plan is flying");
    }
}
class cargoplane extends plane{// this is child class;

    // overridden method from parent class;
    @Override// giving info to the compiler also
    public void planFly(){
        System.out.println("cargo plan fly");
    }
}
public class Main {
    public static void main(String[] args) {

        // adding comments : object of child class
        plane cp = new plane();//object of child class// to achive loos copuling
        cp.planFly();

    }
}