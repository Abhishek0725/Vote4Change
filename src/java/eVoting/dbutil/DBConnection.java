/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eVoting.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
    public static Connection con=null;
    static
    {
        try
        {
           Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@//dell-PC:1521/orcl","c##vote4change","vote4change");
            System.out.println("Connected Successfully to the database!");
        }
        catch(ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
            System.out.println("Error in class not found exception!");
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
            System.out.println("Error in connection opening!");
        }
    }
    public static Connection getConnection()
    {
//          System.out.println("2222222222222");
//        System.out.println(con);
      
        return con;
    }
}