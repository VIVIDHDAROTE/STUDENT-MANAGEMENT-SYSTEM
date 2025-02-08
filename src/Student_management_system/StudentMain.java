package Student_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    private static ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id: ");
        int id = s.nextInt();
        s.nextLine();

        System.out.print("Enter Name: ");
        String name = s.next();
        s.nextLine();

        System.out.print("Enter Age: ");
        int age = s.nextInt();
        s.nextLine();

        System.out.print("Enter City: ");
        String city = s.next();
        s.nextLine();

        list.add(new Student(id, age, name, city));
        System.out.println("Student Added Successfully!");
    }

    public static void viewStudent() {
        if (list.isEmpty()) {
            System.out.println("Not Students! Please Add Student..");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }
    }

    public static void updateStudent() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id: ");
        int id = s.nextInt();
        for (Student student : list) {
            if (student.getId() == id) {

                System.out.print("Enter your name: ");
                String name = s.next();
                s.nextLine();

                System.out.print("Enter your age:");
                int age = s.nextInt();
                s.nextLine();

                System.out.print("Enter your City: ");
                String city = s.next();
                s.nextLine();

                student.setName(name);
                student.setAge(age);
                student.setCity(city);

                System.out.println("Updated Successfully!");
                break;

            }
        }
    }

    public static void searchStudent() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id: ");
        int id = s.nextInt();
        s.nextLine();

        boolean found = false;

        for (Student student : list) {
            if (student.getId() == id) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student of Id: " + id + " not found !");
        }


    }

    public static void deleteStudent() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Id to delete: ");
        int id = s.nextInt();
        s.nextLine();
        Student studentToRemove = null;
        for (Student student : list) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            list.remove(studentToRemove);
            System.out.println("Student delete Successfully! ");
        }
        else {
            System.out.println("Invalid Id:  Student not found !");
        }
    }

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            while(true){
                System.out.println("\nStudent Management System");
                System.out.println("1.Add Student");
                System.out.println("2.View Student");
                System.out.println("3.Update Student");
                System.out.println("4.Search Student");
                System.out.println("5.Delete Student");
                System.out.println("6.Exit");

                System.out.print("Enter your Choice: ");
                int choice=s.nextInt();
                switch (choice){
                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudent();
                        break;

                    case 3:
                        updateStudent();
                        break;

                    case 4:
                        searchStudent();
                        break;

                    case 5:
                        deleteStudent();
                        break;

                    case 6:
                        System.out.println("Exiting....");
                        return;

                    default:
                        System.out.println("Please ! Enter valid Choice !");
                }
            }
        }
}
