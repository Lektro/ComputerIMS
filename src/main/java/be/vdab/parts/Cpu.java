package be.vdab.parts;

public class Cpu extends ComputerParts {

    private Cpu[] cpus;

    public void ComputerParts() {
        cpus = new Cpu[0];
    }

    public Cpu(Cpu[] cpuBrand){
        this.cpus = cpuBrand;
    }

    public Cpu[] getCpus() {
        return cpus;
    }

    public void setCpus(Cpu[] cpus) {
        this.cpus = cpus;

    }

    public void addComputerParts(ComputerParts cpu) {
        if (!(cpu instanceof Cpu)) {
            Cpu[] result = new Cpu[cpus.length + 1];
            for (int i = 0; i < cpus.length; i++) {
                result[i] = cpus[i];
            }
            result[result.length - 1] = (Cpu) cpu;
            cpus = result;
        }
    }

        public void printAllComputerParts() {
            System.out.println("All the CPU's are: ");

            for (ComputerParts c : cpus) {
                System.out.println(c.getBrand() + " " + c.getPrice() + " ");
            }
        }

}


