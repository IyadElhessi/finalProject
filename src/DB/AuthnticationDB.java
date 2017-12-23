/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import GUI.CustomerHomeUI;
import GUI.SalesmanHomeUI;
import Login.Register;
import User.User;
import User.UserFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AuthnticationDB {

    Connection connection;
    public static String USER_EMAIL = "NO-YET";

    public AuthnticationDB() throws ClassNotFoundException, SQLException {

        connection = DBConnection.getInstance().getConnection();

    }

    public boolean loginVerfiy() {
        return false;
    }

    public String getType(String email, String password) throws SQLException {
        PreparedStatement statementType;
        String type = "";
        if (email.trim().equals("") || email.trim().equals("")) {

        } else {
            statementType = connection.prepareStatement("SELECT Type FROM authentication where email = ? and password = ?");
            statementType.setString(1, email);
            statementType.setString(2, password);

            ResultSet result = statementType.executeQuery();

            while (result.next()) {
                type = result.getString("type");
            }

        }

        if (!type.equals("")) {
            USER_EMAIL = email;
        }

        return type;
    }

    public boolean register(Register register) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("INSERT INTO customer values(?,?,?,?,?,?,?)");
        statement.setInt(1, Integer.parseInt(register.getId().trim()));
        statement.setString(2, register.getfName());
        statement.setString(3, register.getlName());
        statement.setString(4, register.getPhoneNumber());
        statement.setString(5, register.getEmail());
        statement.setString(6, register.getCountry());
        statement.setString(7, register.getCity());

          if (statement.execute()) {

         statement = connection.prepareStatement("INSERT INTO authentication values(?,?,?,?) ");

         statement.setString(1, register.getEmail());
         statement.setString(2, register.getPassword());
         statement.setInt(3, Integer.parseInt(register.getId()));

         return statement.execute();

         }
         return false;
         }
         

    }


