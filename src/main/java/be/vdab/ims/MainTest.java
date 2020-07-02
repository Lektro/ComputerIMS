package be.vdab.ims;

import be.vdab.parts.ComputerParts;
import be.vdab.parts.CpuBrand;
import be.vdab.stock.*;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) throws NoMorePartsException {

    PriceList ls = new PriceList(500,750,125,150,100);

    Stock st = new Stock(2,2,8,3,2);

    Seller alternate = new Store(ls, st);

    ArrayList<ComputerParts> order1 = new ArrayList<>();

    order1.add(alternate.orderCpu(new CpuBrand[]{CpuBrand.AMD}));
    order1.add(alternate.orderCpu(new CpuBrand[]{CpuBrand.INTEL}));
    order1.add(alternate.orderCpu(new CpuBrand[]{CpuBrand.ARM}));

    System.out.println(alternate.getRevenue());

    }
}
