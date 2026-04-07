// L7P6
// Create 2 threads which

import java.util.Scanner;

class ThreadWD extends Thread {
    private static double balance = 100000;
    private static final Object lock = new Object();

    ThreadWD(String name) {
        super(name);
    }

    public static void main(String[] args) throws Exception {
        ThreadWD withdrawThread = new ThreadWD("Withdraw");
        ThreadWD depositThread = new ThreadWD("Deposit");

        withdrawThread.start();
        Thread.sleep(1000); // ensure withdraw starts first
        depositThread.start();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        if (this.getName().equals("Withdraw")) {
            synchronized (lock) {
                System.out.println("Enter amount to Withdraw:");
                double amt = sc.nextDouble();

                while (amt > balance) {
                    System.out.println("Insufficient Balance! Waiting for deposit...");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                balance -= amt;
                System.out.println("Withdrawal Successful!");
                System.out.println("Balance: " + balance);
            }

        } else if (this.getName().equals("Deposit")) {
            synchronized (lock) {
                System.out.println("Enter amount to Deposit:");
                double amt = sc.nextDouble();

                balance += amt;
                System.out.println("Deposit Successful!");
                System.out.println("Balance: " + balance);

                lock.notify(); // wake up withdraw thread
            }
        }
    }
}
