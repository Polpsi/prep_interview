package Lesson3.P1_PingPong;

public class PingPongBall {

    private int queueCheck = 1;
    int waitTime = 500;


    public synchronized void ping() throws InterruptedException {
        while (queueCheck==2) {
            wait();
        }
        punch("Ping");
    }

    public synchronized void pong() throws InterruptedException {
        while (queueCheck==1) {
            wait();
        }
        punch("Pong");
    }

    private void punch(String text) throws InterruptedException {
        wait(waitTime); //чтобы хоть чуть-чуть на пинг-понг похоже было
        System.out.println(text);
        queueCheck=(queueCheck==1?2:1);
        notifyAll();
    }
}
