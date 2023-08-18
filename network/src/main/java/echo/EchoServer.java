package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static final int PORT = 8000;
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT), 10);
			log("starts...[port:" + PORT + "]");
			
			while(true) {
				Socket socket = serverSocket.accept();
				new EchoRequestHandler(socket).start();
			}
		} catch (IOException e) {
			log("error:" + e);
		} finally {
			try {
				if(serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	private static void log(String message) {
		System.out.println("[EchoServer#" + Thread.currentThread().getId() + "] " + message);
	}
}
