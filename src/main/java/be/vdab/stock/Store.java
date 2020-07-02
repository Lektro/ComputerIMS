package be.vdab.stock;

import be.vdab.parts.CpuBrand;

public class Store extends Pricelist {

    private Pricelist pricelist;
    private Stock stock;

    public Store(Pricelist pricelist, Stock stock){

        this.pricelist = pricelist;
        this.stock = stock;
    }

    @Override
    public CpuBrand getCpuBrand() {

    }
}
