
package practica2;
/**
 *
 * @author zacarij
 */
import java.util.Scanner;
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner num = new Scanner(System.in);   
    System.out.println("Introduce un numero");
    int nu = num.nextInt();
        if (nu%2 ==0){
            System.out.println("El numero "+nu+" es par");    
        }else {
            System.out.println("El numero "+nu+" es impar");
        }    
    
    }
    
}
