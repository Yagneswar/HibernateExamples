import com.sathya.hibernate.dao.paymentDAO;
import com.sathya.hibernate.dao.paymentDAOFactory;
import com.sathya.hibernate.model.Cheque;
import com.sathya.hibernate.model.CreditCard;


public class Main {
	
	public static void main(String[] arg)
	{
		paymentDAO dao=paymentDAOFactory.getInstance();
		//call saveCard()
		
		CreditCard card=new CreditCard();
		card.setPaymentId(11032);
		card.setAmount(9000);
		card.setPaymentDate(new java.util.Date());
		card.setCardNumber(322113);
		card.setCardType("MASTREO");
		dao.saveCard(card);
		
		System.out.println("==================================================");
		
		Cheque cheque=new Cheque();
		cheque.setPaymentId(22043);
		cheque.setAmount(7000);
		cheque.setPaymentDate(new java.util.Date());
		cheque.setChequeNumber(560330);
		cheque.setChequeType("ORDER");
		dao.saveCheque(cheque);
		System.out.println("===================================================");
		
	}

}
