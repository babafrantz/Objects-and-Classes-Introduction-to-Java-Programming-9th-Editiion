/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account account1 = new Account(1122,20000,4.5);
        
        System.out.println("Let us perform a withdrawal");
        
         System.out.println("+++++++++++++++++++++++++");
        
        account1.withdraw(2000);
        
         System.out.println("Let us perform a Deposit");
         
         System.out.println("+++++++++++++++++++++++++");
        
        account1.deposit(3000);
        
        
    }
    
}
