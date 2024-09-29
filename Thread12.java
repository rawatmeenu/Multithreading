public class Thread12 extends Thread{
    public void run(){
        for(int i=1;i<5;i++)
        {
            try{
                Thread.sleep(500);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);

        }
    }

//when t12 completes its task then t13 and t14 starts executing.
    public static void main(String args[])
    {
        Thread12 t12 = new Thread12();
        Thread12 t13 = new Thread12();
        Thread12 t14 = new Thread12();

        t12.start();

        try{
            t12.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t13.start();
        t14.start();
    }
}
