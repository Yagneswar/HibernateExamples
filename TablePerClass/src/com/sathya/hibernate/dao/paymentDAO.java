package com.sathya.hibernate.dao;

import com.sathya.hibernate.model.Cheque;
import com.sathya.hibernate.model.CreditCard;

public interface paymentDAO {
	void saveCard(CreditCard card);
	void saveCheque(Cheque cheque);

}
