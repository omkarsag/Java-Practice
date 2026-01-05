package multithreading;

class Cook extends Thread {
    private String menu;

    public Cook(String menu) {
        this.menu = menu;
    }

    @Override
    public void run() {
        System.out.println(menu + " is being prepared");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class simple {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Cook("Pizza"));
        Thread t2 = new Thread(new Cook("Burger"));
        Thread t3 = new Thread(new Cook("Vada Pav"));
        Thread t4 = new Thread(new Cook("Pav Bhaji"));
        Thread t5 = new Thread(new Cook("Roti"));
        Thread t6 = new Thread(new Cook("Paneer Sabzi"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
