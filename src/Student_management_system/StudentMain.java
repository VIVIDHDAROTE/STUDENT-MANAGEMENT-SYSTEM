package Student_management_system;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class StudentMain {
        private static ArrayList<Student> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        public static void addStudent(){
                Scanner s=new Scanner(System.in);
                System.out.println("Enter Id: ");
                int id=s.nextInt();
                s.nextLine();

                System.out.println("Enter Name: ");
                String name= s.next();
                s.nextLine();

                System.out.println("Enter Age: ");
                int age=s.nextInt();
                s.nextLine();

                System.out.println("Enter City: ");
                String city=s.next();
                s.nextLine();

                list.add(new Student(id,age,name,city));
                System.out.println("Student Added Successfully!");
        }

        public static void viewStudent(){
                if(list.isEmpty()){
                        System.out.println("Student Not Found");
                }
                else{
                        for(int i=0;i<list.size();i++){
                                System.out.println(list.get(i));
                        }

                }
        }

        public static void updateStudent(){
                Scanner s=new Scanner(System.in);
                System.out.println("Enter Id: ");
                int id=s.nextInt();
                for(int i=0;i<list.size();i++){
                        if(i==id){
                               Student o=list.get(i);

                               System.out.println("Enter your name: ");
                               String name=s.next();
                               s.nextLine();

                               System.out.println("Enter your age:");
                               int age=s.nextInt();
                               s.nextLine();

                                System.out.println("Enter your City: ");
                                String city=s.next();
                                s.nextLine();

                                o.setName(name);
                                o.setAge(age);
                                o.setCity(city);

                                System.out.println("Updated Successfully!");

                        }
                }
        }

}