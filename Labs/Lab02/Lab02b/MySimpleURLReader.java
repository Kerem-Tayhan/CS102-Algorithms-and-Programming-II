/**
 * This class is a subclass of the SimpleURLReader class it adds new methods.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02b;
import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader {
  
  private String url; //URL used to create the object
  
  //constructor
  
  /**
   * Constructor for class MySimpleURLReader. Sets the URL name to the name input by the user.
   * @param url, which is a String that is the name of the URL.
   */
  public MySimpleURLReader(String url) {
    super(url); //passes the parameter to the parent class
    this.url = url; //sets the name of the property of this class to the name input by the user
  }
  
  //methods
  
  /**
   * This method returns the URL that was input by the user.
   * @param no input parameters.
   * @return url, which is the URL in String format.
   */
  public String getURL() {
    return this.url; //returns the url that was originally passed by the user as a parameter
  }
  
  /**
   * This method returns the name of the URL that was entered by the user.
   * @param no input parameters.
   * @return url.substring(url.lastIndexOf("/")+1), a String which is the name of the URL.
   */  
  public String getName() {
    return url.substring(url.lastIndexOf("/")+1); //returns the name of the file in the link
  }
  
  /**
   * This method overloads the getPageContents method of the parent class to remove a bug that added null to the start
   * of String.
   * @param no input parameters.
   * @return original.substring(4), a String which does not contain the "null" word.
   */ 
  
  public String getPageContents() {
    String removedNull;
    removedNull = super.getPageContents().replaceAll("null",""); //calling the function of the parent class to get the original text
    return removedNull; 
  }
}