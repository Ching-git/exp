package nowcorder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class PrintByThread {

	public static void main(String[] args) {

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(new File("input.txt")), true);
			Random random = new Random();
			for (int i = 0; i < 1000; i++) {
				pw.print(Math.abs(random.nextInt()%100) + " ");
			}
			pw.flush();
			pw.close();
			
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			String strString = reader.readLine();
			String[] str = strString.split(" ");		
			reader.close();
			System.out.println("总长：" + str.length);
			
			int j = 0;

			for (int i = 0; i < 5; i++) {
				int records[] = new int[200];
				for (int k = 0; k < 200; k++) {
					records[k] = Integer.parseInt(str[j]);
					j++;
				}
				PrintWriter writer = new PrintWriter(new FileWriter(new File("output" + i + ".txt")),true);
				ThreadGroup threadGroup = new ThreadGroup(records, writer);
				new Thread(threadGroup).start();
				new Thread(threadGroup).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ThreadGroup implements Runnable{

	private static int count = 0;
	private static Object lock = new Object();
	private static final int EVEN = 0;
	private static final int ODD = 1;
	private int type;
	private int recordes[];
	private PrintWriter writer;
	private int oddpoint = 0;
	private int eventpoint = 0;
	
	public ThreadGroup(int[] recordes, PrintWriter writer) {
		super();
		this.recordes = recordes;
		this.writer = writer;
		this.type = EVEN;
	}

	@Override
	public void run() {
		while (print());
	}

	private synchronized boolean print() {
		for (int i = 0; i < 10;) {
			if ((oddpoint >= recordes.length - 1) && (eventpoint >= recordes.length - 1)) {
				notifyAll();
				return false;
			}
			if ((oddpoint >= recordes.length - 1 && type == ODD) || (eventpoint >= recordes.length - 1 && type == EVEN)) {
				break;
			}
			if (type == EVEN) {
				if (recordes[eventpoint] % 2 == 0) {
					i++;
					writer.print(recordes[eventpoint] + " ");
					writer.flush();
					synchronized (lock) {
						count++;
						if (count % 200 == 0) {
							System.out.println("已完成：" + count);
							if (count == 1000) {
								System.out.println("Done!");;
							}
						}
					}
				}
				eventpoint++;
			} else {
				if (recordes[oddpoint] % 2 == 1) {
					i++;
					writer.print(recordes[oddpoint] + " ");
					writer.flush();
					synchronized (lock) {
						count++;
						if (count % 200 == 0) {
							System.out.println("已完成：" + count);
							if (count == 1000) {
								System.out.println("Done!");;
							}
						}
					}
				}
				oddpoint++;
			}
		}
		type = ~type;
		notifyAll();
		try {
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
}
