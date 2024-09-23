package Oops;

public class UseLibraray {
	public static void main(String[]args) {
		Book b=new Book();
			b.bookName="Ferari";
			b.author="Vignesh";
			b.noOfPages=5000;
			b.isEnglish=true;
			
	     Library l=new Library();
	     l.name="Anna Libraray";
	     l.place="Adaiyar,Chennai";
	     l.book=b;
		System.out.println("Library - "+l.name+" "+l.place+" "+"\n"+"Book - "+l.book.bookName+" "+l.book.author+" "+l.book.noOfPages+" "+l.book.isEnglish);
		
		}
		
	}
class Book {
	String bookName;
	String author;
	int noOfPages;
	boolean isEnglish;
	
}
class Library {
	String name;
	String place;
	Book book;
}


