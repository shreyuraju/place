import java.io.*;
import java.util.*;
import java.net.*;
class Client {
	public static void main(String args[]) throws IOException, FileNotFoundException {
		Socket sock=new Socket("localhost",8000);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String fname=reader.readLine();
		System.out.println("send "+fname);
		OutputStream ostream=sock.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream,true);
		pwrite.println(fname);  
		InputStream istream=sock.getInputStream();
		BufferedReader toread = new BufferedReader(new InputStreamReader(istream));
		String str;
		System.out.println("file name "+fname);
		while((str=toread.readLine())!=null) {
			System.out.println(str);
		}
		pwrite.close();
		sock.close();
		toread.close();
		ostream.close();
		istream.close(); 
		reader.close();
	}
}
