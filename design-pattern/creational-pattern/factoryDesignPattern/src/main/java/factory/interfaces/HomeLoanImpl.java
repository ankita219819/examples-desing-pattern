package factory.interfaces;

public class HomeLoanImpl extends Loan{
    @Override
    public void setInterest() {
        System.out.println("its Home loan");
    }
}
