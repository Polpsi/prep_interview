package Lesson3.P1_PingPong;

public class PingPong {

    public static void main(String[] args) {
        int maxCount=10;
        PingPongBall ball= new PingPongBall();

        new Thread(() -> {
            for (int i = 0; i < maxCount; i++) {
                try {
                    ball.ping();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int j = 0; j < maxCount; j++) {
                try {
                    ball.pong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}