public class ATMModel {

    //Declare user's bank balance
    private int balanceSum;
    
    //Setter method
    public void setBalance(int balanceSum) {
    	this.balanceSum = balanceSum;
    }
    
    public void setBalance(int deposit, int withdraw){
        this.balanceSum = this.balanceSum + deposit - withdraw;
    }
    
    //Getter method
    public int getBalance(){
        return balanceSum;
    }
}
