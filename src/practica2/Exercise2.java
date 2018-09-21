
package practica2;
import java.util.Scanner;
import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
    
    int j;
    int id;
    String Desc;
    Scanner ti = new Scanner (System.in);
    Scanner des = new Scanner (System.in);
    System.out.println ("Submit a ticket:");
    System.out.println ("Press 1 to submit a Service Request or 2 to submit an Incident");
    j = ti.nextInt();
    switch (j){
        case 1:
            exercise2SR service = new exercise2SR();
            Random i = new Random ();
            id = i.nextInt(1 + 20)+1;
            System.out.println("Introduce the description: ");
            Desc = des.nextLine ();
            service.Assign(id, Desc);
            System.out.println("Your ticket information below: ");
            System.out.println ("ID: "+service.getIDR());
            System.out.println ("Description: "+service.getDescR());
            System.out.println ("Assigned Group: "+service.getGroup());
            break;
        case 2:
            exercise2I inci = new exercise2I();
            Random k = new Random();
            id = k.nextInt(1 + 20)+1;
            System.out.println("Introduce la descripcion: ");
            Desc = des.nextLine ();
            inci.Assign(id, Desc);
            System.out.println("Your ticket information below: ");
            System.out.println ("ID: "+inci.getIDR());
            System.out.println ("Description: "+inci.getDescR());
            System.out.println ("Assigned Group: "+inci.getGroup());
            System.out.println ("Priority: "+inci.getPri());
            break;
            
        }
                
    }
    
}
