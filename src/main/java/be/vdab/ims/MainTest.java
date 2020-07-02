package be.vdab.ims;

import be.vdab.parts.ComputerParts;
import be.vdab.parts.CpuBrand;
import be.vdab.parts.Gpu;
import be.vdab.parts.GpuBrand;
import be.vdab.stock.*;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) throws NoMorePartsException {

    PriceList ls = new PriceList(500,750,125,150,100);

    Stock st = new Stock(5,4,10,5,10);

    Seller alternate = new Store(ls, st);

    ArrayList<ComputerParts> order1 = new ArrayList<>();

    order1.add(alternate.orderCpu(new CpuBrand[]{CpuBrand.AMD}));
    order1.add(alternate.orderGpu(new GpuBrand[]{GpuBrand.NVIDIA}));
    order1.add(alternate.orderCpu(new CpuBrand[]{CpuBrand.ARM}));


    System.out.println("The total Revenue of this simulation is: " + alternate.getRevenue());

    }
}
