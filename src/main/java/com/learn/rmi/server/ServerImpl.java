package com.learn.rmi.server;

import java.io.Serializable;

/**
 * must implements Serializable 
 * 
 * @author XPS
 *
 */
public class ServerImpl implements ServerInterface, Serializable{

	private static final long serialVersionUID = 2659961442697455095L;

	@Override
	public String hello() {
		return "Hello, this is a server method invoked by rmi.";
	}

}
