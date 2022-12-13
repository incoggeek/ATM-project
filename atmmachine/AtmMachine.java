package atmmachine;
public class AtmMachine {
    private int currentBalance;
    private int depAmount;
    private int withdrawAmount;
    private int transferAmount;

    //Getter and setter
    public int getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
    public int getDepAmount() {
        return depAmount;
    }
    public void setDepAmount(int depAmount) {
        this.depAmount = depAmount;
    }
    public int getWithdrawAmount() {
        return withdrawAmount;
    }
    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public int getTransferAmount() {
        return transferAmount;
    }
    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

}
