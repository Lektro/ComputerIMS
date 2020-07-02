package be.vdab.parts;

public abstract class ComputerParts {

    public String brand;
    public double price;

    public ComputerParts() {}

    public ComputerParts(String brand, double price){}

    public void addComputerParts(ComputerParts computerParts) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
