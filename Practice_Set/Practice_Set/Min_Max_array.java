package Practice_Set;
import java.util.Scanner;

public class Min_Max_array {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] numbers = {1,1,1,2,3,5,4};
      int [] result = Max_Min(numbers);
      System.out.print("MAX :" + result[0] +" MIN :" + result[1]);
      input.close();
    }
      public static int[]Max_Min(int[] numbers){
      int Max=numbers[0];
      int Min=numbers[0];
      for (int i=1; i < numbers.length;i++){
        if (numbers[i]> Max)
           Max = numbers[i];
        if (numbers[i]< Min) {
           Min = numbers[i];
        }
      }
      return new int[]{Max,Min};
      }
    }  

