/** This class is used to test the list class using the JUnit tests. It only tests two of the methods.
  * @author Osama Tanveer
  * @version 1.00, 7 May 2019
  **/
import junit.framework.TestCase;

public class JUnitTest extends TestCase {
  
  /** This method is used to test the contains method of the list class.
    * @param none
    * @return none
    **/
  public void testContains() {
    List list = new List();
    
    assertFalse(list.contains("hl"));
    
    list.addToHead("hl");
    assertTrue(list.contains("hl"));
  }
  
  /** This method is used to test the isEmpty method of the list class.
    * @param none
    * @return none
    **/
  public void testIsEmpty() {
    List list = new List();
    list.addToHead("a");
    
    assertFalse(list.isEmpty());
    assertTrue(list.isEmpty());
  }
}