import java.util.Scanner;

class Diez{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar 2 numeros menores a 10: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();

		int dif1 = 10 - num1;
		int dif2 = 10 - num2;

		if (dif1 < dif2){
			System.out.println(num1);
		}
		else
			System.out.println("0");
}