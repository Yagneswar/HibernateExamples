import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Select {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Object o=session.get(Book.class, 203);
		Book b=(Book)o;
		String str=b.getBookName();
		System.out.println("book name="+str);

	}

}
