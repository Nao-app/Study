package keisyou;

public class Book extends TangibleAsset{
	private String isbn;
	
	public Book(String name, int price, String color){
		super(name,color,price);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
