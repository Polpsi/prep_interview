package Lesson3.P2_Counter;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private ReentrantLock locker;
    private int counter;

    public Counter() {
        this.locker = new ReentrantLock();
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    void increase(int num) {
        try {
            locker.lock();
            counter = counter + num;
        } finally {
            locker.unlock();
        }

    }

    void decrease(int num) {
        try {
            locker.lock();
            counter = counter - num;
        } finally {
            locker.unlock();
        }
    }
}
