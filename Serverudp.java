import java.util.*;
import java.io.*;
import java.net.*;
public class Serverudp{
	public static void main(String args[]) throws Exception {
		DatagramSocket mysocket=new DatagramSocket(8000);
		byte[] senddata=new byte[1024];
		byte[] receivedata=new byte[1024];
		DatagramPacket receivepacket=new DatagramPacket(receivedata,receivedata.length);
		while(true){
			mysocket.receive(receivepacket);
			String data=new String(receivepacket.getData());
			System.out.println("Server:"+data);
			InetAddress clientIpAddress=receivepacket.getAddress();
			int Port=receivepacket.getPort();
			System.out.println("enter the data to send to client");
			Scanner sc=new Scanner(System.in);
			String tosend=sc.next();
			senddata=tosend.getBytes();
			DatagramPacket sendtoclient=new DatagramPacket(senddata,senddata.length,clientIpAddress,Port);
			mysocket.send(sendtoclient);
			}
	}
	}

