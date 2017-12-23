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
public class Authntication extends Registration {
    
    public Authntication(AuthnticationBuilder builder) {
        this.setUsername(builder.username);
        this.setPassword(builder.password);
    }
    
    public static class AuthnticationBuilder {
        
        private String username;
        private String password;
        
        public AuthnticationBuilder setUsername(String username) {
            this.username = username;
            return this;
        }
        
        public AuthnticationBuilder setPassword(String password) {
            this.password = password;
            return this;
        }
        
        public Authntication createAuthntication() {
            
            return new Authntication(this);
        }
    }
}
