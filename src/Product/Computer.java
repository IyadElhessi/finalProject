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
public class Computer extends Product {

    private String HHD;
    private String videoCard;

    public Computer(ComputerBuilder builder) {
        
        this.setHHD(builder.HHD);
        this.setVideoCard(builder.videoCard);
        this.setVersion(builder.version);
        this.setType(builder.type);
        this.setPrice(builder.price);
        this.setNo(builder.No);

    }

    public String getHHD() {
        return HHD;
    }

    public void setHHD(String HHD) {
        this.HHD = HHD;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    /**
     * ***********************************************************************************************************
     */
    public static class ComputerBuilder {

        private String HHD;
        private String videoCard;
        private String type;
        private String price;
        private String version;
        private String No;

        public ComputerBuilder setHHD(String HHD) {
            this.HHD = HHD;
            return this;
        }

        public ComputerBuilder setVideoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public ComputerBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public ComputerBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public ComputerBuilder setVersion(String version) {
            this.version = version;
            return this;
        }
        
        public ComputerBuilder setNo(String No) {
            this.No = No;
            return this;
        }

        public Computer createComputer() {

            return new Computer(this);
        }

    }

}
