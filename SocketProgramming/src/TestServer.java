import java.net.*;
import java.io.*;
public class TestServer {
	public static void main(String args[]) {
		try {
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			System.out.println("server started");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("message="+str);
			ss.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
