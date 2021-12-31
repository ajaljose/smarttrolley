<%-- 
    Document   : brand
    Created on : Feb 4, 2020, 5:32:39 PM
    Author     : Ajal Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file="index.html" %>
    </head>
    <body> 
        <%
        if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname");
            boolean b=false;
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_brand set brand_name='"+name+"' where brand_id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_brand(brand_name)values('"+name+"')");
            }
            response.sendRedirect("brand.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_brand where brand_id="+did);
        }
        String edid="",ename="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            ename=request.getParameter("na");
         }
        
        %>
        <h1 align="center">ADD BRAND</h1>
        <form method="post" id="tab">
            <table align="center">
                <tr>
                    <td>Brand Name</td>
                    <td>:</td>
                    <td><input type="text" name="txtname" value="<%=ename%>" required="required"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" name="btnsubmit" value="ADD"/></td>
                </tr>
                <tr>
                    <td  colspan="3">
                        <table border="1" cellspacing="0" cellpadding="3" width="300">
                            <tr>
                                <th>Name</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                            obj.readData("select * from tb_brand");
                            String nam="",id="";
                            while(obj.rs.next()){
                                id=obj.rs.getString("brand_id");
                                nam=obj.rs.getString("brand_name");
                            %>
                            <tr>
                                <td><%=nam %></td>
                                <td align="center"><a href="brand.jsp?edid=<%=id%>&na=<%=nam%>"><img src="My Documents.png" style="width: 14px;height: 14px" title="Edit" alt="Edit"></a></td>
                                <td align="center"><a href="brand.jsp?did=<%=id%>"><img src="Recycle Bin.png" style="width: 14px;height: 14px" title="Delete" alt="Remove"></a></td>
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
