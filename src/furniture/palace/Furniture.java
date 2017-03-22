/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furniture.palace;

import java.sql.*;
/**
 *
 * @author user
 */
public class Furniture 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {       
        /*Corel ms = new Corel();
        ms.setVisible(true);
        */
        /*
        v1
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            //here sonoo is database name, root is username and password
            try (Connection connect = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/furniture","root","")) 
            {
                //Read From DB
                Statement stmt=connect.createStatement();
                ResultSet rs=stmt.executeQuery("select * from customer");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
            }
        }
        catch(ClassNotFoundException | SQLException e)
        { 
          System.out.println(e);
        }  */
        
        
        //v2
        //DBAccess dao = new DBAccess();
        //dao.writeData();
        
        
    } 
    
}
