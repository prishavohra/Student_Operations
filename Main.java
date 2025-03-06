// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentFunctions studentFunctions = new StudentFunctions();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add students");
            System.out.println("2. Display students");
            System.out.println("3. Search students by PRN");
            System.out.println("4. Search students by Name");
            System.out.println("5. Search students by Position");
            System.out.println("6. Update students by PRN");
            System.out.println("7. Delete student by PRN");
            System.out.println("8. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentFunctions.addStudent();
                    break;
                case 2:
                    studentFunctions.printStudentDetails();
                    break;
                case 3:
                    studentFunctions.searchByPrn();
                    break;
                case 4:
                    studentFunctions.searchByName();
                    break;
                case 5:
                    studentFunctions.searchByPosition();
                    break;
                case 6:
                    studentFunctions.updateByPrn();
                    break;
                case 7:
                    studentFunctions.deleteStudent();
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }

        } while (choice != 8);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
