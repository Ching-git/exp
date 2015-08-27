package nowcoder722;

public class BaoLiDiGui {

	private static int[] arr = { 5, 10, 25, 1 };
	private static int aim = 1000;
	private static int[][] map;
	
	public static void main(String[] args) {
		long btime = 0;
		long btime1 = 0;
		System.out.println(btime = System.currentTimeMillis());
		System.out.println("±©Á¦µÝ¹é£º"+coins(arr, aim));
		System.out.println(System.currentTimeMillis() - btime);
		System.out.println(btime1 = System.currentTimeMillis());
		System.out.println("¼ÇÒäËÑË÷£º"+coins2(arr, aim));
		System.out.println(System.currentTimeMillis() - btime1);
	}

	private static int coins(int[] arr2, int aim2) {
		if (arr2 == null || arr2.length == 0 || aim < 0) {
			return 0;
		}
		return process(arr, 0, aim);
	}

	private static int process(int[] arr, int i, int aim) {
		int res = 0;
		if (i == arr.length) {
			res = aim == 0 ? 1 : 0;
		} else {
			for (int j = 0; arr[i]*j <= aim; j++) {
				res += process(arr, i + 1, aim - arr[i]*j);
			}
		}
		return res;
	}
	
	private static int coins2(int[] arr2, int aim2) {
		if (arr2 == null || arr2.length == 0 || aim < 0) {
			return 0;
		}
		map = new int[arr2.length+ 1][aim2 + 1];
		return process2(arr, 0, aim, map);
	}

	private static int process2(int[] arr2, int i, int aim2, int[][] map) {
		int res = 0;
		if (i == arr2.length) {
			res = aim2 == 0 ? 1 : 0;
		} else {
			int mapValue = 0;
			for (int j = 0; arr2[i]*j <= aim2; j++) {
				mapValue = map[i + 1][aim2 - arr2[i]*j];
				if (mapValue != 0) {
					res += mapValue == -1 ? 0 : mapValue;
				} else {
					res += process2(arr2, i + 1, aim2 - arr2[i]*j, map);
				}
			}
		}
		map[i][aim2] = res == 0 ? -1 : 0;
		return res;
	}
}
