package devf;

class public Sensei{
	public String name, lastName, favFood;
	public int age;
	public double height;
	public boolean puntualidad, handsome; 

	public Sensei(){
		this.name = "Panfilo";
		this.lastName = "De la Sierra";

		this.age =(int) Math.floor(Math.random()*999);
	}

	public Sensei(String name, String lastName, int age){ //constructor
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public void setHandsome(boolean handsome){
		this.handsome = handsome;
	}

	public setHandsome(){
		return this.handsome ;
	}

	public void String getName(String name){
		this.name = name;
	}
	public String setName(){
		return this.name;
	}

	public String getFullName(){							//metodo
		return String.format("%s %s", this.name, this.lastName);
	}





}