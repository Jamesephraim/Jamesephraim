package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

  class Demo {
    public static void main(String[] args) {
     String sql="select ROLL_NO from register where id=8";
     String url="jdbc:mysql://192.168.55.105:3306/admin";
     String user="admin";
     String pass="admin";
     System.out.println(sql);
        try {
            // Load MySQL JDBC Driver
            //Class.forName("com.mysql.cj.jdbc.Driver");
//
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, pass);  
           System.out.println("✅ Connected to MySQL!");
//
//            // Close connection
           conn.close();
            System.out.println("🔒 Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
