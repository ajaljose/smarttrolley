<%-- 
    Document   : reg
    Created on : Feb 3, 2020, 6:40:49 PM
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
         <form method="post">
            <table align="center">
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="txname" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td>
                        <input type="text" name="txage" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <input type="text" name="txemail" required="required"/>
                    </td>
                    <td colspan="2">
                        <table border="1" >
                            
                        </table>
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
