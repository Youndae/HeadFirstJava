package Study;

class BankAccount{
    private int balance = 100;//첫 잔고는 100달러

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
}
public class RyanAndMonicaJob implements Runnable{
    private BankAccount account = new BankAccount();
    //두 스레드에서는 모두 이 계좌 하나만 접근하게 된다.
    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();//Runnable객체의 인스턴스를 만든다.
        Thread one = new Thread(theJob);//똑같은 Runnable 객체를 전달하여 스레드 두개를 만든다.
        Thread two = new Thread(theJob);//그러면 두 스레드에서 같은 Runnable 클래스에 들어있는 계좌 인스턴스 하나를 사용하게 된다.
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run(){
        for(int x = 0; x < 10; x++){
            makeWithdrawal(10);
            if(account.getBalance() < 0){
                System.out.println("Overdrawn!");
            }
        }
        //run()메소드에서는 스레드에서 순환문을 돌리면서 매번 반복할때마다 인출을 시도한다.
        //돈을 인출하고나서 잔고를 다시 확인하여 잔고가 마이너스가 되었는지 확인한다.
    }

    private synchronized void makeWithdrawal(int amount){
        if(account.getBalance() >= amount){ //계좌 잔고를 확인하고 돈이 부족하면 메시지를 출력하고 부족하지 않다면 대기상태로 넘어간 다음 나중에 인출과정을 끝낸다.
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try{
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + "complete the withdrawal");
        }else{
            System.out.println("Sorry, not enough for "+Thread.currentThread().getName());
        }
    }
}
