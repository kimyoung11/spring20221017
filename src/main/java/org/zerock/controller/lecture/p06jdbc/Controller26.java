package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex26")
public class Controller26 {
	
	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("sub01")
	private void method1() throws SQLException {
		String sql = "INSERT INTO Customers (CustomerName) VALUES (?) ";
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				) {
			pstmt.setString(1, "SON HM");
			
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				int newKey = rs.getInt(1);
				System.out.println(newKey + "번 고객입력됨");
			}
		}
	}
	
	// sub02 : 요청 경로
	// method2()
	// 새 직원을 입력하고 생성된 키를 sysout으로 출력하는 코드 작성
	@RequestMapping("sub02")
	private void method2() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Customers (CustomerName) VALUES (?) ";
		try(Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				){
			pstmt.setString(1, "MMM");
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				int newKey = rs.getInt(1);
				System.out.println(newKey + "번 고객입력됨");
			}
		}
	}
}
