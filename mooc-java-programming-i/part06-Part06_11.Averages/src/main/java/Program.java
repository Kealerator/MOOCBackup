import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeRegister grades = new GradeRegister();
        
        grades.addGradeBasedOnPoints(82);
        grades.addGradeBasedOnPoints(83);
        grades.addGradeBasedOnPoints(96);
        grades.addGradeBasedOnPoints(51);
        grades.addGradeBasedOnPoints(48);
        grades.addGradeBasedOnPoints(56);
        grades.addGradeBasedOnPoints(61);

        UserInterface UI = new UserInterface(grades, scan);

        System.out.println();
        UI.printGradeDistribution();
    }
}