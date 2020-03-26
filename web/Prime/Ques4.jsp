<%-- 
    Document   : Ques4
    Created on : Mar 26, 2020, 3:54:47 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial</title>
    </head>
    <body>
        <h1>Find Factorial</h1>
        
        <%
            int n = 4;
        %>

        <%!
            int factorial(int n) {
                if (n == 1) {
                    return n;
                } else {
                    return n * factorial(n - 1);
                }
            }
        %>
        <%
            out.println("The factorial of  " + n + "  is : " + factorial(n));
        %>

    </body>
</html>
