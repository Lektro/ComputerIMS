package be.vdab.stock;

import be.vdab.parts.Cpu;
import be.vdab.parts.CpuBrand;

public interface Seller extends Revenue {

    Cpu orderCpu(CpuBrand[] cpuBrands) throws NoMorePartsException;

}
