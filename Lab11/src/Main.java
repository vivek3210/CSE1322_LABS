import java.util.Random;
class Baby implements Runnable{
    public void run() {
        try {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am awake, feed me!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    int time;
    String name;
    public Baby(String n) {
        name = n;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }
}
public class Main {
    public static void main(String[] args) {

        Thread b1 = new Thread(new Baby("Noah"));
        Thread b2 = new Thread(new Baby("Olivia"));
        Thread b3 = new Thread(new Baby("Liam"));
        Thread b4 = new Thread(new Baby("Emma"));
        Thread b5 = new Thread(new Baby("Amelia"));
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();

    }
}