package be.vdab.parts;

public class Cpu implements ComputerParts {

    private Cpu[] processor;
    
    public Cpu(){}
    
    public Cpu(Cpu[] cpuBrand) {
        this.processor = cpuBrand;
    }

    public Cpu(CpuBrand[] cpuBrands) {
    }

    public Cpu getCpuBrand(CpuBrand[] cpuBrand) {
        return null;
    }

    public void buy() {

    }
}


