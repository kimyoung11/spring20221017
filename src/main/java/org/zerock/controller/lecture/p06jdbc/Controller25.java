package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex25")
public class Controller25 {

	@Autowired
	private DataSource dataSource;

	@RequestMapping("sub01")
	private void method1() throws SQLException {
		String sql = "insert into myTable07 (col1,col2,col3,col4,col5,col6) values (?,?,?,?,?,?)";

		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, 9999999);
			pstmt.setDouble(2, 29881.333);
			pstmt.setString(3, "hello world");
			pstmt.setString(4, "sql");
			pstmt.setDate(5, new Date(2022, 10, 21));
			pstmt.setTimestamp(6, new Timestamp(20221021));
			int cnt = pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("주입 실패");
		}

	}
	@RequestMapping("sub02")
	private void method2() throws SQLException {
		String sql ="insert into myTable08 (name,age,score,address,birthdate,inserted) values(?,?,?,?,?,?)";
		try(Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setString(1, "KIM");
			pstmt.setInt(2, 10);
			pstmt.setDouble(3, 20.5);
			pstmt.setString(4, "Seoul");
			pstmt.setDate(5, new Date(1, 2, 3));
			pstmt.setTimestamp(6, new Timestamp(1666319345));
			int cnt = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("sub03")
	private void method3() {
		String sql = "select col1,col2,col3,col4,col5,col6 from myTable07";
		
		try(Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				){
					while(rs.next()) {
						int col1 = rs.getInt(1);
						double col2 = rs.getDouble(2);
						String col3 = rs.getString(3);
						String col4 = rs.getString(4);
						Date col5 = rs.getDate(5);
						String col6 = rs.getString(6);
				
						
						System.out.println(col1 + " " + col2 + " " +col3 + " " + col4 + " " +col5 + " " + col6);
					}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

