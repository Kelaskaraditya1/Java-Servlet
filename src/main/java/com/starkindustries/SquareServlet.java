package com.starkindustries;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/square")
public class SquareServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			int num1 = Integer.parseInt((request.getAttribute("num1").toString()));
			int num2=Integer.parseInt(request.getAttribute("num2").toString());
			PrintWriter writer = response.getWriter();
			writer.println("The Square of num1+num2 is:"+Math.pow(num1+num2,2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
