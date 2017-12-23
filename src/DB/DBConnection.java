/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBConnection {

    private static DBConnection INSTANCE;
    private Connection connection;

    public DBConnection() throws ClassNotFoundException, SQLException {

        this.connection = setConnection();

    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {

        if (INSTANCE == null) {
            return INSTANCE = new DBConnection();
        }

        return INSTANCE;

    }

    private Connection setConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        return connection =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/finalproject", "root", "");

    }

    public Connection getConnection() {
        return connection;
    }

}
