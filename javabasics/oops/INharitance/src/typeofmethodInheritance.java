
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
public class typeofmethodInheritance {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        cp.fly();
        cp.takeOff();
        passagerPlane pp = new passagerPlane();
        pp.fly();
        pp.takeOff();
    }
}
