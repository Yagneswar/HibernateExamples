import com.sathya.hibernate.dao.EmployeeDAO;
import com.sathya.hibernate.dao.EmployeeDAOFactory;


public class Main {

	public static void main(String[] args) {

		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		
		dao.findEmployeesByDeptno(20);
		System.out.println("===========================");
		dao.updateEmployeesByDeptno(10);
	}

}
