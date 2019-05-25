/** This class is used to create recursive methods. One of them counts the number of Es in a string, one of them prints
  * binary equivalent of a decimal number, one checks if strings in an arraylist are in lexicographic order, and one
  * that prints n digit even numbers provided that the previous digit is smaller than the next. All of these methods
  * use recursion.
  * @author Osama Tanveer
  * @version 1.00, 30 April 2019
  **/
import java.util.ArrayList;
public class Lab06 {
   
   public static void main(String[] args) {
      
      // Test counting E method
      System.out.println("Part A");
      System.out.println(countE("zebra says hello"));
      
      // Converting decimal to binary
      System.out.println("Part B");
      decimalToBinary(60);
      System.out.println();
      
      // Lexicographic Order
      System.out.println("Part C");
      ArrayList<String> list = new ArrayList<String>();
      list.add("zebra");
      list.add("ant");
      System.out.println(lexicographicOrder(list));
      
      // N digit printing
      System.out.println("Part D");
      nDigit(3);
      
   }
   
   /** This method counts the number of Es in a string recursively.
    * @param str the string
    * @return counter the number of Es
    **/
   public static int countE (String str) {
      int counter = 0;
      
      // Best case scenario 
      if (str.length() == 0) {
         return counter;
      }
      
      // Checking the number of Es
      if (str.substring(0,1).equalsIgnoreCase("e")) {
         counter = 1 + countE(str.substring(1)); // recursion
         return counter;
      }
      
      // If there is no e in the string
      counter = countE(str.substring(1)); // recursion
      return counter;
   }
   
   /** This method prints the binary equivalent of a decimal number recursively.
    * @param decimalNumber the number in decimal 
    **/
   public static void decimalToBinary (int decimalNumber) {
      String binary = "";
      
      if (decimalNumber > 0) {
         decimalToBinary(decimalNumber/2); // recursion 
         System.out.print(decimalNumber%2 + binary);
      }
   }
   
   /** This method checks if the list is in lexicographic order or not.
     * @param list the arraylist of strings
     * @return true if in order, false otherwise
     **/
   public static Boolean lexicographicOrder(ArrayList<String> list) {
      boolean inOrder = false;
      if (list.size() == 1) {
         return true;
      }
      
      if ((list.get(0)).compareTo(list.get(1)) <= 0) {        
         list.remove(0);
         return lexicographicOrder(list); //recursion
      }
      return false;
   }

   /** This method prints n digit even numbers given that the previous digit is smaller than the next one.
     * @param n the number of digits
     **/
   public static void nDigit(int n) {
      
      int startValue = (int) Math.pow(10 , n - 1);
      int endValue = (int) Math.pow(10 , n) - 1;
      
      nDigitHelper(startValue , endValue);
      
      return;
   }
   
   // Helper Methods
   
   private static void nDigitHelper(int currentNum , int limitNum) {
      
      // Base Case 
      if (currentNum == limitNum) {
         return ;
      }
      
      // Recursive Step
      // Check if number is in order
      if (digitInOrder(currentNum)) {
         // Check if even
         if (currentNum % 2 == 0) {
            System.out.println(currentNum);
         }
      }
      
      nDigitHelper(currentNum + 1 , limitNum);
   }
   
   private static boolean digitInOrder(int digit) {
      
      // End Base Case
      if ( digit / 10 == 0) {
         return true;
      }
      
      if ( getLastDigit(digit / 10) < getLastDigit(digit) ) {
         return digitInOrder(digit / 10);
      }    
      
      return false;
   }
   
   private static int getLastDigit(int digit) {
      return digit % 10;
   }
   
}



