package nowcorder;

public class MiniDe {

	public static void main(String[] args) {
		java.util.BitSet bitSet = new java.util.BitSet(10000000);  
        //��ָ��λ��ֵ��Ϊtrue  
        bitSet.set(9999, true);  
        //���ָ��λ��ֵ  
        System.out.println(bitSet.get(9999));  
        System.out.println(bitSet.get(9998));  
	}

//	private static int[] GetMaxArray(int[] a) {
//		
//		
//		return null;
//	}
}
