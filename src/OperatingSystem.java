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

}
