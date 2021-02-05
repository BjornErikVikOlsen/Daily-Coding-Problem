import java.util.Timer;
import java.util.TimerTask;

/*
Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
 */
public class DCP10 {

    public static void main(String[] args) {
        solution(new Command() {
            @Override
            public void execute() {
                {
                    System.out.println("Hello World");
                }
            }
        }, 1000);

        // java 8
        solution(() -> System.out.println("Hello World"), 1000);
    }

    public static void solution(Command command, int delay) {
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                command.execute();
            }
        }, delay);

    }

    interface Command {
        public void execute();
    }

}

