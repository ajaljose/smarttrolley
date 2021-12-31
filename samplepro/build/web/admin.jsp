<%-- 
    Document   : admin
    Created on : Jan 31, 2020, 6:19:05 PM
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
        <style>
            body{
                color: white;
                background-image: url("44.jpg");
                background-size: 100% 290%;
                font-size: 30px;
            }
        </style>
        <h1 align="center">ADMIN LOGIN</h1>
        <%
            if (request.getParameter("btsubmit")!=null){
                String name=request.getParameter("adname");
                String password=request.getParameter("adpwd");
                boolean b=obj1.execute("insert into tb_admin(admin_name,admin_password) values('"+name+"','"+password+"')");
                if (b==true){
                    out.println("success");
                }
                else{
                    out.println("failed");
                }
            }   
        %>
        <form method="post">
            <table align="center">
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="adname" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" name="adpwd" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" name="btsubmit"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
