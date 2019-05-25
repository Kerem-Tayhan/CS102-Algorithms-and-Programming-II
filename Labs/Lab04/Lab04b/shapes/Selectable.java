/**
 * This interface provides a set of methods, namely, getSelected(), setSelected(), contains(int x, int y).
 * @author Osama Tanveer
 * @version 1.0, 12 March 2019 
 **/
package shapes;
public interface Selectable {
  
  //if the shape is selected or not
  boolean getSelected();
  
  //to select a shape or unselect it
  void setSelected(boolean selected);
  
  // to check if a point is contained in a shape
  boolean contains(int x, int y);
  
}