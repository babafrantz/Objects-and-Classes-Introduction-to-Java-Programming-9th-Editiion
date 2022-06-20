
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
public class DateClass {
    
    public DateClass(){
     
    }
    
    public void elapsedTime10000(){
         java.util.Date date = new java.util.Date();
         System.out.println("The Normal elapsed time is" + date.getTime());
         System.out.println("Let us set the new time in the date class to 10000");
         System.out.println("Showing 10000 Elapsed Time") ;
         date.setTime(10000);
         System.out.println("The elapsed time since the 1970 is" +  date.getTime()+ "Milliseconds");
         System.out.println(date.toString());
    }
    
    public void elapsedTime100000(){
         java.util.Date date = new java.util.Date();
         System.out.println("The Normal elapsed time is" + date.getTime());
         System.out.println("Let us set the new time in the date class to 100000");
         System.out.println("Showing 100000 Elapsed Time") ;
         date.setTime(100000);
         System.out.println("The elapsed time since the 1970 is" +  date.getTime()+ "Milliseconds");
         System.out.println(date.toString());
    
}
    
    public void elapsedTime1000000(){
         java.util.Date date = new java.util.Date();
         System.out.println("The Normal elapsed time is" + date.getTime());
         System.out.println("Let us set the new time in the date class to 1000000");
         System.out.println("Showing 100000 Elapsed Time") ;
         date.setTime(1000000);
         System.out.println("The elapsed time since the 1970 is" +  date.getTime()+ "Milliseconds");
         System.out.println(date.toString());
    
}
    
    public void elapsedTime10000000(){
         java.util.Date date = new java.util.Date();
         System.out.println("The Normal elapsed time is" + date.getTime());
         System.out.println("Let us set the new time in the date class to 10000000");
         System.out.println("Showing 10000000 Elapsed Time") ;
         date.setTime(10000000);
         System.out.println("The elapsed time since the 1970 is" +  date.getTime()+ "Milliseconds");
         System.out.println(date.toString());
    
}
    
     public void elapsedTime100000000(){
         java.util.Date date = new java.util.Date();
         System.out.println("The Normal elapsed time is" + date.getTime());
         System.out.println("Let us set the new time in the date class to 100000000");
         System.out.println("Showing 100000000 Elapsed Time") ;
         date.setTime(100000000);
         System.out.println("The elapsed time since the 1970 is" +  date.getTime()+ "Milliseconds");
         System.out.println(date.toString());
    
}
}
