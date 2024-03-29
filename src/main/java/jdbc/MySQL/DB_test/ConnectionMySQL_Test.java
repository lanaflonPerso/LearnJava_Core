package jdbc.MySQL.DB_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionMySQL_Test {

    private static String URL = getConfiguration("URL_test");
    private static String USER_NAME = getConfiguration("USER_NAME");
    private static String USER_PASSWORD = getConfiguration("USER_PASSWORD");

    public static Connection getConnection(){
        Connection connection = null;

        try {
//            Class.forName("com.mysql.jdbc.Driver");  // Eto starui zrazec drivera
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
            System.out.println("Connection a data base 'test'");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private static String getConfiguration (String config_Name){
        String appConfigPath = "core/src/main/resources/JDBCConfiguration/MySQL.properties";

        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appProps.getProperty(config_Name);
    }
}
