public class MyThread extends Thread {
    private int id;
    private Thread other;

    public MyThread(int n, Thread t) {
        id = n;
        other = t;
    }

    public void run() {
        try {
            if (other != null)
                other.join();
        } catch (InterruptedException e) {
            return;
        }
        System.out.println(id);
    }

}
