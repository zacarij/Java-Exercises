//adding error exception
package practica2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    
    public static void main(String[] args) {
    int optionInput = 0;
    String bookName;
    String caseAnswer;
        
    Scanner input = new Scanner (System.in);
        System.out.println("Please, select an option:");
        System.out.println("****************************");
        System.out.println("1.Submit a book");
        System.out.println("2.Submit a magazine");
        System.out.println("3.Reserve a book or magazine");
        System.out.println("****************************");
    
    try {
        optionInput = input.nextInt();
    }    
    catch (InputMismatchException e){
        System.out.println ("Please, select a valid option");
    }    
    switch (optionInput){
        case 1:
            System.out.println("Do you have the following information:");
            System.out.println("Name, Editor, Writer");
            caseAnswer = input.nextLine();
            Scanner bookdetails = new Scanner (System.in);
            if (caseAnswer.equals ("yes")){
               System.out.println("Please, introduce the name");
               bookName = bookdetails.nextLine(); 
                
            } else {
                bookName = bookdetails.nextLine();
                Book book1 = new Book(bookName);
            }
                        
            System.out.println("The book " + book1.getBookName()+ " has been submitted successfully");
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
