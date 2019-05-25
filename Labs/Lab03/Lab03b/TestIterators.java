/**
 * This class is used to test the IntIterator class.
 * @author Osama Tanveer
 * @version 1.0, 19 Februrary 2019
 */
import java.util.Iterator;
public class TestIterators {
  public static void main(String[] args) {
    Iterator i, j;
    IntBag bag = new IntBag();
    
    for (int k = 0 ; k < 5 ; k++) {
      bag.add(k);
    }
    i = new IntBagIterator( bag);
    
    while ( i.hasNext() ) {
      System.out.println( i.next() );
      
      //j = new IntBagIterator( bag);
      j = bag.iterator();
      
      while (j.hasNext()) {
        System.out.println( "--" + j.next() );
      }
    }
  }
}