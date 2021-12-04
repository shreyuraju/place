import java.util.*;
import java.io.*;
import java.net.*;
public class Clientudp
{
	public static void main(String args[]) throws Exception
	{
	DatagramSocket mysocket=new DatagramSocket();
	byte[] senddata=new byte[1024];
	byte[] receivedata=new byte[1024];
	System.out.println("enter the message");
	Scanner sc=new Scanner(System.in);
	String tosend=sc.next();
	InetAddress myIp= InetAddress.getByName("localhost");
	senddata=tosend.getBytes();
	DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,myIp,8000);
	mysocket.send(sendpacket);
	DatagramPacket receivepacket=new DatagramPacket(receivedata,receivedata.length);
	mysocket.receive(receivepacket);
	String datatodisplay=new String(receivepacket.getData());
	System.out.println("Server:"+ datatodisplay);
	mysocket.close();
}
}
	
