import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		try {
			Socket s = new Socket("127.0.0.1",8888);
			//System.out.println(s);
			//InputStream is = s.getInputStream();
			//DataInputStream dis = new DataInputStream(is);
			//OutputStream os = s.getOutputStream();
			//DataOutputStream dos = new DataOutputStream(os); 
			//os.write(110);
//			while (true) {
//				dos.writeUTF(in.nextLine());
//				String rec = dis.readUTF();
//				System.out.println("server:" + rec);
//				String send = in.nextLine();
//				dos.writeUTF(send);
//			}
			new SendThread(s).start();
			new ReceiveThread(s).start();
			
			//dos.close();
			//os.close();
			//s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
