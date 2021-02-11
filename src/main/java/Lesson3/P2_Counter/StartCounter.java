package Lesson3.P2_Counter;

public class StartCounter {
    public static void main(String[] args) {
        int iteration1 = 2000000;
        int iteration2 = 1000000;
        Counter counter = new Counter();
        new Thread(()->{
            for (int i = 0; i < iteration1; i++) {
                counter.increase(5);
                if (i==iteration1-1) System.out.println(counter.getCounter());
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < iteration2; i++) {
                counter.decrease(6);
                if (i==iteration2-1) System.out.println(counter.getCounter());
            }
        }).start();
    }
}
