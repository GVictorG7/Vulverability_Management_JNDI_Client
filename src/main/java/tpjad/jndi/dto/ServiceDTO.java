package tpjad.jndi.dto;

import java.util.ArrayList;
import java.util.List;

public class ServiceDTO {
    private int idService;
    private String type;
    private String name;
    private String version;
    private List<VulnerabilityDTO> vulnerabilities = new ArrayList<>();

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<VulnerabilityDTO> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<VulnerabilityDTO> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
}
