/**
 * Class for creating a template for a simple Java program
 * 
 * @author Pat Troy: troy AT uic DOT edu
 */

// Note the name of the class in the following line MUST
// match the name of the file.  This is stored in a file
// named: Template.java 
public class Proj4isiddi5 
{
  
  public static void main (String[] args) 
  {
    System.out.println("Begin Java Exection");
    System.out.println("");


    // put your Java Program here
    String input = SimpleInput.getString(
            "Enter the notes to create a song");
    
    System.out.println ("The user entered a string that is " +
                        input.length() + " characters long.");
    
    System.out.println ("The input contains the following characters:");
      
    for (int i = 0 ; i < input.length() ; i++)
    {
      char note = input.charAt(i);
      String noteRepresentation = "78!9@a#bc$d%ef^g&A*BC(D)EF_G+H";

      
     int x = noteRepresentation.indexOf(note);  // x becomes 15
     int y = noteRepresentation.indexOf('H');  // y becomes 29
     double exponent = (x - y)/12.0;
     double freq = 440.0 * Math.pow (2.0, exponent); // freq becomes 196.0 
      
      System.out.println ("Character at position " + i + " is: "
                         + note + " which is note number "
                         + x + " on the guitar scale.");
    }
    


    System.out.println("");
    System.out.println("End Java Exection");
  }
    
  
} // end of Template class
