import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			System.out.println("Waiting for connection");
			ServerSocket ss = new ServerSocket(12121);
			Socket socket = ss.accept();
			System.out.println("[SERVER]: Server started, connection established!!!");
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			String msg = dis.readUTF();
			System.out.println("[SERVER]: " + msg);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
