<%-- 
    Document   : js_sample
    Created on : Jan 28, 2020, 5:21:51 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>J Script</title>
        <script>
           
            function total()
            {
                var a,b,c;
                a=document.getElementById("txtno1").value;
                b=document.getElementById("txtno2").value;
                c=parseInt(a)+parseInt(b);
                document.getElementById("txtresult").value=c;
            }
            function minus()
            {
                var a,b,c;
                a=parseInt(document.getElementById("txtno1").value);
                b=parseInt(document.getElementById("txtno2").value);
                c=parseInt(a)-parseInt(b);
                document.getElementById("txtresult").value=c;
            }
            function mul()
            {
                var a,b,c;
                a=parseInt(document.getElementById("txtno1").value);
                b=parseInt(document.getElementById("txtno2").value);
                c=parseInt(a)*parseInt(b);
                document.getElementById("txtresult").value=c;
            }
            function div()
            {
                var a,b,c;
                a=parseFloat(document.getElementById("txtno1").value);
                b=parseFloat(document.getElementById("txtno2").value);
                c=a/b;
                document.getElementById("txtresult").value=c;
            }
            
        </script>
    </head>
    <body>
        <form method="post">
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
                    <td>
                        <input type="button" id="btnadd" name="btnadd" value="+" onclick="total()">
                        <input type="button" id="btnminus" name="btnminus" value="-" onclick="minus()">
                        <input type="button" id="btnmul" name="btnmul" value="*" onclick="mul()">
                        <input type="button" id="btndiv" name="btndiv" value="/" onclick="div()">
                    </td>
                </tr>
                <tr>
                    <td>Result</td>
                    <td><input type="number" id="txtresult" name="txtresult" value=""></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
