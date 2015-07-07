import devf.Sensei; //paquete

class Main{
	public static void main (String[] args){

		Sensei rafa = new Sensei();
		Sensei sergio = new Sensei("Sergio", "Martinez", 16);

		rafa.setHansome(false);
		sergio.setHansome(true);
		rafa.setName("Raja");

		System.out.println(rafa.getFullName() + " is handsome?" + rafa.getHandsome() );	
		System.out.println(sergio.getFullName() + " is handsome?" + sergio.getHandsome() );			

		//System.out.println(rafa.getFullName());

		//System.out.println(rafa.name);
		//System.out.println(sergio.getFullName());
	}
}
