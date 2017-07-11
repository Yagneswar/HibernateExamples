import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insert {

	public static void main(String[] args) {
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		
		product p=new product();
		p.setProductId(102);
		p.setProductName("Hibernate");
		p.setPrice(7000);
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		System.out.println("record inserted successfully !!");
		session.close();
		factory.close();

	}

}
