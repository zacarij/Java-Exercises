/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.util.Scanner;
/**
 *
 * @author zacarij
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int j;
    Scanner ti = new Scanner (System.in);
    
    System.out.println ("Select the type of ticket to create");
    j = ti.nextInt();
    switch (j){
        case 1:
            exercise2SR ticket = new exercise2SR();
            System.out.println("El ID is: "+ticket.getIDR());
            break;
        case 2:
            exercise2I inci = new exercise2I();
            System.out.println("La pri es: "+inci.getPri()+" y el ID es "+inci.getIDR());
            break;
            
        }
        
        
    }
    
}
