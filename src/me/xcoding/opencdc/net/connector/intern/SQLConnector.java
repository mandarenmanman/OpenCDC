package me.xcoding.opencdc.net.connector.intern;

import me.xcoding.opencdc.net.connector.ConnectionException;
import me.xcoding.opencdc.net.connector.ISQLConnector;
import me.xcoding.opencdc.mysql.protocol.ReadablePacket;
import me.xcoding.opencdc.mysql.protocol.WritablePcaket;

public class SQLConnector implements ISQLConnector {

	@Override
	public void connection(String host, int port) throws ConnectionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String usernme, String password)
			throws ConnectionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(WritablePcaket packet) throws ConnectionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReadablePacket read() throws ConnectionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void query(String query) throws ConnectionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(ReadablePacket packet) throws ConnectionException {
		// TODO Auto-generated method stub
		
	}

}
