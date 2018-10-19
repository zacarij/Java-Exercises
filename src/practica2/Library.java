//adding error exception
package practica2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    
    public static void main(String[] args) {
    int optionInput = 0;
    String bookName;
    String bookEditor;
    String bookWriter;
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
            Scanner bookdetails = new Scanner (System.in);
            caseAnswer = bookdetails.nextLine();
            if (caseAnswer.equals ("yes")){
               System.out.println("Please, introduce the Name");
               bookName = bookdetails.nextLine();
               System.out.println("Please, introduce the Editor");
               bookEditor = bookdetails.nextLine();
               System.out.println("Please, introduce the Writer");
               bookWriter = bookdetails.nextLine();
               Book bookfull1 = new Book(bookName,bookEditor,bookWriter);
               
               System.out.println("The book: " + bookfull1.getBookName()+" Writer: " + bookfull1.getWriter()+" has been submitted successfully");
            } else {
                System.out.println("Please, introduce the Name");
                bookName = bookdetails.nextLine();
                Book bookShort1 = new Book(bookName);
                System.out.println("The book " + bookShort1.getBookName()+" Writer: " + bookShort1.getWriter()+" has been submitted successfully");
            }            
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
