/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author HP
 */
public class ProductFactory {

    public static Product getProduct(String className) {
        if (className == null) {
            return null;
        }

        if (className.equalsIgnoreCase("Phone")) {
            return new Phone.PhoneBuilder().createPhone();
        } else if (className.equalsIgnoreCase("Computer")) {
            return new Computer.ComputerBuilder().createComputer();
        }
        return null;
    }
}
