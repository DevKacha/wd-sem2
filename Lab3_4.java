//Write a program to check that the given number is prime or not.
import java.util.Scanner;
public class  Lab3_4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter The Number Which You Have TO Check");
      int num = sc.nextInt();
      boolean flag = false;
      for (int i = 2; i <= num / 2; ++i) {
        if (num % i == 0) 
          flag = true;
          break;
        }
      }
  
      if (!flag)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
    }
  }