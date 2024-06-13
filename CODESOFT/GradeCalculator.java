import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        int[] credits = new int[numSubjects];
        int totalcredits = 0;
        int[] sgpa = new int[numSubjects];
        int totalsgpa =0;
        System.out.println("Enter the marks obtained (out of 100) and Credits for each subject one by one:");
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
            credits[i] = scanner.nextInt();
            totalcredits += credits[i];
            if(marks[i]>90)
            sgpa[i]=10;
            else if(marks[i]>80)
            sgpa[i]=9;
            else if(marks[i]>70)
            sgpa[i]=8;
            else if(marks[i]>60)
            sgpa[i]=7;
            else if(marks[i]>50)
            sgpa[i]=6;
            else if(marks[i]>40)
            sgpa[i]=5;
            else
            sgpa[i]=4;
            totalsgpa=totalsgpa+ (sgpa[i]*credits[i]);
        }
        scanner.close();
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        String grade;

        if (averagePercentage >= 90) {
            grade = "O";
        } else if (averagePercentage >= 80) {
            grade = "E";
        } else if (averagePercentage >= 70) {
            grade = "A";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade ="C";
        } else if (averagePercentage >= 40) {
            grade ="D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks + " out of " +(numSubjects*100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("SGPA: "+ (float)(totalsgpa/totalcredits));
    }
}