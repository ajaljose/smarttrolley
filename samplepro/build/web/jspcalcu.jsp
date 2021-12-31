<%-- 
    Document   : jspcalcu
    Created on : Jan 29, 2020, 5:42:08 PM
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
            int a=0,b=0,c=0;
            if(request.getParameter("btnadd")!=null)
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a+b;
            }
            if(request.getParameter("btnminus")!=null)
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a-b;
            }
            if(request.getParameter("btnmul")!=null)
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a*b;
            }
            if(request.getParameter("btndiv")!=null)
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a/b;
            }
        %>
        <form method="post" name="frmcalc">
            <table>
                <tr>
                    <td>No1</td>
                    <td><input type="number" id="txtno1" name="txtno1"></td>
                </tr>
                <tr>
                    <td>No2</td>
                    <td><input type="number" id="txtno2" name="txtno2"></td>
                </tr>
                <tr>
                    <td>Select operation</td>
                    <td>:</td>
                    <td>
                        <input type="submit" id="btnadd" name="btnadd" value="+">
                        <input type="submit" id="btnminus" name="btnminus" value="-">
                        <input type="submit" id="btnmul" name="btnmul" value="*">
                        <input type="submit" id="btndiv" name="btndiv" value="/">
                    </td>
                        
                </tr>
                <tr>
                    <td>Result</td>
                    <td>:</td>
                    <td><input type="number" id="txtresult" name="txtresult" value="<%=c %>"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
