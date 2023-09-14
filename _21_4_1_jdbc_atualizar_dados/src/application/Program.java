package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement  st = null;
		
		try {
			
			conn = DB.getConnection();
			
			// Atualizando salário de todos os vendedores que pertencem ao departamento com ID 2
			String query = "UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE DepartmentId = ?";
			
			st = conn.prepareStatement(query);
			
			st.setDouble(1, 200.00);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}
}
