package Practice_Set;

public class max_of_row {
 public static void main(String[] args) {
  int [][] numbers ={{1,10,3,8,},
                     {9,12,6,7},
                     {5,2,11,4}};
                     
   for (int i=0;  i < 3;i++){
    System.out.println("Sum of Row "+(i+1)+" "+getMax(numbers[i]));
  }
 }

  public static int getMax(int[] numbers){
   int max = numbers[0];
   for (int i=0; i<3;i++){
    max = max < numbers[i]?numbers[i]:max;
   }
   return max;
  }
    
}
