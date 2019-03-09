package com.learn.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * must extends Remote
 * 
 * @author XPS
 *
 */
public interface ServerInterface extends Remote {
	
	public String hello() throws RemoteException;
	
}
