/**
 * This program is used to test the HTMLFilteredReader class. Object of the class is created and its functions are called.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02c;
class Lab02c {
  public static void main(String[] args) {

    //creating an object of the HTMLFilteredReader class
    HTMLFilteredReader test = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/housman.htm");
    
    //Main Program
    
    //testing methods
    System.out.println(test.getUnfilteredPageContents());
    System.out.println(test.getPageContents());
      
  }
  
}