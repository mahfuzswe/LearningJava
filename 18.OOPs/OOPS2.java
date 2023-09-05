// Access Modifiers

public class OOPS2 {
    BankAccount myAcc = new BankAccount();
    myAcc.username = "shanto";
    myAcc.setPassword("12ajdg");
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}
