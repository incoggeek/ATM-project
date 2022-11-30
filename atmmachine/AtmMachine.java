package atmmachine;
public class AtmMachine {
    private int currentBalance;
    private int depAmount;
    private int withdrawAmount;

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

}
