package javatesting;
class ValidateUtility extends Exception  {
	public ValidateUtility(String str) {
		super(str);
	}
}
public class march28 {
	public static void validPhno(String phno) throws ValidateUtility{
		if(phno.length()==0 || phno.length()>10 || phno.length()<10) {
			throw new ValidateUtility("Invalid Phno.");
		}
		else {
			System.out.println("Valid phno.");
		}
	}
	public  static void main(String a[]) {
//		ValidateUtility util=new ValidateUtility();
		try {
			march28.validPhno("931546639");
//			validPhno("931546639");
		}
		catch(ValidateUtility e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println();
		}
	}
}
