package be.vdab.stock;

import be.vdab.parts.Cpu;
import be.vdab.parts.CpuBrand;

public class Store implements Seller {
    private PriceList pricelist;
    private double revenue;


    public Store(){}
    public Store(PriceList pricelist){
        this.pricelist = pricelist;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public PriceList getPricelist() {
        return pricelist;
    }

    public void setPricelist(PriceList pricelist) {
        this.pricelist = pricelist;
    }

    public double getRevenue() {
        return revenue;
    }


    public Cpu orderCpu(CpuBrand[] cpuBrands){

        Cpu cpu = new Cpu(cpuBrands);
        revenue += cpuBrands.length * pricelist.getCpuPrice();
        return cpu;

    }

}
