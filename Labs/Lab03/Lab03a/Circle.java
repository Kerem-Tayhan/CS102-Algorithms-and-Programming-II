/**
 * This class is used to create a circle in the x,y plane and contains the properties of the circle
 * such as its area, location, and if it is selected or not.
 * @author Osama Tanveer
 * @version 1.0, 12 March 2019
 */
public class Circle extends Shape implements Selectable {
   
   // properties
   final double PI = 3.142;
   private int radius;
   public boolean selected;
   
   // constructor
   
   /**
    * Constructor for class Circle. Sets the default location and radius of the cirlce as provided by the user.
    * @param int radius, the radius of the circle.
    * @param int x, the location of the circle on the x-axis.
    * @param int y, the location of the circle on the y-axis.
    */
   public Circle(int radius, int x, int y) {
      this.radius = radius;
      setLocation(x, y);
   }
   
   // methods
   /**
    * This method calculates the area of the circle.
    * @param No input parameters.
    * @return double area, the area of the circle.
    */
   @Override
   public double getArea() {
      double area = PI * radius * radius;
      return area;
   }
   
   /**
    * This method gives information about the cirlce.
    * @param No input parameters.
    * @return String info, the information of the circle.
    */
   @Override
   public String getInfo() {
      String info = "Circle (" + x + ", " + y + ") with radius " + radius + " has an area of " + getArea();
      if (selected) {
         info += " and it is selected.";
      }
      else {
         info += " and it is not selected.";
      }
      return info;
   }
   
   /**
    * This method tells if the circle object is selected or not.
    * @param No input parameters.
    * @return boolean selected, true if selected, false otherwise.
    */
   public boolean getSelected() {
      return selected;
   }
   
   
   /**
    * This method selected or unselected the circle.
    * @param boolean selected, true if selected, false otherwise.
    * @return Does not return anything.
    */
   public void setSelected(boolean selected) {
      this.selected = selected;
   }
   
   
   /**
    * This method tells if the circle contains a point or not.
    * @param int x, which is the x-coordinate of the point to be checked.
    * @param int y, which is the y-coordinate of the point to be checked.
    * @return boolean, true if contains, false if doesn't.
    */
   public boolean contains(int x, int y) {
      if (Math.pow(getX() - x , 2) + Math.pow(getY() - y, 2) < Math.pow (radius, 2)) {
         return true;
      }
      else {
         return false;
      }
   }
}