package students.average;

import javax.swing.JOptionPane;

/**
 *
 * @author mdsjj
 */

public class StudentsAverage {

    public static void main(String[] args) {
        String[] students = {"JORGE", "MARIA"};
        float[][] grades = new float[2][4];
        float sumGrades, studentAverage;
        String status;

        for (int i = 0; i < 2; i++) {
            sumGrades = 0;
            studentAverage = 0;
            
            for (int j = 0; j < 4; j++) {
                grades[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Grade number " + (j + 1) + " of " + students[i]));
                sumGrades = sumGrades + grades[i][j];
            }
            
            studentAverage = sumGrades / 4;
            if (studentAverage < 5.5) {
                status = "failed";
            } else if (studentAverage >= 5.5 && studentAverage <= 7) {
                status = "in recovery";
            } else {
                status = "approved";
            }

            System.out.println("************ report card *************");
            System.out.println("student: " + students[i]);
            System.out.println("grades");
            for (int j1 = 0; j1 < 4; j1++) {
                System.out.println((j1 + 1) + " - " + grades[i][j1]);
            }
            System.out.println("average: " + studentAverage + " - " + status);
        }
    }
}
