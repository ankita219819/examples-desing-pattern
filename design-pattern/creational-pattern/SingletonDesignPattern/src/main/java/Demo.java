//trying something
public class Demo {

    public static void main( String[] args){
        AccountCreation accountCreation= AccountCreation.getInstance();
        System.out.println(accountCreation);
        AccountCreation accountCreation2= AccountCreation.getInstance();
        System.out.println(accountCreation2);
    }
}