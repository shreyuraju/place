import java.io.*;
import java.net.*;
import java.util.*;
public class udpServer {
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds=new DatagramSocket(8000);
		byte[] recv=new byte[1024];
		byte[] send=new byte[1024];
		while(true) {
			DatagramPacket recvpack=new DatagramPacket(recv,recv.length);
			ds.receive(recvpack);
			String recvdata=new String(recvpack.getData());
			System.out.println("Message from CLient:");
			System.out.println(recvdata);
			InetAddress ip=recvpack.getAddress();
			int port=recvpack.getPort();
			System.out.println("Enter reply to Client:");
			String reply=sc.nextLine();
			send=reply.getBytes();
			DatagramPacket sendpacket = new DatagramPacket(send,send.length,ip,port);
			ds.send(sendpacket);
		}	
	}
}
