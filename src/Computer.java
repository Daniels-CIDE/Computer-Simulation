public class Computer {
    String name;
    int ramMemory;
    int hardDisk;
    String os;

    public Computer(String name, int ramMemory, int hardDisk, String os) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.os = os;

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
    public String getOs() {
        return this.os;
    }


}
