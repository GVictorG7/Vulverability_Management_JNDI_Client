package tpjad.jndi.dto;

public class PortDTO {
    private int idPort;
    private int nr;
    private String type;
    private ServiceDTO service;

    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ServiceDTO getService() {
        return service;
    }

    public void setService(ServiceDTO service) {
        this.service = service;
    }
}
