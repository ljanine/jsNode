import java.util.*;

class Negativo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar numero: ");
		
		int num1=scan.nextInt();

		if (num1>0) {
			if((num1%3 == 0 ) || (num1%5 == 0))
				System.out.println(num1 + " es multiplo de 3 o de 5");
			else
				System.out.println(num1 + "no es multiplo de 3 ni de 5");
		}
		else
			System.out.println("Inserte numero positivo");

	}
}