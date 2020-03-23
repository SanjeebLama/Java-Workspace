/*
Q. Assume a database named "Computer" that contains a table named "processor"
with attributes (processorID,speed,company,cost). Write a program to display the processors
whose company is IBM.
 */
package Nagarjuna;
import java.sql.*;
public class SetAQues4 {
    static Connection con = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static String url;
    public SetAQues4()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/Computer";
        con = DriverManager.getConnection(url,"root","");
        stmt = con.createStatement();
       
    }
    public static void displayResult() throws Exception{
        int pId, speed,cost;
        String company;
        String sql = "SELECT * FROM processor WHERE company = 'IBM'";
        rs = stmt.executeQuery(sql);
        System.out.println("IBM Processor");
        while(rs.next()){
            pId = rs.getInt("processorID");
            speed = rs.getInt("speed");
            cost = rs.getInt("cost");
            company = rs.getString("company");
            System.out.println("Processor ID : "+pId+"\nSpeed : "+speed+"\nCost : "+cost);
        }
    }
    public static void main(String[] args)throws Exception {
        new SetAQues4();
        displayResult();
    }
}
