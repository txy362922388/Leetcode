import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		try {
			ServerSocket ss = new ServerSocket(8888);
			System.out.println("Listening on port 8888");
			Socket s = ss.accept();
			//System.out.println("Server received" + s);
			//InputStream is = s.getInputStream();
			//System.out.println(is.read());
			//DataInputStream dis = new DataInputStream(is);
			//System.out.println(dis.readUTF());
			//OutputStream os = s.getOutputStream();
			//DataOutputStream dos = new DataOutputStream(os);
//			while (true) {
//				dos.writeUTF(in.nextLine());
//				String rec = dis.readUTF();
//				System.out.println("client:" + rec);
//				String send = in.nextLine();
//				dos.writeUTF(send);
//			}
			new SendThread(s).start();
			new ReceiveThread(s).start();
			
			//dis.close();
			//is.close();
			//s.close();
			//ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
