
import java.util.Scanner;

/* 
Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
*/
public class student_grade_calc_project2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE STUDENT GRADE CALCULATOR");
        System.out.println("Enter the number of subjects");
        int sub = sc.nextInt();

        int marks[] = new int[sub];
        int total = 0;

        System.out.println("Enter the marks out of 100");

        for (int i = 0; i < sub; i++) {
            System.out.printf("Enter the marks in subject %d \n", i + 1);
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        System.out.println("Your total marks is " + total);

        int average = (total / sub);

        System.out.println("The average percentage of your marks is " + (average));

        if (average >= 95) {

            System.out.println("Your grade is A+");

        } else if (average >= 90) {
            System.out.println("Your grade is A");
        } else if (average >= 80 && average < 90) {
            System.out.println("Your grade is B");
        } else if (average >= 70 && average < 80) {
            System.out.println("Your grade is C");
        } else if (average >= 60 && average < 70) {
            System.out.println("Your grade is D");
        } else if (average >= 33) {
            System.out.println("Your grade is E");
        } else {
            System.out.println("You are fail Bro! :(");
        }


        
        System.out.println("THANKS FOR USING STUDENT GRADE CALCULATOR :) ");
        System.out.println("HAVE A NICE DAY");

    }
}
