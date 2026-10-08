public class MyThreadsApp3 {

    public static void main(String[] args) {
        Thread t1 = new MyThread2(1);
        Thread t2 = new MyThread2(2);
        Thread t3 = new MyThread2(3, t1, t2);
        Thread t4 = new MyThread2(4, t3);
        Thread t5 = new MyThread2(5, t3);
        Thread t6 = new MyThread2(6, t3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
