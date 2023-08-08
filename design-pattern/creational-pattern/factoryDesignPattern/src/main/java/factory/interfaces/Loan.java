package factory.interfaces;

public abstract class Loan {
    String amount;

    Loan(){
        this.setInterest();
    }
    public abstract void setInterest();
}
