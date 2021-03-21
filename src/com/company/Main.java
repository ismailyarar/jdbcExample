package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.connection();
            System.out.println("Bağlantı oluştu");
            String sql="Delete From customers where id=1008";
            statement = connection.prepareStatement(sql);
            int result=statement.executeUpdate();
            System.out.println(result+"Kayıt Silindi");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            assert statement != null;
            statement.close();
            connection.close();
        }
    }
}

/*
select demo
  DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.connection();
            System.out.println("Bağlantı oluştu");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select customername,city from customers");
            while (resultSet.next()){
                System.out.println(resultSet.getString("customername")+" "+resultSet.getString("city"));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            assert statement != null;
            statement.close();
            connection.close();
        }

 selectDemoArray

    DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.connection();
            System.out.println("Bağlantı oluştu");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from customers");
            ArrayList<Customers> customers=new ArrayList<>();
            while(resultSet.next()){
                //customers nesnemize aktarma yaptık
                customers.add(new Customers(
                        resultSet.getString("customerName"),
                        resultSet.getString("city"),
                        resultSet.getDate("birthDate"),
                        resultSet.getString("district"),
                        resultSet.getString("gender"),
                        resultSet.getString("nationality"),
                        resultSet.getInt("age")
                ));
            }
            System.out.println(customers.size());
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            assert statement != null;
            statement.close();
            connection.close();
        }

 insertdemo
 DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.connection();
            System.out.println("Bağlantı oluştu");
            String sql="insert into customers (customername,city,birthdate,district,nationality,gender,age) values(?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"iso");
            statement.setString(2,"Bayburt");
            statement.setDate(3,new Date(1975-07-30));
            statement.setString(4,"Demirözü");
            statement.setString(5,"TR");
            statement.setString(6,"E");
            statement.setInt(7,35);
            int result=statement.executeUpdate();
            System.out.println(result+"Kayıt Eklendi");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            assert statement != null;
            statement.close();
            connection.close();
        }


        update

        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.connection();
            System.out.println("Bağlantı oluştu");
            String sql="update customers set customername=?,city=? where id=1008";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"isonem");
            statement.setString(2,"Bartın");


            int result=statement.executeUpdate();
            System.out.println(result+"Kayıt Güncellendi");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            assert statement != null;
            statement.close();
            connection.close();
        }

 */