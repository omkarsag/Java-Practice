package multithreading;

class CookWork implements Runnable {
    private String menu;

    public CookWork(String menu) {
        this.menu = menu;
    }

    @Override
    public void run() {
        System.out.println("Praparing " + menu + " ...");

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread completed");
    }

}

public class RunnableDemo {

    public static void main(String[] args) {
        Thread t1, t2, t3, t4, t5, t6;
        t1 = new Thread(new CookWork("Pizza"));
        t2 = new Thread(new CookWork("Burger"));
        t3 = new Thread(new CookWork("Ravioli"));
        t4 = new Thread(new CookWork("Sub"));
        t5 = new Thread(new CookWork("Fries"));
        t6 = new Thread(new CookWork("Shake"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
