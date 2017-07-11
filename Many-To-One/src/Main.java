import com.sathya.hibernate.dao.ManyToOneDAO;
import com.sathya.hibernate.dao.ManyToOneDAOFactory;


public class Main {

	public static void main(String[] args) {
		ManyToOneDAO dao=ManyToOneDAOFactory.getInstance();
		
     dao.saveItem();
		//dao.deleteItem();
	}

}
