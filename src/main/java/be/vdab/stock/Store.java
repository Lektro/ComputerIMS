package be.vdab.stock;

import be.vdab.parts.Cpu;
import be.vdab.parts.CpuBrand;
import be.vdab.parts.Gpu;
import be.vdab.parts.GpuBrand;

public class Store implements Seller {

    private PriceList pricelist;
    private double revenue;
    private Stock stock;

    public Store(){}
    public Store(PriceList pricelist, Stock stock){
        this.pricelist = pricelist;
        this.stock = stock;
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

    /** Method to order CPU */
    public Cpu orderCpu(CpuBrand[] cpuBrands) throws NoMorePartsException {
        if (stock.getCpu() > 0) {
            Cpu cpu = new Cpu(cpuBrands);
            revenue += pricelist.getCpuPrice();
            stock.setCpu(stock.getCpu() - 1);
            return cpu;
        } else throw new NoMorePartsException("Sorry we are out of CPU's!");
    }

    /** Method to order GP */
    public Gpu orderGpu(GpuBrand[] gpuBrands) throws NoMorePartsException {
        if (stock.getGpu() > 0) {
            Gpu gpu = new Gpu(gpuBrands);
            revenue += pricelist.getGpuPrice();
            stock.setCpu(stock.getCpu() - 1);
            return gpu;
        } else throw new NoMorePartsException("Sorry we are out of GPU's!");


    }
}
