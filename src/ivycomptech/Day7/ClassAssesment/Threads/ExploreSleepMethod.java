package ivycomptech.Day7.ClassAssesment.Threads;

public class ExploreSleepMethod extends Thread {

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ExploreSleepMethod t1=new ExploreSleepMethod();
        ExploreSleepMethod t2=new ExploreSleepMethod();
        t1.start();
        t2.start();
    }

}
