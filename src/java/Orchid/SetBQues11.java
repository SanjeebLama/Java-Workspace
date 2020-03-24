/*
Q. A database table "product" contains  name, price, qty of some products.
Write a program to read and display all the records along with total amount of each
product.
 */
package Orchid;

import java.sql.*;

public class SetBQues11 {
    static Connection con = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    public SetBQues11() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/orchid_employee";
        con = DriverManager.getConnection(url,"root","");
        stmt = con.createStatement();
        
    }
    public static void displayRecord() throws Exception{
        String name = ""; 
        int price,qty;
        System.out.println("Information");
        String sql = "SELECT * FROM employee";
        
        rs = stmt.executeQuery(sql);
        while(rs.next()){
            name = rs.getString(1);
            price = rs.getInt(3);
            qty = rs.getInt(2);
            System.out.println("Name : "+name+"\nPrice : "+price+"\nQty : "+qty+"\nTotal Price : "+(price*qty));
        }
    }
    public static void main(String[] args) throws Exception {
        new SetBQues11();
        displayRecord();
    }
}
