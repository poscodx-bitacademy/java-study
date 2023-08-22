package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPEchoClient {
	private static final String SERVER_IP = "127.0.0.1";
	
	public static void main(String[] args) {
		DatagramSocket socket= null;
		Scanner scanner = null;
		
		try {
			//1. 스캐너 생성
			scanner = new Scanner(System.in);
			
			//2. 소켓 생성
			socket = new DatagramSocket();
			
			while(true) {
				System.out.print(">");
				String line = scanner.nextLine();
				
				if("exit".equals(line)) {
					break;
				}
				
				//3. 보내기
				byte[] sndData = line.getBytes("utf-8");
				DatagramPacket sndPacket = new DatagramPacket(
					sndData,
					sndData.length,
					new InetSocketAddress(SERVER_IP, UDPEchoServer.PORT));

				socket.send(sndPacket);				
				
				//4. 받기
				DatagramPacket rcvPacket = new DatagramPacket(new byte[UDPEchoServer.BUFFER_SIZE], UDPEchoServer.BUFFER_SIZE);
				socket.receive(rcvPacket); // Blocking
				
				byte[] rcvData = rcvPacket.getData();
				int offset = rcvPacket.getLength();
				String message = new String(rcvData, 0, offset, "utf-8");
				
				System.out.println("<" + message);				
			}
		} catch (SocketException e) {
			System.out.println("[UDP Echo Client] error:" + e);
		} catch (IOException e) {
			System.out.println("[UDP Echo Client] error:" + e);
		} finally {
			if(scanner != null) {
				scanner.close();
			}
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}
	}
}
