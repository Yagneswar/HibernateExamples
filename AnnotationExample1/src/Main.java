import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Book b=new Book();
		b.setBookId(1019);
		b.setBookName("hadoop");
		b.setPrice(700);
		Transaction tx=session.beginTransaction();
		session.save(b);
		tx.commit();
		session.close();
		factory.close();
	}

}
