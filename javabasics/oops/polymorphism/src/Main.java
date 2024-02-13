//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class airoplane{
    public void fly(){//overridden method
        System.out.println("airoplane is flying");
    }
    public void takeOff(){
        System.out.println("airoplane is takeoff");
    }
}
class cargoPlane extends airoplane{
    public void fly(){// over riding method
        System.out.println("cargo plan fly");
    }
    public void carryGoods(){
        System.out.println("cargoplan carry goods");
    }
}
class passagerPlane extends airoplane{
    public void fly(){// over riding method
        System.out.println("passanger plan fly");
    }
    public void carryPassanger(){// specilised methods that r in child but not in parent
        System.out.println("ppassanger plane carry gpasanger");
    }
}
class airport{
    public void poly(airoplane ref){
        ref.takeOff();
        ref.fly();

        System.out.println("_--------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();

        passagerPlane pp = new passagerPlane();
//        airoplane rf;
//        rf = cp ;
//        rf.fly();
//        rf.takeOff();
//        rf = pp;
//        rf.fly();
//        rf.takeOff();
        airport  a = new airport();// this is run time poly as it is binding in run time
        a.poly(cp);
        a.poly(pp);
    }
}
