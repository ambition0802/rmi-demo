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
	
	/**
	 * this method will be invoked by remote
	 * so it must be declared that THROWS REMOTEEXCEPTION
	 * @return
	 * @throws RemoteException
	 */
	public String hello() throws RemoteException;
	
}
