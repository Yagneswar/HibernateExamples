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
		card.setPaymentId(11011);
		card.setAmount(8000);
		card.setPaymentDate(new java.util.Date());
		card.setCardNumber(321566);
		card.setCardType("MASTER");
		dao.saveCard(card);
		
		System.out.println("==================================================");
		
		Cheque cheque=new Cheque();
		cheque.setPaymentId(22022);
		cheque.setAmount(6000);
		cheque.setPaymentDate(new java.util.Date());
		cheque.setChequeNumber(560327);
		cheque.setChequeType("ORDER");
		dao.saveCheque(cheque);
		System.out.println("===================================================");
		
	}

}

