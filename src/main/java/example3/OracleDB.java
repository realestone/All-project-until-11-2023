package example3;

import example3.DataService;

public class OracleDB implements DataService {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle DB...");
    }

    @Override
    public void getData() {
        System.out.println("Getting data from Oracle DB...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle DB...");
    }
}