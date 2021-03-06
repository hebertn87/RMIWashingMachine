package clientPackage;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import remoteInterface.WashingMachineRemote;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            WashingMachineRemote stub = (WashingMachineRemote) registry.lookup("Hello");
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}