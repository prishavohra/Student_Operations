// StudentFunctions.java

import java.util.ArrayList;
import java.util.Scanner;

public class StudentFunctions {

    private ArrayList<Student> studentDatabase = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("How many Students ? ");
        int noOfStudent = sc.nextInt();
        for (int i = 0; i < noOfStudent; i++) {
            System.out.println("Enter PRN : ");
            int prn = sc.nextInt();

            System.out.println("Enter Name : ");
            String name = sc.next();

            System.out.println("Enter dob : ");
            String dob = sc.next();

            System.out.println("Enter marks : ");
            double marks = sc.nextDouble();

            System.out.println("Enter position: ");
            int position = sc.nextInt();

            Student s = new Student(prn, name, marks, dob);
            s.setPosition(position);
            studentDatabase.add(s);
        }
    }

    public void printStudentDetails() {
        System.out.println("------Student Details-----");
        System.out.println("PRN\tName\tMarks\tPosition");

        for (Student student : studentDatabase) {
            int prn = student.getPrn();
            String name = student.getName();
            double marks = student.getMarks();
            int position = student.getPosition();

            System.out.println(prn + "\t" + name + "\t" + marks + "\t" + position);
        }
    }

    public boolean deleteStudent() {
        System.out.println("Delete Student");
        System.out.println("Enter PRN: ");
        int prn = sc.nextInt();

        for (int i = 0; i < studentDatabase.size(); i++) {
            if (studentDatabase.get(i).getPrn() == prn) {
                System.out.println(studentDatabase.get(i).getName() + " removed from the Database");
                studentDatabase.remove(i);
                return true;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
        return false;
    }

   public void updateByPrn() {
        System.out.println("Enter PRN : ");
        int prn = sc.nextInt();

        for (Student student : studentDatabase) {
            if (student.getPrn() == prn) {
                System.out.println("Enter New name : ");
                String newName = sc.next();
                student.setName(newName);

                System.out.println("Enter dob : ");
                String dob = sc.next();
                student.setDob(dob);

                System.out.println("Enter marks : ");
                double marks = sc.nextDouble();
                student.setMarks(marks);

                System.out.println("Enter position: ");
                int position = sc.nextInt();
                student.setPosition(position);

                System.out.println("Student with PRN " + prn + " updated successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }


    public void searchByPrn() {
        System.out.println("Enter PRN to search: ");
        int prn = sc.nextInt();

        for (Student student : studentDatabase) {
            if (student.getPrn() == prn) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void searchByName() {
        System.out.println("Enter Name to search: ");
        sc.nextLine(); // Consume newline left-over
        String desiredName = sc.nextLine();

        for (Student student : studentDatabase) {
            if (student.getName().equalsIgnoreCase(desiredName)) {
                System.out.println("Student found: " + student);
                return;
            }
        }

        System.out.println("Student with name '" + desiredName + "' not found.");
    }

    public void searchByPosition() {
        System.out.println("Enter Position to search: ");
        int desiredPosition = sc.nextInt();
        boolean found = false;

        for (Student student : studentDatabase) {
            if (student.getPosition() == desiredPosition) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with position '" + desiredPosition + "' not found.");
        }
    }
}
