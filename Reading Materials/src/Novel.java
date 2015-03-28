
public class Novel extends Book {
	
	String[] chars= new String[3];
	
	
	Novel(String char1, String char2, String char3, String author, int page, String type, String name, String publisher, int edition){
		
		this.edition = edition;
		this.publisher = publisher;
		this.name = name;
		this.page = page;
		this.author = author;
		this.type = type;
		chars[0] = char1;
		chars[1] = char2;
		chars[2] = char3;
		
		printAuthor();
		printCharacters();
		printName();
		printPage();
		printType();
		printPublisher();
		printEdition();
	}
	
	public void setCharacters(int i, String character){
		
		chars[i]= character;
	}

	private void printCharacters(){
		
		System.out.println("The Characters are: "+ chars[0] +" "+ chars[1] +" "+ chars[2]);
	}
}
