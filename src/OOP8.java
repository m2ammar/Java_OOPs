class Account{

    double calculateInterest(){
        return -1;
    }
}

class SavingAccount extends Account {
    double balance;

    @Override
    public double calculateInterest(){

        double interest=balance * 0.04;
        return interest;
    }

    SavingAccount(double amount){
        this.balance=amount;
    }
}

class FixedDepositAccount extends Account {
    double  depositAmount;

    @Override
    public double calculateInterest() {
        double interest=depositAmount*0.07;
        return interest;
    }

    FixedDepositAccount(double amount){
        this.depositAmount=amount;
    }
}
public class OOP8 {
    public static void main(String[] args) {

        Account a1= new SavingAccount(30000);
        Account a2= new FixedDepositAccount(20000);

        System.out.println(a1.calculateInterest());
        System.out.println(a2.calculateInterest());
    }
}
