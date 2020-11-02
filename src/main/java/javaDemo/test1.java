package javaDemo;

public class test1 {
    public static void main(String[] args) {
        int num=10;
        char chara='a';
        float fl=10.2f;
        double dob=122.234;
        String str= "hello world i am new here";
        System.out.println(str.replace("h","H"));
        char[] strArray= str.toCharArray();
        for(int i =0;i<strArray.length;i++){
            System.out.println("the indexes are : " + i +strArray[i]);
        }
    }
}
