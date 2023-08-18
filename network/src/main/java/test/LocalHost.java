package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			String hostname = inetAddress.getHostName();
			String hostIpAddress = inetAddress.getHostAddress();
			
			System.out.println(hostname);
			System.out.println(hostIpAddress);
			
			byte[] IpAddresses = inetAddress.getAddress();
			for(byte IpAddress : IpAddresses) {
				System.out.println(IpAddress & 0x000000ff);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}