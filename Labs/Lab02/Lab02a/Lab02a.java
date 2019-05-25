/**
 * This program is used to test the already available SimpleURLReader class. Object of the class is created and its 
 * functions are called.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02a;
import cs1.SimpleURLReader;

class Lab02a {
  public static void main(String[] args) {
   
    //Constants  
    final String URL = "http://www.cs.bilkent.edu.tr/~david/housman.txt";
    
    //Creating an object of the SimpleURLReader class
    SimpleURLReader url = new SimpleURLReader(URL);
    
    
    //Main Program
    
    //prints out the content of the page whose URL is specified 
    System.out.println(url.getPageContents());
    
    //prints out the number of lines of the page whose URL is specified
    System.out.println("The number of lines are " + url.getLineCount());
   
  }
}