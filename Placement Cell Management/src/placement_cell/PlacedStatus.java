package placement_cell;

import java.sql.*;
import java.util.Scanner;

public class PlacedStatus {
	public static void placements(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Student ID: ");
            int student_id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter company ID ");
            int company_id = sc.nextInt();
            System.out.println("Enter status:");
            String status= sc.nextLine();

            String sql = "INSERT INTO placement (student_id, company_id, status) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, student_id);
            ps.setInt(2, company_id);
            ps.setString(3, status);

            ps.executeUpdate();
           
            System.out.println("✅ Entered successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	 public static void viewPlacedStudents() {
         try (Connection con = DBConnection.getConnection()) {
             String sql = "SELECT * FROM placement";
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql);

             System.out.printf("\n%-5s %-10s %-20s\n", "StudentID", "CompanyID","Status");
             while (rs.next()) {
                 System.out.printf("%-5d %-5d %-10s\n",
                         rs.getInt("student_id"), rs.getInt("company_id"), rs.getString("status"));
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
	}

