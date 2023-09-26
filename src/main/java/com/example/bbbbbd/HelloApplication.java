package com.example.bbbbbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/buysell";
        String username = "root";
        String password = "Pa$$w0rd";
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connecting to a selected database...");
        Statement statement = conn.createStatement();
        String sql="DELETE FROM products WHERE id>100";
       int rows=statement.executeUpdate(sql);
        System.out.println("delete " + rows);
        sql="SELECT * FROM products";
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            String id = resultSet.getString("city");
            System.out.println("---"+ id);
        }

        statement.close();
        conn.close();
    }


}