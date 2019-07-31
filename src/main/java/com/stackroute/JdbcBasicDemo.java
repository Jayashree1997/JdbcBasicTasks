package com.stackroute;

import java.sql.*;

  public class JdbcBasicDemo {

    public void displayUser() {
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
      try (
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from user");) {
        while (rs.next()) {
          System.out.println(rs.getString(1));
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }


