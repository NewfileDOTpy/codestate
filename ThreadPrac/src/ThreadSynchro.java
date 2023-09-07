public class ThreadSynchro {
    public static void main(String[] args) {
        ThreadTest3 test4 = new ThreadTest3();
        Thread thread4_1 = new Thread(test4);
        Thread thread4_2 = new Thread(test4);

        thread4_1.setName("김대현");
        thread4_2.setName("김형근");

        thread4_1.start();
        thread4_2.start();

    }
}
class Account{
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public boolean withdraw(int money) {
        synchronized (this){
        if (balance >= money) {

            try {
                Thread.sleep(1000);
            } catch (Exception error) {
            }
            balance -= money;
            return true;
        }return false;
    }
    }
}





class ThreadTest3 implements Runnable{
    Account account = new Account();
    public void run(){
        while (account.getBalance()>0){

            int money = (int)(Math.random()*3+1)*100;

            boolean denied = !account.withdraw(money);

            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s", money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : ""));

        }
    }
}