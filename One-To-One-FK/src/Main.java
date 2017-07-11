import com.sathya.hibernate.dao.OneToOneDAO;
import com.sathya.hibernate.dao.OneToOneDAOFactory;



public class Main {
	public static void main(String ar[])
	{
		OneToOneDAO dao=OneToOneDAOFactory.getInstance();
		     
		       dao.savePassports();
	}

}
