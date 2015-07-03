package carpeta;

public class Docente{
	private String nombre, apellido, tipo;
	private float horas;

	public Docente(){
		this.nombre = "";
		this.apellido = "";
		this.tipo = "";
		this.horas = 00;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getApellido(){
		return this.apellido;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setHoras(float horas){
		this.horas = horas;
	}
	public float getHoras(){
		return this.horas;
	}
	public String getFullName(){
		return String.format("%s %s", this.nombre, this.apellido);
	}
	public float sueldoBruto(){
		if (this.tipo.toLowerCase().equals("ciencias") ){
			return 3*this.horas;
		}
		else if(this.tipo.toLowerCase().equals("letras") ){
			return 5*this.horas;
		}
		else 
			return 0;
	}

	public float descuento(){
		return this.sueldoBruto() * 0.10f;
	}
	public float sueldoNeto(){
		return this.sueldoBruto() * 0.90f;
	}



}