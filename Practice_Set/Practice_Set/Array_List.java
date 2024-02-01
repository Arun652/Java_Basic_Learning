package Practice_Set;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  ArrayList<Integer> Numbers = new ArrayList<>();
  while (true) {
  displayOptions();
  int n = input.nextInt();
  if (n==1) {
    System.out.println("Enter an Integer: ");
    Numbers.add(input.nextInt());
    System.out.println("Added to list");
  }
  else if (n==2){
    System.out.println("Element you want to Remove");
    int temp = input.nextInt();
    if (Numbers.contains(temp)) {
      Numbers.remove(Integer.valueOf(temp));
    }
    else{
      System.out.println("Not Found");
    }
  }
  else if (n==3) {
    System.out.println(Numbers);
  }
  else if (n==4) {
    System.out.println("Bye!");
    break;
  }
  else if (n<0 || n>4) {
    System.out.println("Invalid option! Please try again");
  }
  }
  input.close();
  }

  public static void displayOptions(){
  System.out.println("1.Add");
  System.out.println("2.Remove");
  System.out.println("3.Display");
  System.out.println("4.Exit");
  }
}
