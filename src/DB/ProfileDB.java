/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import User.Customer;
import User.Salesman;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ProfileDB {

    Connection connection;

    public ProfileDB() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }

    public boolean insertCustomerProfile(Customer customer) throws SQLException {

        int id = Integer.parseInt(customer.getId());
        String firstName = customer.getfName();
        String lastName = customer.getlName();
        String phoneNumber = customer.getPhoneNumber();
        String country = customer.getCountry();
        String city = customer.getCity();
        double balance = customer.getBalance();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO profile_customer values(?,?,?,?,?,?)");

        statement.setInt(1, id);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.setString(4, phoneNumber);
        statement.setString(5, country);
        statement.setString(6, city);
        statement.setDouble(6, balance);

        PreparedStatement statement1 = connection.prepareStatement("SELECT * from profile_customer ");

        return statement1.execute();
    }

}
