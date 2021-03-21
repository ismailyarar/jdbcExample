package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "postgres";
    private String password = "123456";
    private String dbUrl = "jdbc:postgresql://localhost/etrade";

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error :" +exception.getMessage());
        System.out.println("Error Code :" +exception.getErrorCode());
    }
}
