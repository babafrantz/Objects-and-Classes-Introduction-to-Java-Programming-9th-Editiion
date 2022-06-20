/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class Stock {
    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double CurrentPrice;
    
    
    public Stock(String Symbol,String Name){
        
       this.symbol=Symbol;
       this.name = Name;
    }
    
    public Stock(String Symbol,String Name, double PreviousClosingPrice){
        
       this.symbol=Symbol;
       this.name = Name;
       this.previousClosingPrice=PreviousClosingPrice;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return CurrentPrice;
    }

    public void setCurrentPrice(double CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }
    
    public double getChangePercent(){
        return (getCurrentPrice()- getPreviousClosingPrice())/100 *getCurrentPrice();
    }

    @Override
    public String toString() {
        return "Stock{" + "symbol=" + symbol + ", name=" + name + ", previousClosingPrice=" + previousClosingPrice + ", CurrentPrice=" + CurrentPrice + '}';
    }
    
    
}
