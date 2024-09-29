public class Thread10 extends Thread{

    public void run()
    {

        if(Thread.currentThread().isDaemon()){
            System.out.println("yes deamon is wokring");
    }
        else{
            System.out.println("user working");
        }
    }


    public static void main(String args[])
    {
        Thread10 t10 = new Thread10();
        Thread10 t11 = new Thread10();
        Thread10 t12 = new Thread10();

        t11.setDaemon(true);

        t10.start();
        t11.start();
        t12.start();


    }
}
