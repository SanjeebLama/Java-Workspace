

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SetProperty</title>
    </head>
    <body>
         <form action="SetAQues14.jsp" method="get"> 
             <table>
                <tr>
                    <td>Name : </td>
                    <td> <input type="text" name="name"/> </td>
                </tr>
                 <tr>
                    <td>Price : </td>
                    <td> <input type="text" name="price"/> </td>
                </tr>
                 <tr>
                    <td>QTY : </td>
                    <td> <input type="text" name="qty"/> </td>
                </tr>
                  
                 <tr>
                    <td> </td>
                    <td> <input type="submit" > </td>
                </tr>
                
       
        </from>
    </body>
</html>
<%@page contentType="text/html" %>
<%@page session="true" %>

<%
    if (request.getParameter("name") != null) {
        String uname = request.getParameter("name");
        String price = request.getParameter("price");
        String qty = request.getParameter("qty");

%>

<jsp:useBean id="bean" class="bean.OrchidSetAQues14" scope="session"/>
<jsp:setProperty name="bean" property="name" value="<%=uname%>"/>
<jsp:setProperty name="bean" property="price" value="<%=price%>"/>
<jsp:setProperty name="bean" property="qty" value="<%=qty%>"/>

<%
        response.sendRedirect("ProcesssSetAQues14.jsp");
    }
%>