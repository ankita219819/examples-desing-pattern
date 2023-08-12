import java.util.Objects;

public class AccountCreation {
    private static  AccountCreation accountCreation= null;
    private AccountCreation(){

    }
    public static AccountCreation getInstance(){
        if(!Objects.nonNull(accountCreation)){
            accountCreation= new AccountCreation();
        }
        return accountCreation;
    }

}
