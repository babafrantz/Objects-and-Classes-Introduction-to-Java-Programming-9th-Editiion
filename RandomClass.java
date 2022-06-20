
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yomol
 */
public class RandomClass {

    public RandomClass() {

    }
    public void first50RandomNumbers() {

         Random randomint = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(randomint.nextInt(70)+ " ");
        }
    }
}

    


