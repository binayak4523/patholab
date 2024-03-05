/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patholabjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author binayak
 */
public class AppEnv {
    public static String dberror;
    public static Connection con;
    public static boolean dbconnect(){
        con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:patholab.db");
            return true;
        }catch(ClassNotFoundException | SQLException e){
            dberror=e.toString();
            return false;
        }
        
    }
}
