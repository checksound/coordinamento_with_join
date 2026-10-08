public class MyThreadsApp {

    public static void main(String[] args) {
        Thread t1 = new MyThread(1,null);
        Thread t2 = new MyThread(2,null);
        Thread t3 = new MyThread(3,t1);
        Thread t4 = new MyThread(4,t2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
