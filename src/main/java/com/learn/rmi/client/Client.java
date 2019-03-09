package com.learn.rmi.client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.learn.rmi.server.ServerInterface;

/**
 * client of java rmi
 * 
 * @author XPS
 *
 */
public class Client {

	public static void main(String[] args) {
		try {
			//get the remote registry
			Registry registry = LocateRegistry.getRegistry("localhost", 6324);
			ServerInterface serverInterface = (ServerInterface) registry.lookup("serverHello");
			System.out.println(serverInterface.hello());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
