<%-- 
    Document   : product
    Created on : Feb 5, 2020, 5:27:49 PM
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
    <h1 align="center">ADD PRODUCT DETAILS</h1>
    <body>
        <%
            
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_product where product_id="+did);
        }
        String edid="",epname="",ebid="",esid="",ebl="",era="",epr="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            epname=request.getParameter("epna");
            ebid=request.getParameter("ebna");
            esid=request.getParameter("esna");
            ebl=request.getParameter("blck");
            era=request.getParameter("rck");
            epr=request.getParameter("pr");
         } 
        %>
    <center>
        <form method="post" enctype="multipart/form-data" action="uploadproduct.jsp">
            <table align="center" width="500">
                <tr>
                    <td>Product Name</td>
                    <td>:</td>
                    <td><input type="text" name="txtname" value="<%=epname%>" required="required"/></td>
                </tr>
                <tr>
                    <td>Subcategory</td>
                    <td>:</td>
                    <td>
                        <select name="subcategory" required="required">
                            <option value="">------------Select-----------</option>
                            <% 
                                obj.readData("select * from tb_subcategory");
                               while(obj.rs.next()){ 
                            %>
                            <option value="<%=obj.rs.getString("subcategory_id")%>"  <% if(esid.equals(obj.rs.getString("subcategory_id"))){ %> selected="selected" <%}%> ><%=obj.rs.getString("subcategory_name")%></option>
                            <%
                               }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Brand</td>
                    <td>:</td>
                    <td>
                        <select name="brand" required="required">
                            <option value="">------------Select-----------</option>
                            <%
                                 obj.readData("select * from tb_brand");
                                while(obj.rs.next()){
                            %>
                            <option value="<%=obj.rs.getString("brand_id")%>" <% if(ebid.equals(obj.rs.getString("brand_id"))){ %> selected="selected" <%}%> ><%=obj.rs.getString("brand_name")%></option>
                            <%
                              }
                            %>
                        </select>
                    </td>
                </tr>
                
                 <tr>
                    <td>Block</td>
                    <td>:</td>
                    <td>
                        <select name="block" required="required">
                            <option value="">------------Select-----------</option>
                            <%
                                 obj.readData("select * from tb_block");
                                while(obj.rs.next()){
                            %>
                            <option value="<%=obj.rs.getString("block_id")%>" <% if(ebid.equals(obj.rs.getString("block_id"))){ %> selected="selected" <%}%> ><%=obj.rs.getString("block_name")%></option>
                            <%
                              }
                            %>
                        </select>
                    </td>
                </tr>
                
                
                 <tr>
                    <td>Rack</td>
                    <td>:</td>
                    <td>
                        <select name="block" required="required">
                            <option value="">------------Select-----------</option>
                            <%
                                 obj.readData("select * from tb_rack");
                                while(obj.rs.next()){
                            %>
                            <option value="<%=obj.rs.getString("rack_id")%>" <% if(ebid.equals(obj.rs.getString("rack_id"))){ %> selected="selected" <%}%> ><%=obj.rs.getString("rack_no")%></option>
                            <%
                              }
                            %>
                        </select>
                    </td>
                </tr>
                 <tr>
                    <td>Product price</td>
                    <td>:</td>
                    <td><input type="text" name="price" id="price" required="required" /></td>
                </tr>
                
                <tr>
                    <td>Product Image</td>
                    <td>:</td>
                    <td><input type="file" name="photo" id="photo" required="required" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" name="btnsubmit"/></td>
                </tr>
                <tr>
                    <td  colspan="4">
                        <table border="1" cellspacing="0" cellpadding="4" width="500" id="tab" >
                            <tr>
                                <th>Image</th>
                                <th>Product Name</th>
                                <th>SubCategory</th>
                                <th>Brand</th>
                                <th>Block</th>
                                <th>Rack</th>
                                <th>Price</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                            obj.readData("select * from tb_product p,tb_subcategory s,tb_brand b,tb_rack r,tb_block bl where p.subcategory_id=s.subcategory_id and p.brand_id=b.brand_id and p.rack_id=r.rack_id and r.block_id=bl.block_id");
                            String pnam="",pid="",sid="",snam="",bnam="",bid="",blck="",rck="",pr="";
                               
                            while(obj.rs.next()){ 
                                pid=obj.rs.getString("product_id");
                                pnam=obj.rs.getString("product_name");
                                sid=obj.rs.getString("subcategory_id");
                                snam=obj.rs.getString("subcategory_name");
                                bnam=obj.rs.getString("brand_name");
                                bid=obj.rs.getString("brand_id");
                                 blck=obj.rs.getString("block_name");
                                 rck=obj.rs.getString("rack_no");
                                 pr=obj.rs.getString("price");
                            %>
                            <tr>
                                <td><img src="../ProImg/<%=obj.rs.getString("product_photo")%>" width="130"/></td>
                                <td><%=pnam%></td>
                                <td><%=snam%></td>
                                <td><%=bnam%></td>
                                <td><%=blck%></td>
                                <td><%=rck%></td>
                                <td><%=pr%></td>
                                <td align="center"><a href="product.jsp?edid=<%=pid%>&epna=<%=pnam%>&esna=<%=sid%>&ebna=<%=bid%>&blck=<%=blck %>&rck=<%= rck %>"&pr=<%= pr %>><img src="notebook.png" style="width: 20px;height: 20px" title="Edit" alt="Edit"></a></td>
                                <td align="center"><a href="product.jsp?did=<%=pid%>"><img src="Recycle Bin.png" style="width: 20px;height: 20px" title="Delete" alt="Remove"></a></td>
                            </tr>
                            <%
                            }
                            %>
                        </table>
                    </td>
                </tr>
            </table>
                        <input type="hidden" name="hdproductid" id="hdproductid" value="<%=edid%>"/>
        </form>
    </center>
    </body>
</html>
