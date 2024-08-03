package com.hrms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hrms.model.RegisterModel;
import com.hrms.util.DBConnection;

public class RegisterDaoImpl implements RegisterDao {

    @Override
    public int registerUser(RegisterModel model) {
        Connection myConnection = null;
        PreparedStatement mysmt = null;
        int row = 0;
        try {
            myConnection = DBConnection.getConnection();
            mysmt = myConnection.prepareStatement(
                "INSERT INTO registerUser (userName, email, address, mobileNumber, topic, registerDate, parentContact) VALUES (?, ?, ?, ?, ?, ?, ?)"
            );

            mysmt.setString(1, model.getUserName());
            mysmt.setString(2, model.getEmail());
            mysmt.setString(3, model.getAddress());
            mysmt.setString(4, String.valueOf(model.getMobileNumber())); // Change to String for mobile numbers
            mysmt.setString(5, "java"); // Modify as necessary
            mysmt.setDate(6, new java.sql.Date(model.getRegisterDate().getTime())); // Convert java.util.Date to java.sql.Date
            mysmt.setString(7, model.getParentContact());

            row = mysmt.executeUpdate();

            if (row > 0) {
                System.out.println("Inserted");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (mysmt != null) mysmt.close();
                if (myConnection != null) myConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }
}
