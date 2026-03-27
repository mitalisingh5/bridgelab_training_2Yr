package com.jdvc.PROJECT_ONE;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class students implements IStudent {

    Scanner sc = new Scanner(System.in);
    IConnection icon = new connection();
    Connection con = icon.getConnection();

    @Override
    public void insertStudent() {
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            int mark = sc.nextInt(); sc.nextLine();

            String grade = (mark >= 90) ? "A" : (mark >= 75 ? "B" : "C");
            String result = (mark >= 40) ? "Pass" : "Fail";

            Statement stmt = con.createStatement();
            String q = "INSERT INTO studentmarksheet(name, mark, grade, results) VALUES ('" + name + "', " + mark + ", '" + grade + "', '" + result + "')";
            stmt.executeUpdate(q);
            System.out.println("Student Inserted Successfully!");
        } catch (Exception e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }

    @Override
    public void insertMultipleStudents() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            insertStudent();
        }
    }

    @Override
    public void updateStudent() {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            String grade = (mark >= 90) ? "A" : (mark >= 75 ? "B" : "C");
            String result = (mark >= 40) ? "Pass" : "Fail";

            Statement stmt = con.createStatement();
            String q = "UPDATE studentmarksheet SET mark = " + mark + ", grade = '" + grade + "', results = '" + result + "' WHERE id = " + id;
            stmt.executeUpdate(q);
            System.out.println(" Student Updated Successfully!");
        } catch (Exception e) {
            System.out.println(" Error updating student: " + e.getMessage());
        }
    }

    @Override
    public void updateMultipleStudents() {
        System.out.print("Enter number of students to update: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            updateStudent();
        }
    }

    @Override
    public void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();
            sc.nextLine();
            Statement stmt = con.createStatement();
            String q = "DELETE FROM studentmarksheet WHERE id = " + id;
            stmt.executeUpdate(q);
            System.out.println("Student Deleted Successfully!");
        } catch (Exception e) {
            System.out.println(" Error deleting student: " + e.getMessage());
        }
    }

    @Override
    public void deleteMultipleStudents() {
        System.out.print("Enter number of students to delete: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            deleteStudent();
        }
    }

    @Override
    public void showStudents() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM studentmarksheet");
            System.out.println("Student Marksheet:");
            System.out.println("------------------------------------------");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Mark: " + rs.getInt("mark") +
                                   ", Grade: " + rs.getString("grade") +
                                   ", Result: " + rs.getString("results"));
            }
            System.out.println("------------------------------------------");
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}


