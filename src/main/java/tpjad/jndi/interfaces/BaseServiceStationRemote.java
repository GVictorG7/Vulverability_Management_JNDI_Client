package tpjad.jndi.interfaces;

import tpjad.jndi.dto.StationDTO;

import java.util.List;

public interface BaseServiceStationRemote {
    List<StationDTO> list();
}