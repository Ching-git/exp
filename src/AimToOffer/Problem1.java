package AimToOffer;

public class Problem1 {

	private static int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 },
			{ 4, 7, 10, 13 }, { 6, 8, 11, 15 } };

	public static void main(String[] args) {
		int a = 11;
		System.out.println(Find(array, a));
	}

	private static Boolean Find(int[][] array1, int a) {

		Boolean found = false;
		int row = 0;
		int column = 0;
		int rows = array1.length - 1;
		int columns = array1[0].length - 1;
		if (array1 != null && rows > 0 && columns > 0) {
			column = columns;
			while (row <= rows && column >= 0) {
				if (array1[row][column] == a) {
					found = true;
					break;
				} else if(array1[row][column] > a){
					column--;
				} else {
					row++;
				}
			}
		}
		return found;
	}
}
