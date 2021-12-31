<%-- 
    Document   : newjsp
    Created on : Jan 29, 2020, 6:17:17 PM
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
            String x = request.getParameter("opr");
            if(request.getParameter("ok")!=null)
            {
            if (request.getParameter("opr").equals("1"))
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a+b;
            }
            else if (request.getParameter("opr").equals("2"))
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a-b;
            }
            else if(request.getParameter("opr").equals("3"))
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a*b;
            }
            else if(request.getParameter("opr").equals("4"))
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a/b;
            }
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
                        <select name="opr">
                            <option value="0">--------select--------</option>
                            <option value="1">+</option>
                            <option value="2">-</option>
                            <option value="3">*</option>
                            <option value="4">/</option>
                        </select>
                    </td>
                    <td><input type="submit" id="ok" name="ok" value="ok"></td>    
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
