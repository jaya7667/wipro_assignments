package placement_cell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Companies {
	public static void companies(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Company ID: ");
            int company_id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Company name");
            String company_name = sc.nextLine();
            System.out.println("Enter package");
            int salary= sc.nextInt();
            System.out.println("Enter minimum cgpa required");
            int min_cgpa= sc.nextInt();

            String sql = "INSERT INTO company (company_id, company_name, salary, min_cgpa) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, company_id);
            ps.setString(2, company_name);
            ps.setInt(3, salary);
            ps.setInt(4, min_cgpa);

            ps.executeUpdate();
           
            System.out.println("✅ Entered successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	 public static void viewCompany() {
         try (Connection con = DBConnection.getConnection()) {
             String sql = "SELECT * FROM company";
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql);

             System.out.printf("\n%-5s %-10s %-15s %20s\n", "CompanyID", "CompanyName", "Package", "MinCGPA");
             while (rs.next()) {
                 System.out.printf("%-5d %-20s %-5d %5d\n",
                         rs.getInt("company_id"), rs.getString("company_name"), rs.getInt("salary"), rs.getInt("min_cgpa"));
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
	 }
}
