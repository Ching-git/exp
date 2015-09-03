package nowcorder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {

	public static String output = "";

	static {
		x = 5;
	}
	static int x, y;
	
	
	public static void add(Byte b)
    {
        b = b++;
    }
    public static void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }

	public static void main(String args[]) throws ParseException {
		
		test();
		
		Integer i01 = 59;
		int i02 = 59;
		Integer i03 =Integer.valueOf(59);
		Long i04 = new Long(59L);
		System.out.println(i04.equals(i01));
		
		
		x--;
		myMethod();
		int z = x + y + ++x;
		System.out.println("x + y + ++x为：" + z);
		Integer c = 127;
		Integer d = 127;
		System.out.println(c == d);

		LinkedHashMap<String, Integer> lruHashMap = new LinkedHashMap<String, Integer>(
				16, (float) 0.75, true);
		lruHashMap.put("1", 1);
		lruHashMap.put("2", 1);
		lruHashMap.put("3", 1);
		lruHashMap.put("1", 1);
//		lruHashMap.put("2", 1);

		Iterator it = lruHashMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println("key=" + entry.getKey() + ",value="
					+ entry.getValue());
		}
		System.out.println();
		
		Iterator its = lruHashMap.entrySet().iterator();
		while (its.hasNext()) {
			Map.Entry entry = (Entry) its.next();
			System.out.println("key=" + entry.getKey() + ",value="
					+ entry.getValue());
		}
		System.out.println();

		LinkedHashSet<Integer> lru = new LinkedHashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			lru.add(i);
		}
		lru.add(1);

		Iterator<Integer> lruIterator = lru.iterator();

		while (lruIterator.hasNext()) {
			Integer integer = (Integer) lruIterator.next();
			System.out.print(integer + " ");
		}
		System.out.println();

		Date date = new Date();
		long time1 = date.getTime();
		System.out.println(time1);
		time1 = System.currentTimeMillis();
		System.out.println(time1);
		date.setTime(time1);
		System.out.println(date);

		String str_time = "2011/10/25";
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date date2 = df.parse(str_time);
		System.out.println(date2);
		DateFormat df1 = new SimpleDateFormat("yyyy年 MM月 dd日 HH:mm:ss");

		System.out.println(df1.format(date));
	}

	private void Test() {
	}

	public static void myMethod() {
		y = x++ + ++x;
		System.out.println("y=" + y);
	}

}
