package tpjad.jndi.client;

import tpjad.jndi.interfaces.BaseServiceStationRemote;

import javax.naming.InitialContext;
import java.util.Properties;

public class JndiClient {
    private static final Properties JNDI = new Properties();
    private static final String BASE_SERVICE_STATION_REMOTE = "ejb/StationService!tpjad.ejb.service.BaseServiceStationRemote";

    static {
        JNDI.put("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
        JNDI.put("java.naming.provider.url", "http-remoting://localhost:8080/");
    }

    public static void main(String[] args) throws Exception {
        BaseServiceStationRemote proxy =
                (BaseServiceStationRemote) (new InitialContext(JNDI)).lookup(BASE_SERVICE_STATION_REMOTE);
        proxy.list();
    }
}
