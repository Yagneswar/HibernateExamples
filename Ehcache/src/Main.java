import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses1=factory.openSession();
		Session ses2=factory.openSession();
		Session ses3=factory.openSession();
		
		Employee e1=(Employee)ses1.get(Employee.class, 1132);
		System.out.println(e1.getEmployeeName());
		ses1.clear();
		System.out.println("session1 cache cleared");
		System.out.println(e1.getEmployeeName());
		System.out.println("=======================");
		try
		{
			Thread.sleep(6000);
			
		}
		catch(Exception e)
		{}
		
		Employee e2=(Employee)ses2.get(Employee.class, 1132);
		System.out.println(e2.getEmployeeName());
		System.out.println("=========================");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
			
		Employee e3=(Employee)ses3.get(Employee.class, 1132);
		System.out.println(e3.getEmployeeName());
		ses1.close();
		ses2.close();
		ses3.close();
		factory.close();
	}

}
