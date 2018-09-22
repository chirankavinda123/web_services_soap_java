package com.wijesekara.carsalesoap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;


public class DatabaseConnect {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    
    public DatabaseConnect() {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/carsoapdb","root","");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getData(String brand,String model,String year) throws SQLException{
    
   String query = "SELECT * FROM car_info WHERE brand='"+brand+"' AND model='"+model+"' AND year='"+year+"' ";
    
    rs = stmt.executeQuery(query);
     
     String qunatity="";
     String price="";
     
    while(rs.next()){
       qunatity = rs.getString("quantity");
       price = rs.getString("price");
     }
     
    JSONObject jsonObj = new JSONObject();
    
        try {
            jsonObj.put("qunatity",qunatity);
            jsonObj.put("price",price);
        } catch (JSONException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String reply = jsonObj.toString();
    
     return reply;
    }
    
}
