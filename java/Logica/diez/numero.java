
import java.util.*; //importa toda la libreria de util

class numero{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar 2 numeros: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();

		int dif1 = Math.abs(10 - num1);
		int dif2 = Math.abs(10 - num2);


		if(dif1 == dif2)
			System.out.println("0");

		else if (dif1 < dif2){
			System.out.print("Numero mas cercano a 10 es: "); 
			System.out.println(num1);
		}
		else{
			System.out.print("Numero mas cercano a 10 es: "); 
			System.out.println(num2);
		}
			
	}
}