import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        int avgScore = 0;
        int numofSubjects = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        numofSubjects = sc.nextInt();
        String[] grade = new String[numofSubjects+1];
         

        for(int i = 0; i < numofSubjects; i++) {
              System.out.println("Enter score for subject " + (i + 1) + ": ");
              int score = sc.nextInt();
              grade[i] = getGrade(score);
              
              avgScore += score;
              
              System.out.println("The grade for subject " + (i + 1) + " with score " + score + " is: " + grade[i]);
          }
           
        avgScore /= numofSubjects;
        System.out.println("The average score is: " + avgScore);
        System.out.println("The overall grade is: " + getGrade(avgScore));  
        grade[numofSubjects] = getGrade(avgScore);

        sc.close();
    }

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
