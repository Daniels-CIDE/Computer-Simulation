public class Software {
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamRequirement;

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

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement) {
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }
    public void setSoftwareRamRequirement(int softwareRamRequirement) {
        this.softwareRamRequirement = softwareRamRequirement;
    }

}
