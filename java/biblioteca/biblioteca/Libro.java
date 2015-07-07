package biblioteca;

public class Libro{	
	
	String autor, titulo, editorial, genero;
	int anio, edicion;

	public Libro(){						//constructor por omisión
		this.autor = "Edgar Allan Poe";
		this.titulo = "El gato negro";
		this.editorial = "ANAYA";
		this.genero = "Cuentos";
		this.anio = 1843;
		this.edicion = 2;	
	}

	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getAutor(){
		return this.autor;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return this.titulo;
	}

	public void setEditorial(String editorial){
		this.editorial = editorial;
	}
	public String getEditorial(){
		return this.editorial;
	}

	public void setAnio(int anio){
		this.anio = anio;
	}
	public int getAnio(){
		return this.anio;
	}

	public void setEdicion(int edition){
		this.edicion = edicion;
	}
	public int getEdicion(){
		return this.edicion;
	}

	public String getLibro(){
		return String.format("%s %s %s", this.autor, this.titulo, this.editorial);
	}



}