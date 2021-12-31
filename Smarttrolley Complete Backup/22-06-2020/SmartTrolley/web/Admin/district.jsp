<%-- 
    Document   : district
    Created on : Feb 4, 2020, 5:30:33 PM
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
                boolean b=false;
                if(request.getParameter("edid")!=null){
                    b=obj.execute("update tb_district set district_name='"+name+"' where district_id="+request.getParameter("edid"));
                }
                else{
                    b=obj.execute("insert into tb_district(district_name) values ('"+name+"')");
                }
                response.sendRedirect("district.jsp");
            }
            if(request.getParameter("did")!=null){
                String did=request.getParameter("did");
                obj.execute("delete from tb_district where district_id="+did);
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
                    <td>District Name</td>
                    <td><input type="text" name="txtname" required="required" value="<%=ename%>"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit" value="Add District"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table align="center" border="1" cellspacing="0" cellpadding="3" width="300" id="tab">
                            <tr>
                                <th>DistrictName</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                                obj.readData("select * from tb_district");
                            String nam="",id="";
                            while(obj.rs.next()){
                                id=obj.rs.getString("district_id");
                                nam=obj.rs.getString("district_name");
                            %>
                            <tr>
                                <td><%=nam %></td>
                                <td><a href="district.jsp?edid=<%=id%>&na=<%=nam%>">Edit</a></td>
                                <td><a href="district.jsp?did=<%=id%>">Delete</a></td>
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
