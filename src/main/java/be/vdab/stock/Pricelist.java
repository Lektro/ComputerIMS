package be.vdab.stock;

import be.vdab.parts.ComputerParts;
import be.vdab.parts.CpuBrand;

public class Pricelist extends Store {

    private double cpuPrice;
    private double gpuPrice;
    private double ramPrice;
    private double moboPrice;
    private double psuPrice;

    private CpuBrand cpuBrand;

    public Pricelist(){
        super();
    }

    public Pricelist(double cpuPrice, double gpuPrice, double ramPrice, double moboPrice, double psuPrice) {
        super();
        this.cpuPrice = cpuPrice;
        this.gpuPrice = gpuPrice;
        this.ramPrice = ramPrice;
        this.moboPrice = moboPrice;
        this.psuPrice = psuPrice;
    }


    /** auto-generator getter and setter */
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

    public CpuBrand getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(CpuBrand cpuBrand) {
        this.cpuBrand = cpuBrand;
    }
}
