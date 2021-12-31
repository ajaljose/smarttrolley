<%-- 
    Document   : Login
    Created on : Feb 9, 2020, 1:08:52 PM
    Author     : Ajal Jose
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">LOGIN</h1>
        <form method="post">
        <table align="center" >
            <tr>
                <td>Username</td>
                <td>:</td>
                <td><input type="text" name="login" required="required"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td>:</td>
                <td><input type="password" name="password" required="required"/></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><input  type="submit" name="btnsubmit" value="Login"/></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td>
            <%
            if(request.getParameter("btnsubmit")!=null){
                String name=request.getParameter("login");
                String pswd=request.getParameter("password");
                obj.readData("select * from tb_admin where admin_name='"+name+"' and admin_password='"+pswd+"'");
                if(obj.rs.next()){
                     out.println("hai");
                        session.setAttribute("adminid",obj.rs.getString("id"));
                        response.sendRedirect("../Admin/index.html");
                        
                    }
                    else{
                        out.print("Login Failed");
                    }
                }
                
            
            %> </td>
            </tr>
        </table>
        </form>
            <%@include file="footer.jsp" %>
    </body>
</html>
