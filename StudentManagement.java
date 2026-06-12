import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                students.add(new Student(id, name, course));

                System.out.println("Student Added Successfully!");

            }

            else if (choice == 2) {

                System.out.println("\nStudent Records:");

                for (Student s : students) {
                    System.out.println(
                        "ID: " + s.id +
                        " | Name: " + s.name +
                        " | Course: " + s.course
                    );
                }
            }

            else if (choice == 3) {
                System.out.println("Program Closed");
                break;
            }

            else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}