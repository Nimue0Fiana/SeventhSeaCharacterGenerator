package com.example.seventhseacharactergenerator.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class JDBC {
    public static Connection connection;  // Connection Interface
    private static final String protocol = "jdbc";
    private static final String vendor = ":sqlite:";
    //private static final String location = "C:\\Users\\Audrey\\IdeaProjects\\SeventhSeaCharacterGenerator\\src\\databases\\";
    private static final String databaseName = "seventhSeaCharacterGen.db";
    private static final String connectionString = protocol + vendor + databaseName;
    /**
     * Opens connection with database, and prints success message to console.
     */
    public static void openConnection() {
        try {
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Closes connection and prints messsage to console.
     */
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    /**
     * Gets JDBC connection.
     *
     * @return Connection
     */
    public static Connection getConnection() {
        return connection;
    }

}
