package nowcorder;

enum AccountType {
	SAVING, FIXED, CURRENT;
	private AccountType() {
		System.out.println("It is a account type");
	}
}

public class Enuma {

	Enuma(){
		int a = 1;
	}
	
	public static void main(String[] args) {
		System.out.println(AccountType.FIXED);
	}

}
