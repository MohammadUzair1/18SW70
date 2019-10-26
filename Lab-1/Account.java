//UML class diagram 
class Account
{
    //instance variable
    protected double balance;
    public void deposit(int amount)
    {
        //no implementation is required
    }//end of method deposit
    public void withdraw(int amount)
    {
        //no implementation is required
    } //end of method withdraw   
}//end of class Account
class SavingAccount extends Account // class SavingAccount inherits class Account
{
    //instance variables
    private double defaultInterestRate = 2.5;
    private double InterestRate ;
    public void setDefaultInterestRate(int rate)
    {
        //no implementation is required
    }
    public void applyMonthlyInterest()
    {
        //no implementation is required
    }
    public static void main(String[] args) {
        
    }// end of main method
}// end of class SavingAccount