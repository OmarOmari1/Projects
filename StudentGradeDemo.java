
import java.util.Scanner;

class StudentGradeDemo {

    public static void main(String[] args) {

        
        String doAgain;
        Scanner input3 = new Scanner(System.in);

    
    do {
        
        StudentGradeAverage object = new StudentGradeAverage();
        object.readStudentData();
        object.getPercentGrade();
        object.findFinalLetterGrade();
        object.displayStudentData();

        
        System.out.println("Do again: Processing a new student? (Y for Yes, or N for No)");
        doAgain = input3.nextLine();

    }
    
    while (doAgain.equalsIgnoreCase("y"));

    }
}

