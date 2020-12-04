public class Computer {
    String name;
    int ramMemory;
    int hardDisk;
    OperatingSystem os;

    public Computer(String name, int ramMemory, int hardDisk) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;

    }
    public String getName() {
        return this.name;
    }
    public int getRamMemory() {
        return this.ramMemory;
    }
    public int getHardDisk() {
        return this.hardDisk;
    }
    public OperatingSystem getOs() {
        return this.os;
    }


}
