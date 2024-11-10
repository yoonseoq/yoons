package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    //board 에다가 연동시켜야함.
   private static final String DB_URL ="jdbc:mariadb://localhost/yoon";
   private static final String DB_USER ="root";
   private static final String DB_PASSWORD = "zxc172019";

   public static Connection getConn() throws SQLException,ClassNotFoundException{
       Class.forName("org.mariadb.jdbc.Driver");
       Connection conn= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
       System.out.println("접속성공");
       return conn;
   }
}

class MyConnectionTest{
    public static void main(String[] args) {
        try (Connection conn = MyConnection.getConn()){
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
