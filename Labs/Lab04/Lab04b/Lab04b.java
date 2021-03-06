/**
 * This class is used to create a frame of the game.
 * @author Osama Tanveer
 * @version 1.0, 2 April 2019
 */
import javax.swing.*;
public class Lab04b extends JFrame {
  
  /**
   * Constructor for class Lab04b. Sets the window and initilizes the game.
   * @param No input parameters.
   */
  public Lab04b () {
    this.setTitle("Balloon Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    BalloonsGamePanel gamePanel = new BalloonsGamePanel();
    this.add(gamePanel);
    this.pack();
  }
  public static void main(String[] args) {
    Lab04b game = new Lab04b();
    }
}