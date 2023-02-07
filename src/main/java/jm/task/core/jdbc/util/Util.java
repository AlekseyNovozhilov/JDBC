package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public  static Connection connection;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/usersdbtest";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "dvalin12";

    public static Connection getConnect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Соединени с Базой данных установлено!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Нет связи с Базой данных!");
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
        System.out.println("Соединение закрыто");
    }

    // реализуйте настройку соеденения с БД
}
