<%-- 
    Document   : newreg
    Created on : Jan 31, 2020, 9:35:24 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj1"></jsp:useBean> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (request.getParameter("btsubmit")!=null){
                
                String name=request.getParameter("tname");
                String email=request.getParameter("tmail");
                boolean b=obj1.execute("insert into registration(name,email)values('"+name+",'"+email+"')");
                if (b==true){
                    out.print("success");
                }
                else {
                    out.print("failed");
                }
            }
        %>
        <form method="post">
            <table>
                <tr>
                    <td>name</td>
                <td>
                    <input type="text" name="tname"/>
                </td>
                </tr>
                <tr>
                    <td>email</td>
                <td>
                    <input type="text" name="tmail"/>
                </td>
                </tr>
                <tr>
                    <td>
                    <input type="submit" name="btsubmit"/>
                    </td>
                </tr>    
            </table>
        </form>
    </body>
</html>
