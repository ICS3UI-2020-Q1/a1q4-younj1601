import java.util.Scanner;
/**
 * This program will find the slope of two points
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for the x and y points, declare and initialize the points
    System.out.println("Please enter in the x coordinate of the first point");
    int x1 = input.nextInt();
    System.out.println("Please enter in the y coordinate of the first point");
    int y1 = input.nextInt();
    System.out.println("Please enter in the x coordinate of the second point");
    int x2 = input.nextInt();
    System.out.println("Please enter in the y coordinate of the second point");
    int y2 = input.nextInt();

    //calculate, declare and intialize slope
    int slope = (y2 - y1) / (x2 -x1);

    //tell the user the slope
    System.out.println("The slope of your line would be " + slope + ".");
    
  }
}
