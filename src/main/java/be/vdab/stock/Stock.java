package be.vdab.stock;

public class Stock extends Store {

    /** class variables */
    private int cpu;
    private int gpu;
    private int ram;
    private int mobo;
    private int psu;

    public Stock(int cpu, int gpu, int ram, int mobo, int psu){
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.mobo = mobo;
        this.psu = psu;

    }

    /** auto-generated get and set */
    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMobo() {
        return mobo;
    }

    public void setMobo(int mobo) {
        this.mobo = mobo;
    }

    public int getPsu() {
        return psu;
    }

    public void setPsu(int psu) {
        this.psu = psu;
    }
}
