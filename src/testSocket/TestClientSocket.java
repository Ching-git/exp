package testSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TestClientSocket {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 4444);

		PrintStream printWriter = new PrintStream(socket.getOutputStream());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String temp = bufferedReader.readLine();
		System.out.println(temp);
		
		while (true) {
			printWriter.println(temp);
			System.out.println(temp);
			temp = bReader.readLine();
			//System.out.println(temp);
			System.out.println("client从服务器接收的数据：" + temp);
			if ("stop".equals(temp)) {
				break;
			}
			temp = bufferedReader.readLine();
		}
		
		bReader.close();
		bufferedReader.close();
		socket.close();
	}

}
