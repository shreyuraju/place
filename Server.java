import java.io.*;
import java.net.*;
public class Server {
	public static void main(String args[]) throws IOException,FileNotFoundException {
		ServerSocket servsock= new ServerSocket(8000);
		System.out.println("Server ready to accept the connection");
		Socket sock=servsock.accept();
		System.out.println("\nConnection established Successfully");
		InputStream istream=sock.getInputStream();
		BufferedReader buffread=new BufferedReader(new InputStreamReader(istream));
		String fname=buffread.readLine();
		System.out.println("file name reached from client:"+fname);
		BufferedReader countReader=new BufferedReader(new FileReader(fname));
		OutputStream ostream=sock.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream,true);
		while((fname=countReader.readLine())!=null) {
			pwrite.println(fname);
		}
		sock.close();
		servsock.close();
		pwrite.close();
		ostream.close();
		istream.close();
		buffread.close();
	}
}
