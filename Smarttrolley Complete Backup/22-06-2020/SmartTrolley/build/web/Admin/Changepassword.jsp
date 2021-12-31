<%-- 
    Document   : Changepassword
    Created on : 08-Apr-2020, 08:53:20
    Author     : hp -pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                 <%@include file="index.html" %>
    </head>
    <body>
         <h1 align="center"><b><i><u>Change Password</u></i></b></h1>
        <%
            String cupwd=" ",npwd=" ",conpwd=" ";
            cupwd=request.getParameter("curpwd");
            npwd=request.getParameter("newpwd");
            conpwd=request.getParameter("cnpwd");
            boolean b=false;
            if(request.getParameter("change")!=null)
            {
                obj.readData("select * from tb_admin where admin_id='"+session.getAttribute("adminid")+"' and admin_password='"+cupwd+"' ");
            
                if(obj.rs.next())
                 {
                     if(npwd.equals(conpwd))
                     {
                         b=obj.execute("update tb_admin set admin_password='"+npwd+"' where id='"+session.getAttribute("adminid")+"'");
                         
                         %>
                        <script>alert("Success");window.location.replace("AdminChangePassword.jsp");</script>
                        <%
                         
                     }
                     else
                     {
                         %>
                         <script>alert("New password and Confirm Password doesn't match");window.location.replace("AdminChangePassword.jsp");</script>
                         <%
                     }
                 }
                else
                {
                             %>
                 <script>alert("Password is incorrect");window.location.replace("AdminChangePassword.jsp");</script>
                 <%
                             }
                   
            } 
        %>       
        <form method="post">
            <table>
                <tr>
                    <td>
                        Current Password
                    </td>
                    <td>
                        <input type="text" name="curpwd" required="required"/>
                    </td>
                </tr
                <tr>
                    <td>
                        New Password
                    </td>
                    <td>
                        <input type="text" name="newpwd" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Confirm Password
                    </td>
                    <td>
                        <input type="text" name="cnpwd" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" name="change" value="Change"/>
                        <input type="reset" name="cancel" value="Cancel"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>