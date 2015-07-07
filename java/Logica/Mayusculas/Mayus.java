import java.util.*;

class Mayus{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String may=scan.nextLine();
		int lg = may.length();	

		if (lg  < 3)
			System.out.println(may.toUpperCase());
		else
			System.out.println(may.substring(0 , lg-3).toLowerCase() + may.substring(lg- 3, lg).toUpperCase());
		

	}
}