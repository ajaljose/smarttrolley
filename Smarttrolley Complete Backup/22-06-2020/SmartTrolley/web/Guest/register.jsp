<%-- 
    Document   : register
    Created on : Feb 6, 2020, 6:22:38 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj1"></jsp:useBean>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Smart  Trolley</title>
    </head>
    <body>
        <%
        if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname");
            String address=request.getParameter("txtaddress");
            String email=request.getParameter("txtemail");
            String contactno=request.getParameter("contact");
            String gender=request.getParameter("gender");
            String uname=request.getParameter("txtuname");
            String password=request.getParameter("txtpassword");
            String aadhar=request.getParameter("aadhar");
            String placeid=request.getParameter("place");
            String photo=request.getParameter("photo");
            boolean b=false;
                b=obj1.execute("insert into tb_register(name,address,email,contactno,gender,username,password,placeid,photo,aadharno)values('"+name+"','"+address+"','"+email+"',"+contactno+",'"+gender+"','"+uname+"','"+password+"',"+placeid+",'"+photo+"',"+aadhar+")");
                 if (b==true){
                    out.print("success");
                }
                else {
                    out.print("failed");
                }
        }
        
        %>
        <form method="post" enctype="multipart/form-data" action="UploadAction.jsp">
            <table align="center">
                <th align="center">REGISTRATION</th>
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="txtname" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>
                        <input type="text" name="txtaddress" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <input type="text" name="txtemail" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td>
                        <input type="number" name="contact" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <input type="radio" name="gender" value="male" required="required">Male
                        <input type="radio" name="gender" value="female" required="required">Female
                    </td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td>
                        <input type="text" name="txtuname" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" name="txtpassword" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>District</td>
                    
                    <td>
                        <select name="district">
                            <option value="0">----------select----------</option>
                            <%
                                obj1.readData("select * from tb_district");
                                String nam="",id="";
                                while(obj1.rs.next()){
                                    
                            %>
                                <option value="<%=obj1.rs.getString("district_id")%>"><%=obj1.rs.getString("district_name")%></option>
                            <%
                                }
                            %>
                </tr>
                <tr>
                    <td>Place</td>
                    <td>
                        <select name="place">
                            <option value="0">----------select----------</option>
                            <%
                                obj1.readData("select * from tb_place");
                                
                                while(obj1.rs.next()){
                                    
                            %>
                                <option value="<%=obj1.rs.getString("place_id")%>"><%=obj1.rs.getString("place_name")%></option>
                            <%
                                }
                            %>
                        </select>    
                    </td>     
                </tr>
                <tr>
                    <td>Photo</td>
                    <td>
                        <input type="file" name="photo" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>Aadhar number</td>
                    <td>
                        <input type="number" name="aadhar" required="required" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit" value="Register" /></td>
                </tr>
            </table>
        </form>
         <%@include file="footer.jsp" %>
    </body>
</html>
