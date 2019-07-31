package com.stackroute;

import java.sql.*;

public class JdbcMetaDataDemo {
  public void jdbcMetaDataDemo() {
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");

      Connection con=DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sample","root","root");

      DatabaseMetaData dbmd=con.getMetaData();
      String table[]={"TABLE"};
      ResultSet rs=dbmd.getTables(null,null,null,table);

      while(rs.next()){
        System.out.println(rs.getString(3));
      }

      con.close();

    }catch(Exception e){ System.out.println(e);}

  }

}


