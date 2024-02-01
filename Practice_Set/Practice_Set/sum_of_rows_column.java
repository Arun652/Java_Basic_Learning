package Practice_Set;

import java.util.Scanner;

public class sum_of_rows_column{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int [][] numbers ={{1,2,3,4,},
                     {5,6,7,8},
                     {9,10,11,12}};
                     
  int sum_row=0;
   for (int i=0;  i < 3;i++){
    sum_row=0;
    for(int j=0; j < 4;j++){
    sum_row +=numbers[i][j];
    }
    System.out.println("Sum of Row "+(i+1)+" "+sum_row);
  }

  int sum_column=0;
  for (int i=0;  i<4;i++){
    sum_column=0;
   for(int j=0; j<3;j++){
   sum_column +=numbers[j][i];
   }
   System.out.println("Sum of column "+(i+1)+" "+sum_column);
 }
  input.close();
}
}

