
package practica2;
import java.util.Scanner;
import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
    
    int optionCase;
    int ticketId;
    String descriptionTicket;
    Scanner scannInput = new Scanner (System.in);
    //Scanner des = new Scanner (System.in);
    System.out.println ("Submit a ticket:");
    System.out.println ("Press 1 to submit a Service Request or 2 to submit an Incident");
    optionCase = scannInput.nextInt();
    while (optionCase == 1 || optionCase == 2) {
           
    switch (optionCase){
        case 1:
            exercise2SR service = new exercise2SR();
            Random i = new Random ();
            ticketId = i.nextInt(1 + 20)+1;
            System.out.println("Introduce the description: ");
            descriptionTicket = scannInput.nextLine ();
            service.Assign(ticketId, descriptionTicket);
            System.out.println("Your ticket information below: ");
            System.out.println ("ID: "+service.getIDR());
            System.out.println ("Description: "+service.getDescR());
            System.out.println ("Assigned Group: "+service.getGroup());
            break;
        case 2:
            exercise2I incident = new exercise2I();
            Random k = new Random();
            ticketId = k.nextInt(1 + 20)+1;
            System.out.println("Introduce la descripcion: ");
            descriptionTicket = scannInput.nextLine ();
            incident.Assign(ticketId, descriptionTicket);
            System.out.println("Your ticket information below: ");
            System.out.println ("ID: "+incident.getIDR());
            System.out.println ("Description: "+incident.getDescR());
            System.out.println ("Assigned Group: "+incident.getGroup());
            System.out.println ("Priority: "+incident.getPri());
            break;
            
        }
     }
    System.out.println ("You selected a wrong option");
    }
    
}
