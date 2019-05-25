/**
 * This program is used to test the XHTMLFilteredReader class. Object of the class is created and its functions are called.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02d;
class Lab02d {
  public static void main(String[] args) {
    
    //Variable
    
    //creating an object of the XHTMLFilteredReader class 
    XHTMLFilteredReader test = new XHTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/index.html");
    
    //Main Program
    
    //testing the functions
    System.out.println("The increase in file percenntage as we go from non html to html is " + test.calculateOverhead());
    System.out.println();
    System.out.println(test.getLinks());
  }
}