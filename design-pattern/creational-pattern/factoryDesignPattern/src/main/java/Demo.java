import factory.LoanFactory;

//trying something
public class Demo {

    public static void main( String[] args){
        LoanFactory loanFactory=new LoanFactory();
        loanFactory.getLoanInterest("personal");
        loanFactory.getLoanInterest("home");
    }
}
