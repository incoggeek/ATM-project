package atmmachine;

public interface AtmInterface {
 
    public void viewBalance();
    public void deposit(int depAmount);
    public void withdrawal(int withdrawAmount);
    public void fundTransfer(int beneficiaryCardNo,int ifscCode,int transferAmount);
    public void miniStatement();
    
}