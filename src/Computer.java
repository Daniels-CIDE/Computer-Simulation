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

    OperatingSystem so1 = new OperatingSystem("os1","6.0","64x",true, 20, 4);
}
