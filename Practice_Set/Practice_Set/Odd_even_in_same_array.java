package Practice_Set;
import java.util.Scanner;

public class Odd_even_in_same_array{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int[] numbers = {1,2,4,5,7,9,-2,3};
  int [] result = Odd_Even(numbers);
  System.out.println("Odd-Even Separated Array:");
  for (int num : result) {
     System.out.print(num + " ");
  }
  input.close();
}

  public static int[]Odd_Even(int[] numbers){
  int[] temp = new int[numbers.length];
  for (int i = 0 ,j=0,k=numbers.length-1; i < numbers.length;i++){
   if(numbers[i]% 2 != 0)
   temp[j++]=numbers[i];
   else
   temp[k--]=numbers[i];
  }
  return temp;
  }
}