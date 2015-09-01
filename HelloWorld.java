// HelloWorld.java
/* Test-printing program.
 * This comment is shown as a traditional comment. */
import java.lang.*; // probably not a real package

public class HelloWorld { // camelCasing
  // Java variables can include digits, _, $
  // main method begins execution of the Java application
  public static void main( String[] args ) {
    /** @return nothing
     *  @param String */
    System.out.println( "Hello Aaron! Have a nice day!" );
  } // end main method
  
  public static void hairCut( args ) {
    int price = 25;
    int time = 3;
    String speed = "fast";
    String quality = "good";
    String color = "brown";
  }
} // end class HelloWorld

/* Java Variables
 * 
 * hello good
 * Hello good
 * He_11_10_$ good
 * He 11 10_$ bad
 * 1_Hello bad
 * $hello 
 */

