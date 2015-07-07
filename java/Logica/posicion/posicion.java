import java.util.*;//devuelve letra que 

class posicion{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str=scan.nextLine();
		int lg = str.length();	

		for (int i=1 ; i<lg; i++){
			if(lg%i == 0)
				System.out.print(str.charAt(i-1));
		}
	}
}