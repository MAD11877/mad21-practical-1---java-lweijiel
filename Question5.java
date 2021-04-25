import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Number of numbers:");
    int amtNum = in.nextInt();
    int[] num = new int[amtNum];

    for (int i = 0; i < amtNum; i++ ){
      num[i] = in.nextInt();
    }

    Arrays.sort(num);
    int count = 0;
    int tempCount;
    int most = 0;
    int temp;

    for (int i : num)
    {
      temp = num[i];
      tempCount = 1;

      for (int j = i+1; j < num.length; j++)
      {
        if (temp == num[j]){
          tempCount ++;
        }
      }

      if (tempCount > count){
        most = temp;
        count = tempCount;
      }
    }

    System.out.print(most);
    
  }
}
