/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nagarjuna;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class SetBQues3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        double p , t, r , si;
        p = Double.parseDouble(request.getParameter("p"));
        t = Double.parseDouble(request.getParameter("t"));
        r = Double.parseDouble(request.getParameter("r"));
        si = (p*t*r)/100;
        pw.print("Simple Interest : "+si);
    }

}
