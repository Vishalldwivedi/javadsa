public class anonimousObj {

        public void dis(){
            System.out.println("in inner dis ano");


    }
    public static void main(String[] args) {
            new anonimousObj().dis();// this is annonimous object
        // in one instance only memory is created and distroyed as there is no reference there
    }
}
