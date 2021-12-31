<%-- 
    Document   : SignUp
    Created on : Jan 25, 2020, 6:23:03 PM
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
            out.print("welcome jsp");
            int a=10;
            out.print(a);
        %>
         <form method="get">
            <table border="0" width="300" cellpadding="7">
                <tr>
                    <td>Name</td>
                    <td>:</td>
                    <td><input type="text" name="txtname" id="txtname" value="<% out.print(a); %>" /></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td>:</td>
                    <td><input type="number" name="txtcontact" id="txtcontact" value="<%=a %>" /></td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td>:</td>
                    <td><input type="date" name="txtdate" id="txtdate" /></td>
                </tr>
                 <tr>
                    <td>Nation</td>
                    <td>:</td>
                    <td>
                        <select>
                            <option value="0">--------select--------</option>
                            <option value="1">India</option>
                            <option value="2">Pakisthan</option>
                            <option value="3">China</option>
                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>:</td>
                    <td>
                        <textarea id="txtaddress" name="txtaddress" cols="40" rows="5"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>:</td>
                    <td>
                        <input type="radio" name="Gender" value="male">Male
                        <input type="radio" name="Gender" value="female">Female
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td>
                        <input type="file" name="photo" id="profilephoto"/>
                    </td>
                </tr>
                <tr>
                    <td>hobbies</td>
                    <td>:</td>
                    <td><input type="checkbox" name="hobbies" value="reading">reading</td>
                     <td><input type="checkbox" name="hobbies" value="swimming">swimming</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" name="submit" id="submit" value="Create Account" /></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>

               <%
                            }
                            %>
                            
                            <%
                                obj.readData("select * from tb_place");
                            String name="",iid="";
                            while(obj.rs.next()){
                                i=obj.rs.getString("place_id");
                                na=obj.rs.getString("place_name");
                            %>
                            <tr>
                                <td><%=na %></td>
                                <td><a href="place.jsp?edid=<%=iid%>&na=<%=name%>">Edit</a></td>
                                <td><a href="place.jsp?did=<%=iid%>">Delete</a></td>
                            </tr>
                            <%
                            }
                            %>