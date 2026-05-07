package placement_cell;

import java.sql.*;
import java.util.Scanner;


public class StudentDetails {
	public static void registerStudent(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
        	System.out.println("Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Student Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Department:");
            String department = sc.nextLine();
            sc.nextLine();
            System.out.println("Email Address: ");
            String email = sc.nextLine();
            System.out.println("CGPA Obtained: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();

            String sql = "INSERT INTO student_details (id, name, department, email, cgpa) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setString(4, email);
            ps.setDouble(5, cgpa);
            ps.executeUpdate();

            System.out.println("✅ Student registered successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
        
        public static void viewStudents() {
            try (Connection con = DBConnection.getConnection()) {
                String sql = "SELECT * FROM student_details";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                System.out.printf("\n%-5s %-20s %-5s %-10s %-15s\n", "ID", "Name","Department", "Email", "Cgpa");
                while (rs.next()) {
                    System.out.printf("%-5d %-20s %-10s %-15s %-2f\n",
                            rs.getInt("id"), rs.getString("name"), rs.getString("department"),
                            rs.getString("email"), rs.getDouble("cgpa"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
