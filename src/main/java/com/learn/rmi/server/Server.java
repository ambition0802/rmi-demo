package com.learn.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * server of java rmi
 * 
 * @author XPS
 *
 */
public class Server {
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(6324);
			registry.rebind("serverHello", new ServerImpl());
			Thread.sleep(1000*60*10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
