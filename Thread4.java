public class Thread4 implements Runnable{

    public void run(){
        System.out.println("Now the thread is running ...");
    }

    public static void main(String args[])
    {
        //// creating an object of the class Thread using Thread(Runnable r, String name)
        Runnable r1 = new Thread4();
        Thread t5 = new Thread(r1,"sample thread");
        t5.start();

        String str= t5.getName();
        System.out.println(str);


    }
}
