package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	public static final int PORT = 8000;
	public static final int BUFFER_SIZE = 256;
	
	public static void main(String[] args) {
		DatagramSocket socket = null;
		
		try {
			//1. 소켓 생성
			socket = new DatagramSocket(PORT);
			
			while(true) {
				//2. 데이터 수신
				DatagramPacket rcvPacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
				socket.receive(rcvPacket); // Blocking
				
				byte[] rcvData = rcvPacket.getData();
				int offset = rcvPacket.getLength();
				String message = new String(rcvData, 0, offset, "utf-8");
				
				System.out.println("[UDP Echo Server] received:" + message);
				
				//3.송신
				byte[] sndData = message.getBytes("utf-8");
				DatagramPacket sndPacket = new DatagramPacket(
					sndData,
					sndData.length,
					rcvPacket.getAddress(),
					rcvPacket.getPort());

				socket.send(sndPacket);
			}
		} catch (SocketException e) {
			System.out.println("[UDP Echo Server] error:" + e);
		} catch (IOException e) {
			System.out.println("[UDP Echo Server] error:" + e);
		} finally {
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}
	}
}
