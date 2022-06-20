
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class Account {
    
    private  int id =0;
    private  double balance=0;
    private  static double annualInterestRate=0;
    private Date dateCreated;
    
    public Account(){
        
    }
    
    public Account(int id, double balance,double annualInterestRate){
         this.id=id;
         this.balance=balance;
         Account.annualInterestRate=annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public static double getMonthlyInterestRate(){
       
        return (annualInterestRate/12);
        
    }
    
    public double getMonthlyInterest(double principal){
        
      double Monthlyinterest = Account.getMonthlyInterestRate()*balance;
      
      return Monthlyinterest;
        
    }
    
    public void withdraw(double withdrawAmount){
        
        double starndardBalance = 1000;
        
        if (getBalance()<=starndardBalance){
            
            System.out.println("You do not have a sufficient balance ");
        
        }
        else if (getBalance()<=withdrawAmount){
            System.out.println("You do not have sufficeint balance");
            
        }
        
        else System.out.println("You have withdrawn" + "AUD" + withdrawAmount );
        
    }
    
    public void deposit(double amountDeposited){
        
        System.out.println("you have deposited " + "AUD" + amountDeposited);
        
        System. out.println("Your new balance is" + (amountDeposited+getBalance()));
        
        System.out.println("Your monthly Interest is " + "AUD" + getMonthlyInterest(amountDeposited));
        
        System.out.println(" This amount was deposited on the " + new Date());
    }
    
}
