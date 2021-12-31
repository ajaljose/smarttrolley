<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>smart trolley</title>
         <%@include file="index.html" %>
    </head>
   <body>
        <%
        if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname"); 
            String category=request.getParameter("category");
            boolean b=false;
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_subcategory set subcategory_name='"+name+"' where subcategory_id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_subcategory(subcategory_name,category_id)values('"+name+"',"+category+")");
            }
            response.sendRedirect("subcategory.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_subcategory where subcategory_id="+did);
        }
        String edid="",ename="",cname="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
           ename=request.getParameter("na"); 
           cname=request.getParameter("ctn");
        }
        
        %>
   <center>
        <form method="post">
            <table>
                <tr>
                    <td>Subcategory Name</td>
                    <td>:</td>
                    <td><input type="text" name="txtname" required="required" value="<%=ename%>"/></td>                   
                </tr>   
                <tr>
                    <td>Category</td>
                    <td>:</td>
                    <td>
                        <select name="category">
                            <option value="0">--------select-------</option>
                           <% obj.readData("select * from tb_category");
                            while(obj.rs.next()){%>
                            <option value="<%=obj.rs.getString("category_id")%>"><%=obj.rs.getString("category_name")%><%=cname%></option>
                            <% } %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" name="btnsubmit"/></td>
                </tr>
                <tr>
                    <td  colspan="3">
                        <table border="1" cellspacing="0" cellpadding="3" width="300" id="tab">
                            <tr>
                                <th>Category</th>
                                <th>Subcategory</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                            obj.readData("select * from tb_subcategory s,tb_category c where s.category_id=c.category_id");
                            String nam="",id="",ct="",ctnam="";
                            while(obj.rs.next()){
                                id=obj.rs.getString("subcategory_id");
                                nam=obj.rs.getString("subcategory_name");
                                ct=obj.rs.getString("category_id");
                                ctnam=obj.rs.getString("category_name");
                            %>
                            <tr>
                                <td><%=ctnam%></td>
                                <td><%=nam %></td>
                                <td><a href="subcategory.jsp?edid=<%=id%>&na=<%=nam%>&ctn=<%=ctnam%>">Edit</a></td>
                                <td><a href="subcategory.jsp?did=<%=id%>">Delete</a></td>
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



