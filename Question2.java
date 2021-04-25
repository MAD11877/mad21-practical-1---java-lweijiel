import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
     System.out.print("Enter your Height: ");
    double height = in.nextDouble();
    System.out.print("Enter your weight: ");
    double weight = in.nextDouble();
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     double BMI = weight / (height * height);

     System.out.println(BMI + " kg");
  }
}
