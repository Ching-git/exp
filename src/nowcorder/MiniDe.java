package nowcorder;

public class MiniDe {

	public static void main(String[] args) {
		java.util.BitSet bitSet = new java.util.BitSet(10000000);  
        //将指定位的值设为true  
        bitSet.set(9999, true);  
        //输出指定位的值  
        System.out.println(bitSet.get(9999));  
        System.out.println(bitSet.get(9998));  
	}

//	private static int[] GetMaxArray(int[] a) {
//		
//		
//		return null;
//	}
}
