
public class Book {

	int page;
	String name;
	String author;
	String type;
	String publisher;
	int edition;
	
	
	public void setPage(int page){
		this.page = page;
	}
	public void setEdition(int edition){
		this.edition = edition;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	
	
	
	
	public void printName(){
		
		System.out.println("The name of the book is: "+ name);
	}
	
	public void printEdition(){
		
		System.out.println("The edition of the book is: "+ edition);
	}
	
	public void printPage(){
		
		System.out.println("The number of pages is: "+ page);
	}
	
	
	public void printAuthor(){
		
		System.out.println("The author of the book is: "+ author);
	}
	
	public void printType(){
		
		System.out.println("The type of the book is: "+ type);
	}
	public void printPublisher(){
		
		System.out.println("The type of the book is: "+ publisher);
	}
	
}
