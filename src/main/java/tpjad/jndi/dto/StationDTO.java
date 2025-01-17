package tpjad.jndi.dto;

import java.util.ArrayList;
import java.util.List;

public class StationDTO {
    private int idStation;
    private String ip;
    private List<PortDTO> ports = new ArrayList<>();

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<PortDTO> getPorts() {
        return ports;
    }

    public void setPorts(List<PortDTO> ports) {
        this.ports = ports;
    }
}
