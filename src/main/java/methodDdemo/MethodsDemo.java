package methodDdemo;

public class MethodsDemo {
    public static void main(String[] args) {
        String grade;
        String studentName;
      grade=displayGarde("tom",100);
        System.out.println(grade);
//        getGrade("Tom",100);
//        getGrade("Tommy",10);
//        getGrade("Tomas",80);
//        getGrade("Toma",30);
//        getGrade("Togy",50);
//        String studentNmae = "John ";
//        int score = 100;
//        String grade;
//        if (score >= 90 && score <= 100) {
//            grade = "A";
//        } else if (score >= 80 && score < 90) {
//            grade = "B";
//        } else if (score >= 70 && score < 80) {
//            grade = "C";
//        } else {
//            grade = "d";
//        }
//        System.out.println("Student Grade :" + grade);
        // code above is written under main method whi is not dynamic...so make custom method to do dynamic operations
    }
        public static void getGrade(int score){
       String grade;
       if (score >= 90 && score <= 100) {
           grade = "A";
       } else if (score >= 80 && score < 90) {
           grade = "B";
       } else if (score >= 70 && score < 80) {
           grade = "C"; } else {
            grade = "d";
       }
            System.out.println("Student Grade :" + grade);
       //Out put :Student Grade :A
            //Student Grade :d
            //Student Grade :B
            //Student Grade :d
            //Student Grade :d
        }
        public static String displayGarde(String studentName,int score){
            String grade;
            if (score >= 90 && score <= 100) {
                grade = "A";
            } else if (score >= 80 && score < 90) {
                grade = "B";
            } else if (score >= 70 && score < 80) {
                grade = "C"; } else {
                grade = "d";
            }
            System.out.println("Student Grade :" + grade);
           return grade;

        }

    }

