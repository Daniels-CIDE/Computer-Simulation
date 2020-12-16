public class Computer {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private String os;
    int hardDiskMax = 100;
    int ramMemoryMax = 100;

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

    public void setName(String name) {
        this.name = name;
    }
    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public void instalarSO(OperatingSystem os) {
        if (this.getHardDisk() >= os.getOsSpaceRequirement() && this.getRamMemory() >= os.getOsRamRequirement()) {
            this.setHardDisk(this.getHardDisk() - os.getOsSpaceRequirement());
            this.setRamMemory(this.getRamMemory() - os.getOsRamRequirement());
            this.setOs(os.getOsName());
        } else {
            System.out.println("No hay espacio");
            System.out.println(" ");
        }
    }
    public void format(OperatingSystem os){
        if (this.hardDisk < hardDiskMax && this.ramMemory < ramMemoryMax){
            this.hardDisk = hardDiskMax;
            this.ramMemory = ramMemoryMax;
        }
        os.getOsSoftware().clear();
        this.setOs(null);
    }
}
