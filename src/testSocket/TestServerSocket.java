package testSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerSocket {

	public static void main(String[] args) throws Exception {

		System.out.println((int)Math.pow(10,2)/(int)Math.pow(10, 1));
		ServerSocket serverSocket = new ServerSocket(4444);
		System.out.println("server建立");
		Socket socket = serverSocket.accept();
		System.out.println("连接建立....");
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream printWriter = new PrintStream(socket.getOutputStream());
		
		String temp = bReader.readLine();
		System.out.println("server读取");
		
		while (true) {
			System.out.println("server从客户端接收：" + temp);
			printWriter.println(temp);
			
			if ("stop".equals(temp)) {
				break;
			}
			temp = bReader.readLine();
		}
		bReader.close();
		printWriter.close();
		serverSocket.close();
	}

}
