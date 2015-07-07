import java.util.Scanner;

import biblioteca.Libro;

class Main{				//instancia
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Libro lb1 = new Libro();

		System.out.print("Autor: " );	
		lb1.setAutor(scan.nextLine());
		System.out.print("Titulo: " );	
		lb1.setTitulo(scan.nextLine());
		System.out.print("Editorial: " );	
		lb1.setEditorial(scan.nextLine());
		System.out.print("Anio: " );	
		lb1.setAnio(scan.nextInt());
		System.out.print("Edicion: " );	
		lb1.setEdicion(scan.nextInt());



		System.out.println("\n LIBRO" );	
		System.out.println(lb1.getAutor());
		System.out.println(lb1.getTitulo());
		System.out.println(lb1.getEditorial());
		System.out.printf("%d", lb1.getAnio());	
		System.out.printf("%d", lb1.getEdicion());		
	}	
	
}