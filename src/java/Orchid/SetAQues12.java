/*
Write a program to input name, age, salary of 5 persons and 
store them in a database table.
 */
package Orchid;
import java.sql.*;
import java.util.*;
public class SetAQues12 {
    static Connection con = null;
    static Statement stmt = null;
//    static ResultSet rs = null;
    public SetAQues12() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/orchid_employee";
        con = DriverManager.getConnection(url,"root","");
        stmt = con.createStatement();
        
//        String sql = "CREATE TABLE employee(name VARCHAR(20),age INT,salary INT);";
//        int result = stmt.executeUpdate(sql);
//        if(result != -1){
//            System.out.println("Table Created Succesfully");
//        }else{
//            System.out.println("Error in creating Table");
//        }
    }
    public static void insertRecord() throws Exception{
       Scanner s = new Scanner(System.in);
       int age,salary;
       String name;
       for(int i=1; i<=5; i++){
           System.out.println("Enter "+i+" recoRamrd : ");
           System.out.println("Enter name : ");
           name = s.next();
           System.out.println("Enter age : ");
           age = s.nextInt();
           System.out.println("Enter salary : ");
           salary = s.nextInt();
           
           String sql = "INSERT INTO employee(name,age,salary) VALUES('"+name+"','"+age+"','"+salary+"')";
           int result = stmt.executeUpdate(sql);
           if(result != -1){
               System.out.println(i+" record inserted Succesfully ");
           }else{
               System.out.println("Error in insertion");
           }
       }
    }
    public static void main(String[] args)throws Exception {
        new SetAQues12();
        insertRecord();
    }
}
