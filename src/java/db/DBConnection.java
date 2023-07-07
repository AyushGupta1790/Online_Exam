/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;

/**
 *
 * @author asus
 */
public class DBConnection {

    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;

    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
