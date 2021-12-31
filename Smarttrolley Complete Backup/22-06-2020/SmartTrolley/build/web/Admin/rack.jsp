<%-- 
    Document   : rack
    Created on : 2 Mar, 2020, 5:00:46 PM
    Author     : DREAM
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
                String did=request.getParameter("block");
                
                boolean b=false;
                if(request.getParameter("edid")!=null){
                    b=obj.execute("update tb_rack set rack_no='"+name+"' where rack_id="+request.getParameter("edid"));
                }
                else{
                    b=obj.execute("insert into tb_rack(rack_no,block_id) values ('"+name+"',"+did+")");
                }
                response.sendRedirect("rack.jsp");
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
    <form method="post" >
         <table align="center">
                <tr>
                    <td>Rack</td>
                    <td>
                        <input type="text" name="txtname" required="required" value="<%=ename%>"/>
                    </td>
                </tr>
                <tr>
                    <td>Block</td>
                    
                    <td>
                        <select name="block">
                            <option value="0">----------select----------</option>
                            <%
                                obj.readData("select * from tb_block");
                                String nam="",id="";
                                while(obj.rs.next()){
                                    
                            %>
                                <option value="<%=obj.rs.getString("block_id")%>"><%=obj.rs.getString("block_name")%></option>
                            <%
                                }
                            %>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit" value="Add Rack"/></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <table align="center" border="1" cellspacing="0" cellpadding="4" width="300" id="tab">
                            <tr>
                                <th>Block</th>
                                <th>Rack</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                                obj.readData("select * from tb_rack p,tb_block d where p.block_id=d.block_id");
                            String na="",i="",dsn="";
                            while(obj.rs.next()){
                                i=obj.rs.getString("rack_id");
                                na=obj.rs.getString("rack_no");
                                dsn=obj.rs.getString("block_name");
                            %>
                            <tr>
                                <td><%=dsn %></td>
                                <td><%=na %></td>
                                <td><a href="rack.jsp?edid=<%=i%>&na=<%=na%>">Edit</a></td>
                                <td><a href="rack.jsp?did=<%=i%>">Delete</a></td>
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
