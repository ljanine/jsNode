import java.util.Scanner;
//import java.io;

import carpeta.Docente;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Docente doc1 =  new Docente();


		System.out.println("Nombre: " );	
		doc1.setNombre(scan.nextLine());
		System.out.println("Apellido: " );	
		doc1.setApellido(scan.nextLine());
		System.out.println("Tipo(Ciencias/Letras): " );	
		doc1.setTipo(scan.nextLine());
		System.out.println("Horas: " );	
		doc1.setHoras(scan.nextFloat());

		System.out.println("FICHA DE TRABAJADOR");	
		System.out.println(doc1.getFullName()+"\n");
		System.out.printf("Sueldo bruto:  %.2f \n", doc1.sueldoBruto());	
		System.out.printf("Descuento: %.2f \n", doc1.descuento());	
		System.out.printf("Sueldo Neto:  %.2f \n", doc1.sueldoNeto());		
	}
}