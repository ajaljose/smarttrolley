<%-- 
    Document   : QRCodeGeneration
    Created on : 05-May-2020, 11:31:49
    Author     : hp -pc
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
            Algorithm.OTPGenerator otp = new Algorithm.OTPGenerator();
                Algorithm.QrGen qr = new Algorithm.QrGen();
             
                String otp1 = otp.OTP(4);
                String qrLink = qr.GenQr(otp1);
                
                
               
            %>
    </body>
</html>
