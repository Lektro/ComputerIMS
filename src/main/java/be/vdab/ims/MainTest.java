package be.vdab.ims;

import be.vdab.parts.ComputerParts;
import be.vdab.parts.CpuBrand;
import be.vdab.stock.Pricelist;
import be.vdab.stock.Stock;
import be.vdab.stock.Store;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

    Pricelist ls = new Pricelist(500,750,125,150,100);

    Stock st = new Stock(5,2,8,3,2);

    Store alternate = new Store(ls, st);

    ArrayList<ComputerParts> order1 = new ArrayList<>();

    order1.add(alternate.orderCpuBrand(new CpuBrand[]{CpuBrand.AMD}));





    }
}
