package com.sathya.hibernate.dao;

public interface paymentDAO {
	void saveCard(CreditCard card);
	void saveCheque(Cheque cheque);

}
