/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author HP
 */
public class LoginFactory {

    public static Registration getRegistration(String className) {
        if (className == null) {
            return null;
        }

        if (className.equalsIgnoreCase("Authntication")) {
            return new Authntication.AuthnticationBuilder().createAuthntication();
        } else if (className.equalsIgnoreCase("Register")) {
            return new Register.RegisterBuilder().createRegister();
        }
        return null;

    }
}
