import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
	public static void main(String[] args)
	{
		
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	Session session=factory.openSession();
	
	Address addr=new Address();
	addr.setHno("11013");
	addr.setStreet("Bhubaneswar");
	addr.setCity("Khordha");
	Employee emp=new Employee();
	emp.setEmployeeId(103);
	emp.setEmplyeeName("yagnes");
	emp.setAddr(addr);
	Transaction tx=session.beginTransaction();
	  session.save(emp);
	  tx.commit();
	  session.close();
	  factory.close();
   
	}
}
