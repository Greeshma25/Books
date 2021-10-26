package favte.books.co.in;

import java.util.ArrayList;
import java.util.List;

public class FavoriteBooks 
{
	int count=0;
	
    List<String> favoriteBooks=new ArrayList(); 
	 void addFavoriteBook(String bookName)
	 {
		 if(!bookName.contains("Great"))
		 {
			 favoriteBooks.add(bookName);
			
		 }
	 }
	 void printFavoriteBooks()
	 {
		 System.out.println("Favorite Books: "+ favoriteBooks.size());
		 for(String book : favoriteBooks) {
			 System.out.println(book);
		 }
		 
	 }
	public static void main(String[] args)
	{
		
		FavoriteBooks obj=new FavoriteBooks();
		obj.addFavoriteBook("Empty World ");
		obj.addFavoriteBook("The Great Bridge ");
		obj.addFavoriteBook("A Suitable Boy ");
		
		
		obj.printFavoriteBooks();
		


	}

}
