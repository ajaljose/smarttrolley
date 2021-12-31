<%-- 
    Document   : product
    Created on : Feb 10, 2020, 5:30:40 PM
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
        
        <script src="../JQ/JQuery.js"></script>
        <script>
            function show_products(sid){

                if(sid ==""){
                   $("#div_pro").html(""); 
                }
                else{                
                $.ajax({
                 url: "showproduct.jsp",
                 cache: false,
                 type: "POST",
                 data: {sid : sid},

                 success: function(html){
                   $("#div_pro").html(html);
                 }
               });
               }
                
            }
        </script>
    </head>
    <body>
        <%
            if(request.getParameter("btnsubmit2")!=null){
                
                String pid=request.getParameter("product");
                String tid=request.getParameter("tagid");
                out.print(request.getParameter("edid"));
                boolean b=false;
                if(request.getParameter("edid")!=null){
                    b=obj.execute("update tb_producttag set producttag_tagid='"+tid+"',product_id='"+pid+"' where producttag_id="+request.getParameter("edid"));
                }
                else{
                    b=obj.execute("insert into tb_producttag(producttag_tagid,product_id)values('"+tid+"','"+pid+"')");
                }
                response.sendRedirect("productlist.jsp");
            }
            if(request.getParameter("did")!=null){
                String did=request.getParameter("did");
                obj.execute("delete from tb_producttag where producttag_id="+did);
            }
        String edid="",ename="",etid="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            ename=request.getParameter("na");
            etid=request.getParameter("tid");
        }
       %>
    <center>
        <form method="post">
            <table>
               
                <tr>
                    <td>Product</td>
                    <td>
                        <select name="product">
                            <option value="0">----------select----------</option>
                            <%
                                obj.readData("select * from tb_product");
                                //String nam="",id="";
                                while(obj.rs.next()){
                                    
                            %>
                                <option value="<%=obj.rs.getString("product_id")%>" <%if(obj.rs.getString("product_id").equals(ename)){ %><% } %> ><%=obj.rs.getString("product_name")%></option>
                            <%
                                }
                            %>
               
                        </select>
                    </td>
                </tr> 
             
                    <tr>
                        <td colspan="5">
                            <div id="div_pro"></div>
                        </td>
                        
                    </tr>            
                <tr>
                    <td>Tag no/id</td>
                    <td>
                        <input type="text" name="tagid" value="<%=etid%>"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnsubmit2" value="Save"/></td>
                </tr>
                <td colspan="2">
                        <table align="center" border="1" cellspacing="0" cellpadding="4" width="400" id="tab">
                            <tr>
                                <th>Product Tag</th>
                                <th>Product</th>
                                <th>Tag id</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                                obj.readData("select * from tb_producttag");
                            String i="",sid="",tid="";
                            while(obj.rs.next()){
                                i=obj.rs.getString("producttag_id");
                                sid=obj.rs.getString("product_id");
                                tid=obj.rs.getString("producttag_tagid");
                            %>
                            <tr>
                                <td><%=i %></td>
                                <td><%=sid %></td>
                                <td><%=tid %></td>
                                <td><a href="productlist.jsp?edid=<%=i%>&na=<%=sid%>&tid=<%=tid%>">Edit</a></td>
                                <td><a href="productlist.jsp?did=<%=i%>">Delete</a></td>
                            </tr>
                            <%
                            }
                            %>
                        </table>
                    </td>
                
            </table>
        </form>
    </center>
    </body>
</html>
