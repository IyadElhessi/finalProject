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
public class Register extends Registration {

    private String id;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String country;
    private String city;
    private String email;

    public Register(RegisterBuilder builder) {
        this.setUsername(builder.username);
        this.setPassword(builder.password);
        this.setId(id);
        this.setfName(builder.fName);
        this.setlName(builder.lName);
        this.setCountry(builder.country);
        this.setCity(builder.city);
        this.setEmail(builder.email);
        this.setPhoneNumber(builder.phoneNumber);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class RegisterBuilder {

        private String username;
        private String password;
        private String id;
        private String fName;
        private String lName;
        private String phoneNumber;
        private String country;
        private String city;
        private String email;

        public RegisterBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public RegisterBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public RegisterBuilder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public RegisterBuilder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public RegisterBuilder setphoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public RegisterBuilder setcountry(String country) {
            this.country = country;
            return this;
        }

        public RegisterBuilder setcity(String city) {
            this.city = city;
            return this;
        }

        public RegisterBuilder setemail(String email) {
            this.email = email;
            return this;
        }

        public RegisterBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Register createRegister() {

            return new Register(this);
        }
    }

}
