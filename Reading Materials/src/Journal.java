
public class Journal extends Book {
		
	Journal(String author, int page, String type, String name, String publisher, int edition){
		
		this.edition = edition;
		this.publisher = publisher;
		this.name = name;
		this.page = page;
		this.author = author;
		this.type = type;
		
		
		printAuthor();
		printName();
		printPage();
		printType();
		printPublisher();
		printEdition();
		
	}
}
