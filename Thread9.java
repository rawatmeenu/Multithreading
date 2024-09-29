public class Thread9 extends Thread{

    public void run(){
        System.out.println("show the prioity");
    }

    public static void main(String args[])
    {
        Thread9 t9 = new Thread9();
        Thread9 t10 = new Thread9();
        Thread9 t11 = new Thread9();
        Thread9 t12 = new Thread9();
        System.out.println(t9.getPriority());
        System.out.println(t10.getPriority());
        System.out.println(t11.getPriority());
        System.out.println(t12.getPriority());

        //get name and priority of currently executing thread
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());


    }
}
