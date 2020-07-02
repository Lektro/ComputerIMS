package be.vdab.stock;

import be.vdab.parts.Cpu;
import be.vdab.parts.CpuBrand;
import be.vdab.parts.Gpu;
import be.vdab.parts.GpuBrand;

public interface Seller extends Revenue {

    Cpu orderCpu(CpuBrand[] cpuBrands) throws NoMorePartsException;
    Gpu orderGpu(GpuBrand[] gpuBrands) throws NoMorePartsException;

}
