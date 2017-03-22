/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furniture.palace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class DBAccess 
{   
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
     public int writeData(String LName, String FName, String Cellphone, String NID, String Mail, String CTY, String Cat)
    {
        int res = 0;
 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
                //here sonoo is database name, root is username and password
                try (Connection connect = DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/furniturepalacedatabase","root","root")) 
                
                {
                    
                    
                     preparedStatement = connect.prepareStatement("insert into CustomerDetails values (default, ?, ?, ?, ?, ?, ?)");
                    // Parameters start with 1
                    //preparedStatement.setString(1, "1");
                    preparedStatement.setString(1, "Lname");
                    preparedStatement.setString(2, "Fname");
                    preparedStatement.setString(3, "Cellphone");
                    preparedStatement.setString(4, "NID");
                    preparedStatement.setString(5, "Mail");
                    preparedStatement.setString(6, "CTY");
                    preparedStatement.setString(7, "CAT");
                    preparedStatement.executeUpdate();


                }
                
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            close();
        }
        return res;
    }
     
    public int writeData(String LName, String FName, String Categ, String Pno, String EAddress, String Pcode)
    {
        int res = 0;
 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
                //here sonoo is database name, root is username and password
                try (Connection connect = DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/furniturepalacedatabase","root","root")) 
                
                {
                    
                    
                      preparedStatement = connect.prepareStatement("insert into carpenterdetails values (default, ?, ?, ?, ?, ?, ?)");
                    // Parameters start with 1
                    //preparedStatement.setString(1, "1");
                    preparedStatement.setString(1, "LName");
                    preparedStatement.setString(2, "FName");
                    preparedStatement.setString(3, "Categ");
                    preparedStatement.setString(4, "Pno");
                    preparedStatement.setString(5, "EAddress");
                    preparedStatement.setString(6, "Pcode");
                    preparedStatement.executeUpdate();


                }
                
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            close();
        }
        return res;
    }
     
     public int writeData(String MaterialName, String SupID, String Quantity, String UnitinStock)
    {
        int res = 0;
 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
                //here sonoo is database name, root is username and password
                try (Connection connect = DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/furniturepalacedatabase","root","root")) 
                
                {
                    
                    
                      preparedStatement = connect.prepareStatement("insert into materiallist values (default, ?, ?, ?, ?)");
                    // Parameters start with 1
                    //preparedStatement.setString(1, "1");
                    preparedStatement.setString(1, "MaterialName");
                    preparedStatement.setString(2, "SupID");
                    preparedStatement.setString(3, "Quantity");
                    preparedStatement.setString(4, "UnitinStock");
                    preparedStatement.executeUpdate();



                }
                
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            close();
        }
        return res;
    }
     
     
    public int writeData(String Toolname, String SupplierID, int CatID, String QuantityperUnit, String UnitPrice, String UnitinStock, String UnitonOrder)
    {
        int res = 0;
 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
                //here sonoo is database name, root is username and password
                try (Connection connect = DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/furniturepalacedatabase","root","root")) 
                
                {
                    
                    
                    preparedStatement = connect.prepareStatement("insert into tools values (default, ?, ?, ?, ?, ?, ?, ?, ?)");
                    // Parameters start with 1
                    //preparedStatement.setString(1, "1");
                    preparedStatement.setString(1, "Toolname");
                    preparedStatement.setString(2, "SupplierID");
                    preparedStatement.setString(3, "CatID");
                    preparedStatement.setString(4, "QuantityperUnit");
                    preparedStatement.setString(5, "UnitPrice");
                    preparedStatement.setString(6, "UnitinStock");
                    preparedStatement.setString(7, "QuantityperUnit");
                    preparedStatement.setString(8, "UnitonOrder");
                    preparedStatement.executeUpdate();



                }
                
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            close();
        }
        return res;
    }
    
    
    // You need to close the resultSet
    private void close() 
    {
        try 
        {
            if (resultSet != null) 
            {
                resultSet.close();
            }

            if (statement != null) 
            {
                statement.close();
            }

            if (connect != null) 
            {
               connect.close();
            }
        }
        catch (Exception e) 
        {}
    }
}
