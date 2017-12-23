/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import static DB.AuthnticationDB.USER_EMAIL;
import User.Customer;
import User.Salesman;
import User.User;
import User.UserFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class UsersDB {

    Connection connection;

    public UsersDB() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }

    public boolean insertCustomer(Customer customer) throws SQLException {

        int id = Integer.parseInt(customer.getId());
        String firstName = customer.getfName();
        String lastName = customer.getlName();
        String phoneNumber = customer.getPhoneNumber();
        String country = customer.getCountry();
        String city = customer.getCity();
        double balance = customer.getBalance();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO customer values(?,?,?,?,?,?)");

        statement.setInt(1, id);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.setString(4, phoneNumber);
        statement.setString(5, country);
        statement.setString(6, city);
        statement.setDouble(6, balance);

        return statement.execute();
    }
    //********************************************************************************************

    public User getCustomer() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM customer WHERE email = ? ");
        statement.setString(1, USER_EMAIL);

        ResultSet result = statement.executeQuery();
        User customer = UserFactory.getUser("customer");
        while (result.next()) {
            customer.setId(result.getString("id"));
            customer.setfName(result.getString("fname"));
            customer.setlName(result.getString("lname"));
            customer.setPhoneNumber(result.getString("phoneNum"));
            customer.setEmail(result.getString("email"));
            customer.setCountry(result.getString("country"));
            customer.setCity(result.getString("city"));
        }

        return customer;

    }

    public User getSalesman() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM customer WHERE email = ? ");
        statement.setString(1, USER_EMAIL);

        ResultSet result = statement.executeQuery();
        User salesman = UserFactory.getUser("salesman");
        while (result.next()) {
            salesman.setId(result.getString("id"));
            salesman.setfName(result.getString("fname"));
            salesman.setlName(result.getString("lname"));
            salesman.setPhoneNumber(result.getString("phoneNum"));
            salesman.setCountry(result.getString("country"));
            salesman.setCity(result.getString("city"));
        }

        return salesman;

    }

}
