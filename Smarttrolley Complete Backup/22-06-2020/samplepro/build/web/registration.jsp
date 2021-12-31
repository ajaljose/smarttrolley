<%-- 
    Document   : registration
    Created on : Jan 30, 2020, 5:50:48 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname");
            String age=request.getParameter("txtage");
            String email=request.getParameter("txtemail");
            boolean b=false;
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_reg set district_name='"+name+"',age="+age+",email='"+email+"' where id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_reg(name,age,email)values('"+name+"',"+age+",'"+email+"')");
            }
            response.sendRedirect("registration.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_reg where id="+did);
        }
        String edid="",ename="",eage="",eemail="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            ename=request.getParameter("na");
            eage=request.getParameter("ag");
            eemail=request.getParameter("em");
        }
        
        %>
        <form method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="txtname" value="<%=ename%>"/></td>
                </tr>
                <tr>
                    <td>age</td>
                    <td><input type="text" name="txtage" value="<%=eage%>"/></td>
                </tr>
                <tr>
                    <td>email</td>
                    <td><input type="text" name="txtemail" value="<%=eemail%>"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit"/></td>
                </tr>
                <tr>
                    <td  colspan="2">
                        <table border="1" cellspacing="0" cellpadding="3" width="300">
                            <tr>
                                <th>Name</th>
                                <th>Age</th>
                                <th>Email</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                            obj.readData("select * from tb_reg");
                            String nam="",ag="",em="",id="";
                            while(obj.rs.next()){
                                id=obj.rs.getString("id");
                                nam=obj.rs.getString("name");
                                ag=obj.rs.getString("age");
                                em=obj.rs.getString("email");
                            %>
                            <tr>
                                <td><%=nam %></td>
                                <td><%=ag %></td>
                                <td><%=em %></td>
                                <td><a href="registration.jsp?edid=<%=id%>&na=<%=nam%>&ag=<%=ag%>&em=<%=em%>">Edit</a></td>
                                <td><a href="registration.jsp?did=<%=id%>">Delete</a></td>
                            </tr>
                            <%
                            }
                            %>
                        </table>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
