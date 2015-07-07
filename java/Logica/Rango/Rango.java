import java.util.Scanner;

class Rango{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingresar 3 numeros: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if ((num1 > 13 && num1 <19) || (num2 > 13 && num2 <19) || (num3 > 13 && num3 <19)  ){
			System.out.println("Verdadero");
		}
		else
			System.out.println("Falso");
	}
}