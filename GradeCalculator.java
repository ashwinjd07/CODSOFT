import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
        double averagePercentage = (double) totalMarks / subjects;

        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade = calculateGrade(averagePercentage);

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
