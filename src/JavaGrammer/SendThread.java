import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread{
	Socket s;
	public SendThread(Socket s) {
		this.s = s;
	}
	public void run() {
		try {
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			Scanner in = new Scanner(System.in);
			while (in.hasNext()) {
				String msg = in.next();
				dos.writeUTF(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
