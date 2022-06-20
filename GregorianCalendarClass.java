
import java.util.GregorianCalendar;
import static javax.swing.UIManager.get;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class GregorianCalendarClass {
    
    
    public GregorianCalendarClass(){
        
    }
    
    public void GregorianCalendarClassdate(){
        java.util.GregorianCalendar greg = new java.util.GregorianCalendar();
        
        System.out.println(greg);
        
        greg.setTimeInMillis(1234567898765L);
        
         System.out.println(greg);
        
        System.out.println("The year in question is " + greg.get(GregorianCalendar.YEAR));
        System.out.println("The Month in question is " + greg.get(GregorianCalendar.MONTH));
        System.out.println("The Day in question is " + greg.get(GregorianCalendar.DAY_OF_MONTH));
    }
    
    
    
}
