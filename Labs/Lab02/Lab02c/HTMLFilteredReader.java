/**
 * This class is a subclass of the MySimpleURLReader class and it adds new methods.
 * @author Osama Tanveer
 * @version 1.0, 5 March 2019
 */
package Lab02c;
import Lab02b.*;

public class HTMLFilteredReader extends MySimpleURLReader {
  
  //properties
  private String url; //to store the URL
  
  //constructor
  /**
   * Constructor for class MySimpleURLReader. Sets the URL name to the name input by the user.
   * @param url, which is a String that is the name of the URL.
   */
  public HTMLFilteredReader(String url) {
    super(url); //passing the parameter to the parent class
    this.url = url; //setting the name of url of this class according to the parameter
  }
  
  //methods
  /**
   * This method returns the contents of a webpage without HTML codes.
   * @param no input parameters.
   * @return withoutHTML, which is a String.
   */
  public String getPageContents() {
    String withoutHTML = ""; //variable to store webpage without html
    String withHTML = super.getPageContents(); //calling the function of the parent class to get the webpage with html 
    boolean ignore = false; //to keep in check the characters that are added to the withoutHTML string
    
    for (int i = 0 ; i < withHTML.length() ; i++) {
      //checking for the start of an html code
      if (withHTML.charAt(i) == '<') {
        ignore = true;
      }
      //checking for the end of the html code
      else if (withHTML.charAt(i) == '>') {
        ignore = false;
      }
      //if html code does not start characters added to the string withHTML
      else if (!ignore) {
        withoutHTML+= withHTML.charAt(i);
      }
    }
    return withoutHTML; //returns the page without the html codes
    
  }
  /**
   * This method returns the contents of a webpage with HTML codes.
   * @param no input parameters.
   * @return super.getPageContent(), which is a String.
   */
  public String getUnfilteredPageContents() {
    return super.getPageContents(); //returns the contents of the page that contains the HTML code
  } 
  
}
