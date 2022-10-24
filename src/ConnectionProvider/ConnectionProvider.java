/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ConnectionProvider {
    public static Connection  getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");   // searches for a class of this name(in the jar file)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem","root","Vyshnavi*123#" );
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , e.toString());
            return null;
        }
    }
}
