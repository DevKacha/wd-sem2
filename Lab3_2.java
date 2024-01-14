//Write a program to 􀆒nd that given number or string is palindrome or not.
import java.util.Scanner;
public class Lab3_2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The Number:");
        int n = sc.nextInt();
        int original;
        int remainder=0;
        int reversed=0;
        original = n;

        while (n != 0){
            
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
    
        if (original == reversed){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Is Not a Palindrome");
        }
       
    }
            
}

