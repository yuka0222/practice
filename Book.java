public class Book extends TanjibleAsset{
	private Stirng isbn;
	public Book (String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public Stirng getlsbn(){return this.isbn;}
 }
