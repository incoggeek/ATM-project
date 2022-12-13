package atmmachine;

public class AtmDetails{

    private int cardNo;
    private int pin;
    private String expDate;
    private int cvv;
    private int ifscCode;

    //Constructor
    AtmDetails (int cardNo, int cvv, String expDate, int pin,int ifscCode){
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expDate = expDate;
        this.pin = pin;
        this.ifscCode = ifscCode;
    }

    //Getters and Setters

    public int getCardNo() {
        return cardNo;
    }
    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
    public int getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(int ifscCode) {
        this.ifscCode = ifscCode;
    }

    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

}