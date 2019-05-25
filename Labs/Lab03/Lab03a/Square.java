/**
 * This class is used to create a square in the x,y plane and contains the properties of the circle
 * such as its area, location, and if it is selected or not. The Rectangle class is extended.
 * @author Osama Tanveer
 * @version 1.0, 12 March 2019
 */
public class Square extends Rectangle implements Selectable {
  
  // properties
  private int side;
  
  // constructor
  /**
   * Constructor for class Square. Sets the default location and sides as provided by the user.
   * @param int side, the side of the rectangle.
   * @param int x, the location of the square on the x-axis.
   * @param int y, the location of the square on the y-axis.
   */
  public Square (int side, int x, int y) {
    super(side, side, x, y);
    this.side = side;
    setLocation(x,y);
  }
  // methods
  /**
   * This method calculates the area of the square.
   * @param No input parameters.
   * @return double super.getArea(), the area of the square using the parent class getArea() method.
   */
  @Override
  public double getArea() {
    return super.getArea();
  }
  
  /**
   * This method gives information about the square.
   * @param No input parameters.
   * @return String info, the information of the square.
   */
  @Override
  public String getInfo() {
    String info = "Square has sides of length " + side + " and an area of " + getArea();
    if (selected) {
      info += " and it is selected.";
    }
    else {
      info += " and it is not selected.";
    }
    return info;
  }
}