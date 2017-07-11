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


public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String strBookId=request.getParameter("bid");
		//wrap
		int bookId=Integer.parseInt(strBookId);
		//read dao object
		BookDAO dao=BookDAOFactory.getInstance();
		Book b=dao.readBook(bookId);
		PrintWriter out=response.getWriter();
		if(b==null)
		{
			out.println("<h1>Sorry, The given bookid doesn't exist in database</h1>");
		}
		else
		{
			out.println("<h1>");
			out.println("Book id:"+b.getBookId());
			out.println("<br>");
			out.println("Book Name:"+b.getBookName());
			out.println("<br>");
			out.println("Price:"+b.getPrice());
			out.println("</h1>");
		}
	}

}
