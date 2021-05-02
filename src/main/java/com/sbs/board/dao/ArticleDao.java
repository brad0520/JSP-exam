package com.sbs.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sbs.board.Article;

public class ArticleDao {
	String url = "jdbc:mysql://localhost:3306/board?serverTimezone=UTC";
	String id = "sbsst";
	String pw = "sbs123414";

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pw); // 연결.

		return conn;
	}

	private void close(Statement stmt, Connection conn) throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

	private void close(ResultSet rs, Statement stmt, Connection conn) throws SQLException {
		if (rs != null) {
			rs.close();
		}
		close(stmt, conn);
	}

	public ArrayList<Article> getArticles() throws ClassNotFoundException, SQLException {

		Connection conn = getConnection();

		String sql = "select * from article";

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		ArrayList<Article> articles = new ArrayList<Article>();

		while (rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String body = rs.getString("body");

			Article a = new Article(id, title, body);
			articles.add(a);

		}

		close(rs, stmt, conn);
		
		return articles;
	}

	public void insertArticle(String title, String body) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		String sql = "insert into article set name = '" + title + "', `body` = '" + body;
		
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
		close(stmt, conn);

	}
	
	public void deleteAddr(int idx) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		String sql = "DELETE FROM t_addr_info WHERE idx = " + idx;
		
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
		close(stmt, conn);
	}
	
	public void updateAddr(String name, String address, String phone, int idx) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		String sql = "update t_addr_info set name = '" + name + "', address = '" + address + "', phone = '" + phone
				+ "' WHERE idx = " + idx;

		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
		close(stmt, conn);
	}

//	public ArrayList<Article> searchedList(String keyword) throws ClassNotFoundException, SQLException {
//		
//		Connection conn = getConnection();
//
//		String sql = "SELECT * FROM t_addr_info WHERE `name` LIKE '%" + keyword + "%'";
//
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(sql);
//
//		ArrayList<Article> addrList = new ArrayList<Article>();
//
//		while (rs.next()) {
//			int idx = rs.getInt("idx");
//			String name = rs.getString("name");
//			String address = rs.getString("address");
//			String phone = rs.getString("phone");
//			String regDate = rs.getString("regDate");
//
//			Article a = new Article(idx, name, address, phone, regDate);
//			addrList.add(a);
//
//		}
//
//		close(rs, stmt, conn);
//		
//		return addrList;
//	}

}
