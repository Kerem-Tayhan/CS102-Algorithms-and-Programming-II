/**
 * This program is used to test the MySimpleURLReader class. Object of the class is created and its functions are called.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02b;
import cs1.SimpleURLReader;

public class Lab02b {  
  public static void main(String[] args) { 
    
    //Constatns
    
    
    //Variables
    
    //creating an object of the MySimpleURLReader class
    MySimpleURLReader testURL = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt");
    
    //Main Program
    
    //testing methods of the class
    System.out.println(testURL.getPageContents());
    System.out.println(testURL.getLineCount());
    System.out.println(testURL.getURL());
    System.out.println(testURL.getName());
    System.out.println(testURL.getPageContents());
  }
  
}
