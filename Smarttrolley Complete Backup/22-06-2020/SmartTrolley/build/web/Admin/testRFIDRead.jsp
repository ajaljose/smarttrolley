<%-- 
    Document   : testRFIDRead
    Created on : Feb 27, 2020, 5:24:10 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
        String rfid="";
        rfid+=request.getParameter("rfidNo");
        String dv="";
        dv+=request.getParameter("device_id");
        out.println("RF="+rfid+" DV="+dv);
        System.out.println("RF="+rfid+" DV="+dv);
           
        %>
        
    </body>
</html>
