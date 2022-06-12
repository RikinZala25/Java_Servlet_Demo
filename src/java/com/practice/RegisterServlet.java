package com.practice;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author rikin
 */
public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String fname = request.getParameter("user_firstname");
            String mname = request.getParameter("user_middlename");
            String lname = request.getParameter("user_lastname");
            String course = request.getParameter("user_course");
            String gender = request.getParameter("user_gender");
            String phone = request.getParameter("user_phone");
            String address = request.getParameter("user_address");
            String email = request.getParameter("user_email");
            String password = request.getParameter("user_password");
            String terms = request.getParameter("user_terms");

            if (terms != null) {
            if (terms.equals("checked")) {
                out.println("<h2>Successfully Registered</h2>");
                
                out.println("<h2> Full Name: " + fname +" "+mname +" "+lname+ "</h2>");
                out.println("<h2> Course: " + course + "</h2>");
                out.println("<h2> Gender: " + gender + "</h2>");
                out.println("<h2> Phone: " + phone + "</h2>");
                out.println("<h2> Address: " + address + "</h2>");
                out.println("<h2> Email: " + email + "</h2>");
                out.println("<h2> Password: " + password + "</h2>");
                                
            } else {
                out.println("<h2>You have not accepted terms and conditions.</h2>");
            }
        } else {
            out.println("<h2>You have not accepted terms and conditions.</h2>");
        }

    }

}
