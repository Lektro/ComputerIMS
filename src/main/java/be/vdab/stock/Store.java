package be.vdab.stock;

import be.vdab.parts.ComputerParts;
import be.vdab.parts.Cpu;
import be.vdab.parts.CpuBrand;
import be.vdab.stock.Pricelist;
import be.vdab.stock.Stock;

public class Store extends ComputerParts {

    private Pricelist pricelist;
    private Stock stock;

    public Store(){}
    public Store(Pricelist pricelist, Stock stock){

        this.pricelist = pricelist;
        this.stock = stock;
    }
    public Cpu orderCpuBrand(CpuBrand[] cpuBrand)  {
        if(stock.getCpu() >0 ) {
            Cpu newCpu = new Cpu();
            stock.setCpu(stock.getCpu() -1 );

        }
        return newCpu;

    }
}
