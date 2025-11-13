package com.jdvc.PROJECT_ONE;

import java.util.Scanner;

public class Menu implements IMenu {

    @Override
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        students st = new students();
        int choice;

        do {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Insert a Student");
            System.out.println("2. Insert Multiple Students");
            System.out.println("3. Update a Student");
            System.out.println("4. Update Multiple Students");
            System.out.println("5. Delete a Student");
            System.out.println("6. Delete Multiple Students");
            System.out.println("7. Show Students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: st.insertStudent(); break;
                case 2: st.insertMultipleStudents(); break;
                case 3: st.updateStudent(); break;
                case 4: st.updateMultipleStudents(); break;
                case 5: st.deleteStudent(); break;
                case 6: st.deleteMultipleStudents(); break;
                case 7: st.showStudents(); break;
                case 8: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}

