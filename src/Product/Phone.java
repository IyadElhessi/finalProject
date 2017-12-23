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
public class Phone extends Product {

    private String memorySize;

    public Phone(PhoneBuilder builder) {

        this.setVersion(builder.version);
        this.setType(builder.type);
        this.setPrice(builder.price);
        this.setNo(builder.No);
        this.setMemorySize(builder.memorySize);

    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * *******************************************************************************************
     */
    public static class PhoneBuilder {

        private String type;
        private String price;
        private String version;
        private String No;
        private String memorySize;

        public Phone.PhoneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Phone.PhoneBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Phone.PhoneBuilder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Phone.PhoneBuilder setNo(String No) {
            this.No = No;
            return this;
        }

        public PhoneBuilder setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        public Phone createPhone() {

            return new Phone(this);
        }

    }

}
