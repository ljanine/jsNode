public class Enciclopedia{
	String title, author, subject; 

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title ;
	}

	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return this.author ;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getSubject(){
		return this.subject ;
	}
}

public class Libro extends Enciclopedia{

	public Libro(String author){
		super(author);
	}



}