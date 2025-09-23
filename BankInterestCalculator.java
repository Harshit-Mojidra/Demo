interface Bank {
    void calculateInterest(double principal, double rate, double time);
}
class SBI implements Bank {
    public void calculateInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("SBI Interest: " + interest);
    }
}
class ICICI implements Bank {
    public void calculateInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("ICICI Interest: " + interest);
    }
}

class AXIS implements Bank {
    public void calculateInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("AXIS Interest: " + interest);
    }
}
public class BankInterestCalculator {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        double principal = 100000;
        double rate = 5;          
        double time = 2;          

        sbi.calculateInterest(principal, rate, time);
        icici.calculateInterest(principal, rate, time);
        axis.calculateInterest(principal, rate, time);
    }
}