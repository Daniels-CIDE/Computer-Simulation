public class OperatingSystem {
    String osName;
    String osVersion;
    String osArchitecture;
    boolean osOnlyCommand;
    int osSpaceRequirement;
    int osRamRequirement;
    String[] osSoftware;

    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamRequirement = osRamRequirement;
        this.osSoftware = null;
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

}
