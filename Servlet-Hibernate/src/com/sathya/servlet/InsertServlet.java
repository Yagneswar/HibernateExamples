package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathya.hibernate.dao.BookDAO;
import com.sathya.hibernate.dao.BookDAOFactory;
import com.sathya.hibernate.model.Book;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bookName=request.getParameter("bname");
		String strPrice=request.getParameter("price");
		
		//wrap
		double price=Double.parseDouble(strPrice);
		//create pojo object
		Book book=new Book();
		book.setBookName(bookName);
	    book.setPrice(price);
	    BookDAO dao=BookDAOFactory.getInstance();
	    PrintWriter out=response.getWriter();
	    try
	    {
	    	dao.saveBook(book);
	    	out.println("<h1>Book is saved to Database</h1>");
	    }
	    catch(Exception e)
	    {
	    	out.println("<h2>sorry,A problem in saving a Book</h2>");
	    }
	    out.close();
	}

}
