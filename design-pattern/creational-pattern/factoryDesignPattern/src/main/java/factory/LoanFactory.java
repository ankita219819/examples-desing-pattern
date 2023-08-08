package factory;

import factory.interfaces.HomeLoanImpl;
import factory.interfaces.Loan;
import factory.interfaces.PersonalLoanImpl;

public class LoanFactory {
    public Loan getLoanInterest(String interestType){
        if(interestType.equalsIgnoreCase("personal")){
            return new PersonalLoanImpl();
        }
        else{
            return new HomeLoanImpl();
        }
    }

}
