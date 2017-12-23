/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Product.Computer;
import Product.Phone;
import java.sql.SQLException;
import javax.swing.DefaultButtonModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FacadeDB {

    ProdcutsDB pdb;

    public FacadeDB() throws ClassNotFoundException, SQLException {
        pdb = new ProdcutsDB();
    }

    public void addComputer(Computer computer) throws SQLException {

        pdb.insertComputer(computer);
    }

    public void addPhone(Phone phone) throws SQLException {

        pdb.insertPhone(phone);
    }

    public DefaultTableModel getAllPhones() throws SQLException {

        return pdb.selectAllPhones();

    }
     public DefaultTableModel getAllComputers() throws SQLException {

        return pdb.selectAllComputer();

    }

}
