public class OperatingSystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamRequirement;
    private Software[] osSoftware;


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
    public Software[] getOsSoftware() {
        return osSoftware;
    }
    public void setOsName(String osName) {
        this.osName = osName;
    }
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }
    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }
    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }
    public void setOsRamRequirement(int osRamRequirement) {
        this.osRamRequirement = osRamRequirement;
    }
    public void setOsSoftware(Software[] osSoftware) {
        this.osSoftware = osSoftware;
    }

    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamRequirement = osRamRequirement;
        this.osSoftware = null;
    }
    public void instalarSoftware(){
        this.osSoftware =null;
    }


}


