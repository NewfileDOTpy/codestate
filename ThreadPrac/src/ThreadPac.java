public class ThreadPac {
    public static void main(String[] args) {

        ThreadTask1 test1 = new ThreadTask1();

        Thread thread1 = new Thread(test1);    // Runnable 인터페이스를 구현한 클래스 이용

        ThreadTask2 thread2 = new ThreadTask2(); // Thread 클래스 상속 받은 클래스 이용


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());   // 현재 쓰레드 표시
            }
        });
        thread1.start();
        thread3.setName("States");  // Thread 이름 변경
        thread3.start();

    }
}
class ThreadTask1 implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print("#");

        }
    }
}

class ThreadTask2 extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.print("%");
        }
    }
}