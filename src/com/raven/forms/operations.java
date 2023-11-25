/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.forms;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
//import com.sun.jdi.connect.spi.Connection;
import javaapplication8.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author HP
 */
public class operations {
    public static void insertperson(String personname,String email,String contact,String password,String personImagePath){
    
        try {
            Connection mySqlConn= DBConnection.getConnection();
            String mysqlquery="INSERT INTO admininfo(NAME,EMAIL,CONTACT,PASSWORD,IMAGE) VALUES(?,?,?,?,?)";
          
            
            PreparedStatement preparedStatement=mySqlConn.prepareStatement(mysqlquery);
            preparedStatement.setString(1,personname);
            //preparedStatement.setString(2,personname);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,contact);
            preparedStatement.setString(4,password);
              try {
                 InputStream inputStream=new FileInputStream(new File(personImagePath));
                 preparedStatement.setBlob(5,inputStream);
            } catch (Exception e) {
               // JOptionPane.showMessageDialog(frame, "Image error:"+e.getMessage());
            }
              
              try {
                preparedStatement.execute();
                //JOptionPane.showMessageDialog( "Record has been saved");
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(frame, "Data error:"+e.getMessage());
            }
            //preparedStatement.setString(5,);
        } catch (Exception exception) {
            //JOptionPane.showMessageDialog(frame, "Data error:"+exception.getMessage());
            
        }
        
        
    
    
    }
}
