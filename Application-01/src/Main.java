import com.sathya.hibernate.dao.BookDAO;
import com.sathya.hibernate.dao.BookDAOFactory;
import com.sathya.hibernate.model.Book;


public class Main {

	public static void main(String ar[])
	{
		BookDAO dao=BookDAOFactory.getInstance();
		
		Book b=new Book();
		b.setBookId(1);
		b.setBookName("mango");
		b.setPrice(100);
		dao.saveBook(b);
		Book c=new Book();
		c.setBookId(7);
		c.setBookName("Honey");
		c.setPrice(200);
		dao.saveBook(c);
		System.out.println("=============================");
		Book book=dao.readBook(1);
		System.out.println("BookId:"+book.getBookId());
		System.out.println("BookName:"+book.getBookName());
		System.out.println("Price:"+book.getPrice());	
		
	}
}

