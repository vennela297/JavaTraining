package ivycomptech.Day7.ClassAssesment.Threads.Timer;

import java.util.Date;
import java.util.TimerTask;

public class Task extends TimerTask {
    private String name;
    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("[" + new Date() + "] " + name + ": task executed!");

    }
}
