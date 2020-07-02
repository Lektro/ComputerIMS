package be.vdab.stock;

import be.vdab.parts.CpuBrand;

public class PriceList {

    private double cpuPrice;
    private double gpuPrice;
    private double ramPrice;
    private double moboPrice;
    private double psuPrice;

    public PriceList() {}

    public PriceList(double cpuPrice, double gpuPrice, double ramPrice, double moboPrice, double psuPrice) {
        this.cpuPrice = cpuPrice;
        this.gpuPrice = gpuPrice;
        this.ramPrice = ramPrice;
        this.moboPrice = moboPrice;
        this.psuPrice = psuPrice;
    }

    /**
     * auto-generator getter and setter
     */
    public double getCpuPrice() {
        return cpuPrice;
    }

    public void setCpuPrice(double cpuPrice) {
        this.cpuPrice = cpuPrice;
    }

    public double getGpuPrice() {
        return gpuPrice;
    }

    public void setGpuPrice(double gpuPrice) {
        this.gpuPrice = gpuPrice;
    }

    public double getRamPrice() {
        return ramPrice;
    }

    public void setRamPrice(double ramPrice) {
        this.ramPrice = ramPrice;
    }

    public double getMoboPrice() {
        return moboPrice;
    }

    public void setMoboPrice(double moboPrice) {
        this.moboPrice = moboPrice;
    }

    public double getPsuPrice() {
        return psuPrice;
    }

    public void setPsuPrice(double psuPrice) {
        this.psuPrice = psuPrice;
    }

}
