import java.util.Timer;
import java.util.TimerTask;

/*
Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
 */
public class DCP10 {

    public static void main(String[] args) {
        scheduleCommand(new Runnable() {
            @Override
            public void execute() {
                {
                    System.out.println("Hello World");
                }
            }
        }, 1000);

        scheduleCommand(() -> System.out.println("Hello World"), 1000);
    }

    public static void scheduleCommand(Runnable runnable, int delay) {
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                runnable.execute();
            }
        }, delay);

    }

    interface Runnable {
        void execute();
    }

}

