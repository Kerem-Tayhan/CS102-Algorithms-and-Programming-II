/**
 * This program creates an interface for the user that allows them to create a collection of poems. According to the 
 * options presented, the user can perform certain operations. The user can add the URL of a file or a webpage. The 
 * user can also see the collection and choose which poem to view from the index.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02e;
import Lab02b.MySimpleURLReader;
import Lab02c.HTMLFilteredReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab02e {
  public static void main(String[] args) {
    
    //Constants
    
    //Variables
    
    ArrayList<MySimpleURLReader> collection = new ArrayList<MySimpleURLReader>(); //creating a collection
    Scanner scan = new Scanner(System.in); //creating a scanner object
    int option; //a variable to store the option that the user chooses
    String URL; //a variable to store the URL of the link 
    
    //Main Program
    
    //presenting the user with menu
    System.out.println("(1) Enter the url of the poem to add to collection.");
    System.out.println("(2) List all poems in the collection.");
    System.out.println("(3) Quit.");
    
    
    do {
      System.out.print("Choose an option: ");
      option = scan.nextInt();
      
      //checking option 1 and carrying out its specific operations
      if (option == 1) {
        System.out.print("Enter the URL of the poem: ");
        URL = scan.next();
        MySimpleURLReader temp;
        //creating an object according to the type of the file in which the poem is stored
        if (URL.substring(URL.length()-4).equals("txt")){
          temp = new MySimpleURLReader(URL); //for text files
        }
        else {
          temp = new HTMLFilteredReader(URL); //for htm files
        }
        collection.add(temp); //addition of the files to the collection
      }
      
      //checking operation 2 and carrying out its specific operations
      if (option == 2) {
        //presenting the user with the list of the objects in the collection along with their index
        for (int i = 0 ; i < collection.size() ; i++) {
          System.out.println(i + " " + collection.get(i).getName());         
        }
        
        //asking the user for the index of the file they want to view
        System.out.print("Enter the index corresponding to the name of the poem to view: ");
        int index = scan.nextInt();
        
        //printing out the content of the object whose index position was entered by the user
        System.out.print(collection.get(index).getPageContents());
 
        System.out.print("To return to the menu enter any number:  ");
        option = scan.nextInt();
      }
      
    }
    while (option != 3); //the program terminates if the option input by the user is 3
  }
}