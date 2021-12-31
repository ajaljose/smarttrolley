<%-- 
    Document   : place
    Created on : Feb 5, 2020, 5:17:58 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Smart Trolley</title>
         <%@include file="index.html" %>
    </head>
    <body>
        <%
            if(request.getParameter("btnsubmit")!=null){
                String name=request.getParameter("txtname");
                String did=request.getParameter("district");
                
                boolean b=false;
                if(request.getParameter("edid")!=null){
                    b=obj.execute("update tb_place set place_name='"+name+"' where place_id="+request.getParameter("edid"));
                }
                else{
                    b=obj.execute("insert into tb_place(place_name,district_id) values ('"+name+"',"+did+")");
                }
                response.sendRedirect("place.jsp");
            }
            if(request.getParameter("did")!=null){
                String did=request.getParameter("did");
                obj.execute("delete from tb_place where place_id="+did);
            }
            String edid="",ename="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            ename=request.getParameter("na");
        }
        %>
    <center>
        <form method="post">
            <table align="center">
                <tr>
                    <td>Place</td>
                    <td>
                        <input type="text" name="txtname" required="required" value="<%=ename%>"/>
                    </td>
                </tr>
                <tr>
                    <td>District</td>
                    
                    <td>
                        <select name="district">
                            <option value="0">----------select----------</option>
                            <%
                                obj.readData("select * from tb_district");
                                String nam="",id="";
                                while(obj.rs.next()){
                                    
                            %>
                                <option value="<%=obj.rs.getString("district_id")%>"><%=obj.rs.getString("district_name")%></option>
                            <%
                                }
                            %>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit" value="Add Place"/></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <table align="center" border="1" cellspacing="0" cellpadding="4" width="300" id="tab">
                            <tr>
                                <th>District</th>
                                <th>Place</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                                obj.readData("select * from tb_place p,tb_district d where p.district_id=d.district_id");
                            String na="",i="",dsn="";
                            while(obj.rs.next()){
                                i=obj.rs.getString("place_id");
                                na=obj.rs.getString("place_name");
                                dsn=obj.rs.getString("district_name");
                            %>
                            <tr>
                                <td><%=dsn %></td>
                                <td><%=na %></td>
                                <td><a href="place.jsp?edid=<%=i%>&na=<%=na%>">Edit</a></td>
                                <td><a href="place.jsp?did=<%=i%>">Delete</a></td>
                            </tr>
                            <%
                                    }
                            %>
                            
                          
                        
                        </table>
                    </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
