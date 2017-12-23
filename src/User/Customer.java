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
public class Customer extends User {
    
    private double balance;
    private double price;
    
    public Customer(CustomerBuilder builder) {
        this.setId(builder.id);
        this.setfName(builder.fName);
        this.setlName(builder.lName);
        this.setBalance(builder.balance);
        this.setPrice(builder.price);
        this.setCountry(builder.country);
        this.setCity(builder.city);
        this.setEmail(builder.email);
        this.setPhoneNumber(builder.phoneNumber);
        
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    //****************************************************************************
    public static class CustomerBuilder {
        
        private String id;
        private String fName;
        private String lName;
        private String phoneNumber;
        private String country;
        private String city;
        private String email;
        private double balance;
        private double price;
        
        public Customer.CustomerBuilder setId(String id) {
            this.id = id;
            return this;
        }
        
        public Customer.CustomerBuilder setFName(String fName) {
            this.fName = fName;
            return this;
        }
        
        public Customer.CustomerBuilder setLName(String lName) {
            this.lName = lName;
            return this;
        }
        
        public Customer.CustomerBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        
        public Customer.CustomerBuilder setCountry(String country) {
            this.country = country;
            return this;
        }
        
        public Customer.CustomerBuilder setCity(String city) {
            this.city = city;
            return this;
        }
        
        public Customer.CustomerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        
        public Customer.CustomerBuilder setBalance(double balance) {
            this.balance = balance;
            return this;
        }
        
        public Customer.CustomerBuilder setPrice(double price) {
            this.price = price;
            return this;
        }
        
        public Customer createCustomer() {
            
            return new Customer(this);
        }
    }
}
