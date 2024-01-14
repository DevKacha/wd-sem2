import java.util.Scanner;
public class Lab3_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Enter marks for subject 4: ");
        double subject4 = scanner.nextDouble();

        System.out.print("Enter marks for subject 5: ");
        double subject5 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 5);

        if (percentage >= 60) {
            System.out.println("First Division");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("sencond Division");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Third Division");
        } else {
            System.out.println("fail");
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
