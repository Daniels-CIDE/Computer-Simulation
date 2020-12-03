public class Computer {
    String name;
    int ramMemory;
    int hardDisk;
    OperatingSystem os1 = new OperatingSystem("os1","6.0","64x",true, 20, 4);

    public Computer(String name, int ramMemory, int hardDisk) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;

    }
}
