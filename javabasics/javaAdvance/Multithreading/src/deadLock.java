class Library implements Runnable{
    String resource1 = new String("java");
    String resource2 = new String("SQL");
    String resourc3 = new String("DSA");
    public void run(){
        String name =Thread.currentThread().getName();
        if(name.equals("stu1")){// it t1 will aquare this resource and apply lock in it .
            try{
                Thread.sleep(3000);// go to wait // there for interuuption and then we can apply synchronication
                synchronized (resource1) {//thread will take that resource do that it can not be used by some
                    // other thread;
                    System.out.println("student one has acc :" + resource1);
                    Thread.sleep(3000);
                    synchronized (resource2){
                        System.out.println("student one has acc :" + resource2);
                        Thread.sleep(3000);
                        synchronized (resourc3){
                            System.out.println("Studnet one has acc" + resourc3);
                            Thread.sleep(3000);
                        }
                    }
                }
                }
            catch(Exception e){//compiler will give warning
                System.out.println("some problem");
            }
        }else{
            try{
                Thread.sleep(3000);// go to wait // there for interuuption and then we can apply synchronication
                synchronized (resourc3) {//thread will take that resource do that it can not be used by some
                    // other thread;
                    System.out.println("student 2 has acc :" + resourc3);
                    Thread.sleep(3000);
                    synchronized (resource2){
                        System.out.println("student 2 has acc :" + resource2);
                        Thread.sleep(3000);
                        synchronized (resource1){
                            System.out.println("Studnet 2 has acc" + resource1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e){//compiler will give warning
                System.out.println("some problem");
            }
        }
    }
}

public class deadLock {
    public static void main(String[] args) {
        Library lb  = new Library();
        Thread t1 = new Thread(lb);
        Thread t2 = new Thread(lb);
        t1.setName("stu1");
        t2.setName("stu2");
        t1.start();
        t2.start();

    }
}
