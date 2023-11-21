package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/javatest";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root123";

    public static Connection getMySQLConnection() {

        Connection connection;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
