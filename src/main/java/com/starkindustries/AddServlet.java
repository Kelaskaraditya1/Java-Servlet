package com.starkindustries;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			int num1=Integer.parseInt(request.getParameter("num1"));
			int num2=Integer.parseInt(request.getParameter("num2"));
			request.setAttribute("num1",num1);
			request.setAttribute("num2", num2);
			RequestDispatcher dispatcher = request.getRequestDispatcher("square");
			dispatcher.forward(request,response);
//			PrintWriter writer = response.getWriter();
//			writer.println("The sum of num1 and num2 is:"+(i+j));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
