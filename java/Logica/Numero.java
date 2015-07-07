import java.util.Scanner;

class Numero{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingresar numero: ");
		int num=scan.nextInt();
		if(num<21){
			System.out.println(21-num);
		}
		else{
			System.out.println(num*2);
		}
	}
}