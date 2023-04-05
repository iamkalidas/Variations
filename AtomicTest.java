package HefShine;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    public static int result = 0;
    public static volatile int volatileResult = 0;
    public static volatile AtomicInteger atomicResult = new AtomicInteger();
    public static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    result++;
                    volatileResult++;
                    atomicResult.incrementAndGet();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    result++;
                    volatileResult++;
                    atomicResult.incrementAndGet();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("result value -> " + result);
        System.out.println("volatileResult value -> " + volatileResult);
        System.out.println("atomicResult value -> " + atomicResult);
    }

}
