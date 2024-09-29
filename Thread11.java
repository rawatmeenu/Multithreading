public class Thread11 extends Thread{

    public void run(){
       for(int j=0;j<4;j++)
       {
           try{
               Thread.sleep(300);
               System.out.println("threaddd name"+ Thread.currentThread().getName());


           }
           catch(Exception e)
           {
               System.out.println(e);

           }
           System.out.println(j);

       }


        System.out.println("the thread is running");
    }
    public static void main(String args[])
    {
        Thread11 t11 = new Thread11();
        Thread11 t12 = new Thread11();
        Thread11 t13 = new Thread11();

        //t11.setName("thread11");
        t11.start();

        try {
            System.out.println(Thread.currentThread().getName());
            t11.join();
        }
        catch(Exception e){
            System.out.println(e);
    }

        t12.start();

        try{
            System.out.println("the thread2 name" + Thread.currentThread().getName());
            t12.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        t13.start();
    }
}
