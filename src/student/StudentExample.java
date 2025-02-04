package student;


import java.util.Arrays;
import java.util.List;

public class StudentExample {

/*
  String name;
  int age;
    int rollnumber;
*/

    StudentExample(String name,int age,int rollnumber){
        age=age;
        name=name;
        rollnumber=rollnumber;
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollnumber);
    }
    public static void main(String a[]){

        StudentExample s=new StudentExample("Vividh",21,111);
        List<String> list = Arrays.asList("Monday", "Tuesday");



    }
}

