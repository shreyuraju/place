import java.io.*;
import java.util.*;
import java.net.*;
public class udpClient {
	public static void main(String args[]) throws Exception {
		DatagramSocket ds=new DatagramSocket();
		byte[] send=new byte[1024];
		Scanner sc=new Scanner(System.in);
		System.out.println("Message to server:");
		String sendmsg=sc.next();
		send=sendmsg.getBytes();
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket senddp=new DatagramPacket(send,send.length,ip,8000);
		ds.send(senddp);
		byte[] recv=new byte[1024];
		DatagramPacket recvdp=new DatagramPacket(recv,recv.length);
		ds.receive(recvdp);
		String str=new String(recvdp.getData());
		System.out.println("Message from Server:"+str);
		ds.close();
	}
}
