import java.util.Iterator;
public class IntBagIterator implements Iterator {
  
  private IntBag aBag;
  private int index;
  
  public IntBagIterator(IntBag aBag) {
    this.aBag = aBag;
    this.index = 0;
  }
  
  // methods
  
  public boolean hasNext() {
    if (aBag.size() - 1 > index) {
      return true;
    }
    else {
      return false;
    }
  }

  public Integer next() {
    if (hasNext()) {
      index += 1;
      return aBag.get(index - 1);
    }
    else {
      return null;
    }
  }
}