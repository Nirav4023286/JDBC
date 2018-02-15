import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Scanner cin = new Scanner(System.in);
			System.out.println("Trying to connect with server");
			Socket socket = new Socket("localhost", 12121);
			System.out.println("[CLIENT]: Connection established!!!");

			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			System.out.println("[Client]: ");
			String msg = cin.nextLine();
			dos.writeUTF( msg );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
