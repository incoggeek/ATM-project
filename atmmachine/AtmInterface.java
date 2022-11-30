package atmmachine;

public interface AtmInterface {
 
    public void viewBalance();
    public void deposit(int depAmount);
    public void withdrawal(int withdrawAmount);
    public void miniStatement();
    
}