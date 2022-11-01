package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("ex27")
public class Controller27 {

	@Autowired
	private DataSource dataSource;

	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql1 = "UPDATE Bank "
				+ "SET balance = balance - 100 "
				+ "WHERE customerId = 2";
		String sql2 = "UPDATE Bank SET balance = balance + 100 "
				+ "WHERE customerId = 1";

		try (Connection con = dataSource.getConnection()) {

			try {
				// autocommit : disabled
				con.setAutoCommit(false);

				Statement stmt1 = con.createStatement();
				stmt1.executeUpdate(sql1);

//				int a = 0;
//				int b = 3 / a; // ArithmeticException;

				Statement stmt2 = con.createStatement();
				stmt2.executeUpdate(sql2);

				con.commit();

			} catch (Exception e) {
				con.rollback();
			}
		}
	}

	@GetMapping("sub02")
	private void method2() {

	}

	@PostMapping("sub02")
	
	private void method3(String fname,String lname,int salary) throws SQLException {
		String sql1 = "INSERT INTO Employees (EmployeeID, LastName, FirstName) values (?,?,?)";
		String sql2 = "INSERT INTO Salary (EmployeeID, salary) values (?,?)";
		
		System.out.println(fname + " " + lname + " " +salary);
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
				PreparedStatement pstmt2 = con.prepareStatement(sql2);
				) {
			
			try {
				int newKey = 0;
				con.setAutoCommit(false);
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					newKey = rs.getInt(1);
				}
				System.out.println(newKey);
				pstmt.setInt(1, newKey);
				pstmt.setString(2, lname);
				pstmt.setString(3, fname);

				pstmt.executeUpdate();
						
				
				pstmt2.setInt(1, newKey);
				pstmt2.setInt(2, salary);
				
				pstmt2.executeUpdate();
				
				con.commit();
			}catch (Exception e) {
				con.rollback();
			}
			
		}

	}
}