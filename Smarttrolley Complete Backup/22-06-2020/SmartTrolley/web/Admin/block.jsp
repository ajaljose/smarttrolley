<%-- 
    Document   : blockk
    Created on : 2 Mar, 2020, 4:48:37 PM
    Author     : DREAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Block</title>
         <%@include file="index.html" %>
    </head>
    <body>
         <%
            if(request.getParameter("btnsubmit")!=null){
                String name=request.getParameter("txtname");
                boolean b=false;
                if(request.getParameter("edid")!=null){
                    b=obj.execute("update tb_block set block_name='"+name+"' where block_id="+request.getParameter("edid"));
                }
                else{
                    b=obj.execute("insert into tb_block(block_name) values ('"+name+"')");
                }
                response.sendRedirect("block.jsp");
            }
            if(request.getParameter("did")!=null){
                String did=request.getParameter("did");
                obj.execute("delete from tb_block where block_id="+did);
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
                    <td>Block</td>
                    <td><input type="text" name="txtname" required="required" value="<%=ename%>"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit" value="Add Block"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table align="center" border="1" cellspacing="0" cellpadding="3" width="300" id="tab">
                            <tr>
                                <th>block</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                                obj.readData("select * from tb_block");
                            String nam="",id="";
                            while(obj.rs.next()){
                                id=obj.rs.getString("block_id");
                                nam=obj.rs.getString("block_name");
                            %>
                            <tr>
                                <td><%=nam %></td>
                                <td><a href="block.jsp?edid=<%=id%>&na=<%=nam%>">Edit</a></td>
                                <td><a href="block.jsp?did=<%=id%>">Delete</a></td>
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
