public class MyThread2 extends Thread {
    private int id;
    private Thread[] other;

    public MyThread2(int n, Thread ... t) {
        id = n;
        other = t;
    }

    public void run() {
        try {
            if (other != null) {
                for (Thread t: other) {
                    t.join();
                }
            }
        } catch (InterruptedException e) {
            return;
        }
        System.out.println(id);
    }

}
