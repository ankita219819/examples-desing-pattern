package factory.interfaces;

public class PersonalLoanImpl extends Loan{

    @Override
    public void setInterest() {
        System.out.println("its personal loan");

    }
}
