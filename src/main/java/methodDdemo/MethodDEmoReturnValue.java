package methodDdemo;

import sun.usagetracker.UsageTrackerClient;

public class MethodDEmoReturnValue {
    public static void main(String[] args) {
        String newGrade= getGrade(  1);
       String studentName="tom";
        displayGrade(studentName,newGrade);
    }

    public static String getGrade(int score) {
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else {
            grade = "d";
        }

        return grade;
    }
    public static void displayGrade(String studentName,String grade){

        System.out.println(studentName+" grade is : "+grade);

    }
}
