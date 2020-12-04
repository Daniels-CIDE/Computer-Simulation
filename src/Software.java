public class Software {
    String softwareName;
    String softwareVersion;
    int softwareSpaceRequirement;
    int softwareRamRequirement;

    public Software(String softwareName, String softwareVersion, int softwareSpaceRequirement, int softwareRamRequirement) {
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamRequirement = softwareRamRequirement;

    }
    public String getSoftwareName() {
        return this.softwareName;
    }
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }
    public int getSoftwareSpaceRequirement() {
        return this.softwareSpaceRequirement;
    }
    public int getSoftwareRamRequirement() {
        return this.softwareRamRequirement;
    }
}
