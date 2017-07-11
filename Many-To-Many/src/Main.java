import com.sathya.hibernate.dao.ManyToManyDAO;
import com.sathya.hibernate.dao.ManyToManyDAOFactory;


public class Main {

	public static void main(String[] args) {
		ManyToManyDAO dao=ManyToManyDAOFactory.getInstance();
		dao.saveBooks();

	}

}

