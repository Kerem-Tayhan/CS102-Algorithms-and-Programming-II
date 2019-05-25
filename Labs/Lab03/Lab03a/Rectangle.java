/**
 * This class is used to create a rectangle in the x,y plane and contains the properties of the rectangle
 * such as its area, location, and if it is selected or not.
 * @author Osama Tanveer
 * @version 1.0, 12 March 2019
 */
public class Rectangle extends Shape implements Selectable {
  
  private int sides;
  private int width;
  private int height;
  public boolean selected; 
  
  /**
   * Constructor for class Rectangle. Sets the default location, width and height of the cirlce as provided by the user.
   * @param int width, the width of the rectangle.
   * @param int height, the height of the rectangle.
   * @param int x, the location of the rectangle on the x-axis.
   * @param int y, the location of the rectangle on the y-axis.
   */
  public Rectangle (int width, int height, int x, int y) {
    this.width = width;
    this.height = height;
    setLocation(x, y);
  }
  
  /**
   * This method calculates the area of the rectangle.
   * @param No input parameters.
   * @return double area, the area of the rectangle.
   */
  @Override
  public double getArea() {
    double area;
    area = (double) width * height; 
    return area;
  }
  
  /**
   * This method gives information about the rectangle.
   * @param No input parameters.
   * @return String info, the information of the rectangle.
   */
  @Override
  public String getInfo() {
    String info = "Rectangle (" + x +", " + y + ") with height " + height + " and width " + width + " has an area of " + getArea();
    if (selected) {
      info += " and it is selected.";
    }
    else {
      info += " and it is not selected.";
    }
    return info;
  }
  
  
  /**
   * This method tells if the rectangle object is selected or not.
   * @param No input parameters.
   * @return boolean selected, true if selected, false otherwise.
   */
  public boolean getSelected() {
    return selected;
  }
  
  /**
   * This method selected or unselected the rectangle.
   * @param boolean selected, true if selected, false otherwise.
   * @return Does not return anything.
   */
  public void setSelected(boolean selected) {
    this.selected = selected;
  }
  
  /**
   * This method tells if the rectangle contains a point or not.
   * @param int x, which is the x-coordinate of the point to be checked.
   * @param int y, which is the y-coordinate of the point to be checked.
   * @return boolean, true if contains, false if doesn't.
   */
  public boolean contains (int x, int y) {
    if ((getX() <= x) && (x <= getX() + width) && (getY() <= y) && (y <= getY() + height)) {
      return true;
    }
    else {
      return false;
    }
  } 
}