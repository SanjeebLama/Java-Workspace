

<%@page session="true" %>
<jsp:useBean id="bean" class="bean.OrchidSetAQues14" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SetProperty </title>
    </head>
    <body>
        Name : <jsp:getProperty name="bean" property="name"/><br/>
        Price : <jsp:getProperty name="bean" property="price"/><br/>
        Qty : <jsp:getProperty name="bean" property="qty"/><br/>
    </body>
</html>
