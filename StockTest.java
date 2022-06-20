/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class StockTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stock stock = new Stock("ORCL", "ORACLE CORPORATION",34.5);
        
        stock.setCurrentPrice(34.35);
        
        double stocknumber = stock.getChangePercent();
        
        System.out.println("Object Stock created" + stock);
        
        System.out.println(" the percentage change is " + stocknumber);
    }
    
}
