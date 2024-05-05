package com.uvce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("subjectName1");
		String sc1 = request.getParameter("subjectCode1");
		String tm1 = request.getParameter("totalmarks1");
		int om1 = Integer.parseInt(request.getParameter("obtainedmarks1"));
		String grade1 = grade(Integer.parseInt(request.getParameter("obtainedmarks1")));

		String s2 = request.getParameter("subjectName2");
		String sc2 = request.getParameter("subjectCode2");
		String tm2 = request.getParameter("totalmarks2");
		int om2 = Integer.parseInt(request.getParameter("obtainedmarks2"));
		String grade2 = grade(Integer.parseInt(request.getParameter("obtainedmarks2")));

		String s3 = request.getParameter("subjectName3");
		String sc3 = request.getParameter("subjectCode3");
		String tm3 = request.getParameter("totalmarks3");
		int om3 = Integer.parseInt(request.getParameter("obtainedmarks3"));
		String grade3 = grade(Integer.parseInt(request.getParameter("obtainedmarks3")));

		String s4 = request.getParameter("subjectName4");
		String sc4 = request.getParameter("subjectCode4");
		String tm4 = request.getParameter("totalmarks4");
		int om4 = Integer.parseInt(request.getParameter("obtainedmarks4"));
		String grade4 = grade(Integer.parseInt(request.getParameter("obtainedmarks4")));

		out.print("<table border=\"1px\">");
		out.print("<th>Subject name</th>");
		out.print("<th>Subject Code</th>");
		out.print("<th>Total Marks </th>");
		out.print("<th>Obtained Marks </th>");
		out.print("<th>Grade </th>");

		out.print("<tr>");
		out.print("<td>" + s1 + "</td>");
		out.print("<td>" + sc1 + "</td>");
		out.print("<td>" + tm1 + "</td>");
		out.print("<td>" + om1 + "</td>");
		out.print("<td>" + grade1 + "</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>" + s2 + "</td>");
		out.print("<td>" + sc2 + "</td>");
		out.print("<td>" + tm2 + "</td>");
		out.print("<td>" + om2 + "</td>");
		out.print("<td>" + grade2 + "</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>" + s3 + "</td>");
		out.print("<td>" + sc3 + "</td>");
		out.print("<td>" + tm3 + "</td>");
		out.print("<td>" + om3 + "</td>");
		out.print("<td>" + grade3 + "</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>" + s4 + "</td>");
		out.print("<td>" + sc4 + "</td>");
		out.print("<td>" + tm4 + "</td>");
		out.print("<td>" + om4 + "</td>");
		out.print("<td>" + grade4 + "</td>");
		out.print("</tr>");
		out.print("</table>");

	}

	String grade(int g) {
		if (g >= 90) {
			return "S+";
		} else if (g >= 80 && g <= 89) {
			return "A";
		} else if (g >= 70 && g <= 79) {
			return "B";
		} else if (g >= 60 && g <= 69) {
			return "C";
		} else if (g >= 50 && g <= 59) {
			return "D";
		} else if (g >= 40 && g <= 49) {
			return "E";
		} else {
			return "F";
		}
	}
}
