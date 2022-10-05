
import java.util.Scanner;

public class StudentGradeAverage {


    private String name;
    private int quiz1;
    private int quiz2;
    private int midTermTest;
    private int finalExam;

    private int percentGrade;
    private char finalLetterGrade;


    public void readStudentData() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the student's name?");
            name = input.nextLine();

        System.out.println("Quiz 1 score (out of 10 points)?");
            quiz1 = input.nextInt();


        while (quiz1 < 0 || quiz1 > 10) {

            System.out.println("Sorry, but -");
            System.out.println("Quiz 1 score must be between 0 and 10 -");
            System.out.println("Please enter a valid Quiz 1 score: ");
                quiz1 = input.nextInt();
        }


        System.out.println("Quiz 2 score (out of 10 points)?");
            quiz2 = input.nextInt();


        while (quiz2 < 0 || quiz2 > 10) {

            System.out.println("Sorry, but -");
            System.out.println("Quiz 2 score must be between 0 and 10 -");
            System.out.println("Please enter a valid Quiz 2 score: ");
                quiz2 = input.nextInt();
        }


        System.out.println("Midterm score (out of 100 points)?");
            midTermTest = input.nextInt();


        while (midTermTest < 0 || midTermTest > 100) {

            System.out.println("Sorry, but -");
            System.out.println("Midterm score must be between 0 and 100");
            System.out.println("Please enter a valid midterm score: ");
                midTermTest = input.nextInt();
        }


        System.out.println("Final Exam score (out of 100 points)?");
            finalExam = input.nextInt();


        while (finalExam < 0 || finalExam > 100) {

            System.out.println("Sorry, but -");
            System.out.println("Final exam score must be 0 to 100");
            System.out.println("Please enter a valid final exam score: ");
                finalExam = input.nextInt();

        }

    }

    public int getPercentGrade() {
         percentGrade = (int)((double)25 * (quiz1 + quiz2) / 20 + (double) 25 * midTermTest / 100 + (double) 50 * finalExam / 100 + 0.5);
         return percentGrade;
    }


    public char findFinalLetterGrade() {

        if (percentGrade >= 90)
            finalLetterGrade = 'A';
        else if (percentGrade >= 80)
            finalLetterGrade = 'B';
        else if (percentGrade >= 70)
            finalLetterGrade = 'C';
        else if (percentGrade >= 60)
            finalLetterGrade = 'D';
        else
            finalLetterGrade = 'F';
                return finalLetterGrade;
    }

    public void displayStudentData() {


        System.out.println("Student Data List: ");
        System.out.println("Name = " + name);
        System.out.println("Quiz 1 score (out of 10 pts) = " + quiz1);
        System.out.println("Midterm score (out of 100 pts) = " + quiz2);
        System.out.println("Midterm score (out of 100 pts) = " + midTermTest);
        System.out.println("Final exam score (out of 100 pts) = " + finalExam);
        System.out.println(name + "'s Percent Grade = " + percentGrade);
        System.out.println(name + "'s Letter Grade = " + finalLetterGrade);


        Scanner input2 = new Scanner(System.in);
        System.out.println("Correction processing for Student data");

        System.out.println("What is the student's name");
            name = input2.nextLine();

        System.out.println("Name = " + name);

        System.out.println("Quiz 1 score(out of 10 points) = " + quiz1);
        System.out.println("Quiz 1 score(out of 10 pts)? ");
            quiz1 = input2.nextInt();


        while (quiz1 < 0 || quiz1 > 10) {

            System.out.println("Sorry, but -");
            System.out.println("Quiz 1 score must be between 0 and 10 -");
            System.out.println("Please enter a valid Quiz 1 score: ");
            quiz1 = input2.nextInt();
        }

        System.out.println("Quiz 1 score(out of 10 pts) = " + quiz1);
        System.out.println("Quiz 2 score(out of 10 pts) = " + quiz2);
        System.out.println("Quiz 2 score(out of 10 pts)? ");
            quiz2 = input2.nextInt();

        while (quiz2 < 0 || quiz2 > 10) {

            System.out.println("Sorry, but -");
            System.out.println("Quiz 2 score must be between 0 and 10 -");
            System.out.println("Please enter a valid Quiz 2 score: ");
                quiz2 = input2.nextInt();
        }

        System.out.println("Quiz 2 score(out of 10 pts) = " + quiz2);
        System.out.println("Midterm score (out of 100 points) = " + midTermTest);
        System.out.println("Midterm score (out of 100 points)? ");
            midTermTest = input2.nextInt();

        while (midTermTest < 0 || midTermTest > 100) {

            System.out.println("Sorry, but -");
            System.out.println("Midterm score must be between 0 and 100");
            System.out.println("Please enter a valid midterm score: ");
                midTermTest = input2.nextInt();
        }

        System.out.println("Midterm score (out of 100 points) = " + midTermTest);
        System.out.println("Final exam score (out of 100 points) = " + finalExam);
        System.out.println("Final exam score (out of 100 points)? ");
            finalExam = input2.nextInt();

        while (finalExam < 0 || finalExam > 100) {

            System.out.println("Sorry, but -");
            System.out.println("Final exam score must be 0 to 100");
            System.out.println("Please enter a valid final exam score: ");
                finalExam = input2.nextInt();

        }
        
        getPercentGrade();
            System.out.println(name + "'s Percent Grade = " + percentGrade);
        findFinalLetterGrade();
            System.out.println(name + "'s Letter Grade = " + finalLetterGrade);

    }

}


























