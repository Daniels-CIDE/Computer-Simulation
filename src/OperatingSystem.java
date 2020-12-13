
import java.util.ArrayList;

public class OperatingSystem {
    String osName;
    String osVersion;
    String osArchitecture;
    boolean osOnlyCommand;
    int osSpaceRequirement;
    int osRamRequirement;
    private ArrayList<Software> osSoftware = new ArrayList<Software>();

    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamRequirement = osRamRequirement;
        this.osSoftware = osSoftware;
    }

    public String getOsName() {
        return this.osName;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOsArchitecture() {
        return this.osArchitecture;
    }

    public boolean getOsOnlyCommand() {
        return this.osOnlyCommand;
    }

    public int getOsSpaceRequirement() {
        return this.osSpaceRequirement;
    }

    public int getOsRamRequirement() {
        return this.osRamRequirement;
    }

    public ArrayList<Software> getOsSoftware() {
        return osSoftware;
    }

    Software s1 = new Software("Counter Strike", "2.0", 15, 3);
    Software s2 = new Software("Utorrent", "1.4.12", 5, 2);

    public void setOsSoftware(ArrayList<Software> osSoftware) {
        this.osSoftware = osSoftware;
    }

    public void instalarSoftware(Software osSoftware, Computer c1) {
        if (c1.getHardDisk() >= osSoftware.getSoftwareSpaceRequirement() && c1.getRamMemory() >= osSoftware.getSoftwareRamRequirement()) {
            this.osSoftware.add(osSoftware);
            c1.setHardDisk(c1.getHardDisk() - osSoftware.getSoftwareSpaceRequirement());
            c1.setRamMemory(c1.getRamMemory() - osSoftware.getSoftwareRamRequirement());
        } else {
            System.out.println("No hay espacio");
            System.out.println(" ");
        }
    }

}