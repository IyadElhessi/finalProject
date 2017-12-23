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
public class Salesman extends User {

    private double profitsRate;

    public Salesman(SalesmanBuilder builder) {
        this.setId(builder.id);
        this.setfName(builder.fName);
        this.setlName(builder.lName);
        this.setProfitsRate(builder.profitsRate);
        this.setCountry(builder.country);
        this.setCity(builder.city);
        this.setEmail(builder.email);
        this.setPhoneNumber(builder.phoneNumber);

    }

    public double getProfitsRate() {
        return profitsRate;
    }

    public void setProfitsRate(double profitsRate) {
        this.profitsRate = profitsRate;
    }

    public static class SalesmanBuilder {

        private String id;
        private String fName;
        private String lName;
        private String phoneNumber;
        private String country;
        private String city;
        private String email;
        private double profitsRate;

        public Salesman.SalesmanBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public Salesman.SalesmanBuilder setFName(String fName) {
            this.fName = fName;
            return this;
        }

        public Salesman.SalesmanBuilder setLName(String lName) {
            this.lName = lName;
            return this;
        }

        public Salesman.SalesmanBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Salesman.SalesmanBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Salesman.SalesmanBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public Salesman.SalesmanBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Salesman.SalesmanBuilder setProfitsRate(double profitsRate) {
            this.profitsRate = profitsRate;
            return this;
        }

        public Salesman createSalesman() {

            return new Salesman(this);
        }

    }

}
