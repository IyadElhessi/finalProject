/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Product.Computer;
import Product.Phone;
import Product.ProductFactory;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ProdcutsDB {

    Statement st;
    Connection connection;

    public ProdcutsDB() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }

    public boolean insertComputer(Computer computer) throws SQLException {

        int id = Integer.parseInt(computer.getNo());
        String type = computer.getType();
        String version = computer.getVersion();
        String hdd = computer.getHHD();
        String price = computer.getPrice();
        String vedioCard = computer.getVideoCard();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO Computer values(?,?,?,?,?,?)");

        statement.setInt(1, id);
        statement.setString(2, type);
        statement.setString(3, price);
        statement.setString(4, version);
        statement.setString(5, hdd);
        statement.setString(6, vedioCard);
        return statement.execute();
    }
    //********************************************************************************************

    public boolean insertPhone(Phone phone) throws SQLException {

        int id = Integer.parseInt(phone.getNo().trim());
        String type = phone.getType();
        String version = phone.getVersion();
        String memory_Size = phone.getMemorySize();
        String price = phone.getPrice();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO phone values(?,?,?,?,?)");

        statement.setInt(1, id);
        statement.setString(2, type);
        statement.setString(3, price);
        statement.setString(4, version);
        statement.setString(5, memory_Size);
        return statement.execute();
    }

    public DefaultTableModel selectAllPhones() throws SQLException {

        String statementPhone = "SELECT * FROM phone ";
        st = connection.createStatement();
        Phone phone;
        String[] columns = new String[]{
            "Id", "type", "price", "version", "memory_size"
        };

        ResultSet rs = st.executeQuery(statementPhone);

        int rowCount = 0;
        Object[] data = null;
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        while (rs.next()) {
            String type = rs.getString("type");
            String id = rs.getString("id");
            String price = rs.getString("price");
            String version = rs.getString("version");
            String memory_size = rs.getString("memory_size");
            phone = new Phone.PhoneBuilder().setMemorySize(memory_size).setType(type).setPrice(price).setVersion(version).setNo(id).createPhone();
            rowCount++;

            data = new Object[]{phone.getNo(), phone.getType(), phone.getPrice(), phone.getVersion(), phone.getMemorySize()};
            model.addRow(data);
        }

        return model;
    }

    public DefaultTableModel selectAllComputer() throws SQLException {

        String statementComputer = "SELECT * FROM computer ";
        st = connection.createStatement();
        Computer computer;
        String[] columns = new String[]{
            "Id", "type", "price", "version", "HDD", "Video_Card"
        };

        ResultSet rs = st.executeQuery(statementComputer);

        int rowCount = 0;
        Object[] data = null;
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        while (rs.next()) {
            String type = rs.getString("type");
            String id = rs.getString("id");
            String price = rs.getString("price");
            String version = rs.getString("version");
            String hdd = rs.getString("hdd");
            String videoCard = rs.getString("vedio_card");

            computer = new Computer.ComputerBuilder().setHHD(hdd).setType(type).setPrice(price).setVersion(version).setNo(id).setVideoCard(videoCard).createComputer();
            rowCount++;

            data = new Object[]{computer.getNo(), computer.getType(), computer.getPrice(), computer.getVersion(), computer.getHHD(), computer.getVideoCard()};
            model.addRow(data);
        }

        return model;

    }
}
