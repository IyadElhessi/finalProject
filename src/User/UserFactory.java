/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author HP
 */
public class UserFactory {

    public static User getUser(String className) {
        if (className == null) {
            return null;
        }

        if (className.equalsIgnoreCase("Customer")) {
            return new Customer.CustomerBuilder().createCustomer();
        } else if (className.equalsIgnoreCase("Salesman")) {
            return new Salesman.SalesmanBuilder().createSalesman();
        }
        return null;

    }
}
