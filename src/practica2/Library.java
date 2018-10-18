
package practica2;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
    int optionInput;
    Scanner input = new Scanner (System.in);
        System.out.println("Please, select an option:");
        System.out.println("****************************");
        System.out.println("1.Submit a book or magazine");
        System.out.println("2.Reserve a book");
        System.out.println("3.Reserve a magazine");
        System.out.println("****************************");
    
    optionInput = input.nextInt();
    
    switch (optionInput){
        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        }
    
    }
    
}
