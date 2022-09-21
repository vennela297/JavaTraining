package ivycomptech.Day7.ClassAssesment.Threads.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class ExploreTimer {
    public static void main(String[] args) {
        Task task1=new Task("task1");
        Task task2=new Task("task2");
        Timer t = new Timer();
        t.schedule(task1, 10000);
        t.schedule(task2, 1000, 2000);


    }
}

