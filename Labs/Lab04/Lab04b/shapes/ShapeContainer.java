/**
 * This class is used to create a list of mulitiple shapes, that is it contains many shapes.
 * Different operations can be carried out on these shapes.
 * @author Osama Tanveer
 * @version 1.0, 12 March 2019
 */
package shapes;
import java.util.ArrayList; 
import java.util.Iterator;
public class ShapeContainer implements Iterable {
  
  // properties
  
  private ArrayList<Shape> shapes;
  
  // constructor
  
  
  /**
   * Constructor for class ShapeContainer. Initiliazes the arraylist with 0 elements.
   * @param no input parameters.
   */
  public ShapeContainer () {
    shapes = new ArrayList<Shape>();
  }
  
  // methods
  
  public int getSize() {
    return shapes.size();
  }
  
  /**
   * This method adds the shape to the container.
   * @param Shape s, which is an object of the class Shape.
   * @return Does not return anything.
   */
  public void add(Shape s) {
    shapes.add(s);
  }
  
  
  /**
   * This method returns the total area of all the shapes in the container.
   * @param No input paramters.
   * @return double totalArea, which is the total area of all the shapes.
   */
  public double getArea() {
    
    double totalArea = 0; // total area of all shapes
    double areaOfOneShape = 0; // area of one shape at a particular array
    
    // calculating areas of all shapes
    for (int i = 0 ; i < shapes.size() ; i++) {
      areaOfOneShape = shapes.get(i).getArea();
      totalArea += areaOfOneShape;
    }
    
    return totalArea;
  }
  
    /**
   * This method tells which shape contains the points whose coordinates are passed to it.
   * @param int x, which is the x-coordinate of the point to check.
   * @param int y, which is the y-coordinate of the point to check.
   * @return Shape shapes.get(i), which is the shape that contains the particular point.
   */
  public Shape contains(int x, int y) {
    for (int i = 0 ; i < shapes.size() ; i++ ) {
      if(((Selectable)shapes.get(i)).contains(x, y)) {
        ((Selectable)shapes.get(i)).setSelected(true);
        return shapes.get(i);
      }
    }
    return null;
  }
  
  
    /**
   * This method removes the selected shape form the container.
   * @param No input parameters.
   * @return Does not return anything.
   */
  public void removeSelected() {
    for (int i = 0 ; i < shapes.size() ; i++) {
      if (((Selectable)shapes.get(i)).getSelected()) {
        shapes.remove(i);
      }
    }
  }
  
  
  /**
   * This method returns the information of all the objects in String format.
   * @param No input paramters.
   * @return String infoAllShapes, which is the information of all the shapes in the container.
   */
  public String toString() {
    String infoAllShapes = "";
    Shape currentShape;
    for (int i = 0 ; i < shapes.size() ; i++ ) {
      currentShape = shapes.get(i);
      infoAllShapes += "The shape at " + i + " is a " + (currentShape.getInfo()) + "\n";  
    }
    return infoAllShapes;
  }
  
  /**
   * This method overrides the iterator method.
   * @param No input paramters.
   * @return Iterator<Shape>
   */
  public Iterator<Shape> iterator() {
    return shapes.iterator();
  }
  
  
  /**
   * This method returns the current number of shapes in the container.
   * @param No input paramters.
   * @return int size, which is the number of shapes in the container.
   */
  public int size() {
     return this.shapes.size();
  }
  
  
  /**
   * This method selects all the shapes at particular coordinates.
   * @param int x, the x coordinate.
   * @param int y, the y coordinate.
   * @return int numberOfShapes, the number of shapes at the particular coordinate.
   */
  public int selectAllAt(int x, int y) {
    int numberOfShapes = 0;
    for (int i = 0 ; i < shapes.size() ; i++) {
      if (((Selectable)shapes.get(i)).contains(x, y)) {
        if ((Selectable)shapes.get(i) != null) {
          ((Selectable)shapes.get(i)).setSelected(true);
          numberOfShapes += 1;
        }
      }
    }
    return numberOfShapes;
  }
}