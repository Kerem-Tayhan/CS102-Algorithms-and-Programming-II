/**This class is used to test the list class. It creates an instance of the class and checks all the methods.
  * @author Osama Tanveer
  * @version 1.00, 7 May 2019
  **/
public class Lab07 {
  public static void main(String[] args) { 
    
    List list = new List();
    
    // Adding nodes to the head
    list.addToHead("ee");
    list.addToHead("dd");
    list.addToHead("cc");
    list.addToHead("bb");
    list.addToHead("aa");
    System.out.println("Adding to head: " + list);
    
    // Adding nodes to the tail
    list.addToTail("zz");
    System.out.println("Adding to tail: " + list);
    
    // Remove from head
    System.out.println("Item removed: " + list.removeFromHead());
    System.out.println("Removing from head: " + list);
    
    // Get Data
    int index = 2;
    System.out.println("Data at index " + index + " is " + list.getData(index));  
    
    // Print
    list.print();
    System.out.println();
    
    // Print Reverse
    System.out.print("List in reverse: ");
    list.printReverse();
    System.out.println();
    
    // Contains
    String elementToCheck = "cc";
    if (list.contains(elementToCheck)) {
      System.out.println(elementToCheck + " is in list.");
    } 
    else {
      System.out.println(elementToCheck + " is not in list.");
    }
    
    // Ordered
    if (list.isOrdered()) {
      System.out.println("List is in order.");
    }
    else {
      System.out.println("List is not in order.");
    }
    
    // creating from an array with multiple strings
    String arrayOfStrings[] = new String[2];
    arrayOfStrings[0] = "hello";
    arrayOfStrings[1] = "abcdef";
    System.out.println(list.createFrom(arrayOfStrings));
    
    // creating from an array with a single string
    String str = "hello";
    System.out.println(createFrom(str));
    
    // Checking merging uncommon elements of two lists
    List a = new List();
    a.addToTail("A");
    a.addToTail("D");
    a.addToTail("C");
    
    List b = new List();
    b.addToTail("K");
    b.addToTail("B");
    b.addToTail("A");
    b.addToTail("C");
    b.addToTail("R");
    System.out.println(a);
    System.out.println(b);
    System.out.println(merger(a, b));
    
    
    list.addToTail("aa");
    list.addToTail("bb");
    list.addToTail("cc");
    list.addToTail("dd");
    list.addToTail("ee");
    System.out.println(list);
    
    list.removeFromHead();
    list.removeFromHead();
    System.out.println(list);
    
    list.addToTail("Sepehr");
    System.out.println(list);
    
    list.addToTail("X");
    System.out.println(list);
    list.removeFromHead();
    list.removeFromHead();
    System.out.println(list);
  }
  
  
  /** This method is used to create a list from a given array of strings.
    * @param strings the array of strings
    * @return list the list created from the strings
    **/
  public static List createFrom(String[] strings) {
    List list = new List();
    for (int i = 0; i < strings.length; i++) {
      list.addToHead(strings[i]);
    }
    return list;
  }
  
  /** This method is used to create a list from a given string.
    * @param str the string whose elements are to be added to the list
    * @return list the list created from the string
    **/
  public static List createFrom(String str) {
    List list = new List();
    for (int i = 0; i < str.length(); i++) {
      list.addToHead(str.substring(i,i+1));
    }
    return list;
  }
  
  
  /** This method is used to merge two Lists. This merged list contains elements that are not present in both of the lists.
    * @param a the first list
    * @param b the second list
    * @return list the merged list
    **/
  public static List merger (List a, List b) {
    List list = new List();
    // Iterating through the first list and checking
    for (int i = 0 ; a.getData(i) != null ; i++) {
      if (!b.contains(a.getData(i))) {
        list.addToTail(a.getData(i));
      }
    }
    
    // Iterating through the second list and checking
    for (int j = 0 ; b.getData(j) != null ; j++) {
      if (!a.contains(b.getData(j))) {
        list.addToTail(b.getData(j));
      }
    }
    return list;
    
  }
}
