s<%-- 
    Document   : stock
    Created on : 6 Feb, 2020, 6:56:08 PM
    Author     : HOME
--%>

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
            
           // String sd=request.getParameter("txtname"); 
           // String st=request.getParameter("txtname2");
            String product=request.getParameter("product");
            String sp=request.getParameter("txtname3");
            String sed=request.getParameter("txtname4");
            String smd=request.getParameter("txtname5");
            String sb=request.getParameter("txtname6");
            String sc=request.getParameter("txtname7");
            
            boolean b=false;
            out.print("hello");
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_stock set stock_date=curdate(),stock_time=cuttime(),product_id="+product+",stock_expirydate='"+sed+"',stock_manufacturedate='"+smd+"',stock_count='"+sc+"'where stock_id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_stock(stock_date,stock_time,product_id,stock_expirydate,stock_manufacturedate,stock_count)values(curdate(),curtime(),"+product+",'"+sed+"','"+smd+"',"+sc+")");
            }
            response.sendRedirect("stock.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_stock where stock_id="+did);
        }
        String edid="",est="",eproduct="",esp="",esed="",esmd="",esb="",esc="",esd="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            esd=request.getParameter("sd");
           est=request.getParameter("st"); 
           esp=request.getParameter("sp");
           esed=request.getParameter("sed");
           esmd=request.getParameter("smd");
           esb=request.getParameter("sb");
           esc=request.getParameter("sc");
           eproduct=request.getParameter("pdt");
        }
        
        %>  
    <center>
   
        <form method="post">
            <table>
                 
                 <tr>
                    <td>Product</td>
                    <td>:</td>
                    <td>
                        <select name="product">
                            <option value="0">--------select-------</option>
                           <% obj.readData("select * from tb_product");
                            while(obj.rs.next()){%>
                            <option value="<%=obj.rs.getString("product_id")%>" <% if(eproduct.equals(obj.rs.getString("product_name"))){ %> selected="selected"m <%}%> ><%=obj.rs.getString("product_name")%> </option>
                            <% } %>
                
 
                <tr>
                    <td>Expiry Date</td>
                    <td>:</td>
                    <td><input type="date" name="txtname4" required="required" value="<%=esed%>"/></td>                   
                </tr>   
                 <tr>
                    <td>Manufacturing Date</td>
                    <td>:</td>
                    <td><input type="date" name="txtname5" required="required" value="<%=esmd%>"/></td>                   
                </tr>   
                
                <tr>
                    <td>Stock Count</td>
                    <td>:</td>
                    <td><input type="text" name="txtname7" required="required" value="<%=esc%>"/></td>                   
                </tr>   
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" name="btnsubmit"/></td>
                </tr>
                 <tr>
                    <td  colspan="9">
                        <table border="1" cellspacing="0" cellpadding="3" width="300" id="tab">
                            <tr>
                                 <th>Stock Id</th>
                                <th>Stock Date</th>
                                <th>Stock Time</th>
                                <th>Product</th>
                                <th>Expiry Date</th>
                                <th>Manufacture Date</th>
                                <th>Stock Count</th>
                                <th colspan="2">Action</th>
                            </tr>
                            <%
                            obj.readData("select * from tb_stock s,tb_product p where s.product_id=p.product_id");
                            String id="",product_id="",stock_price="",stock_date="",stock_time="",stock_expirydate="",stock_manufacturedate="",stock_batch="",stock_count="";
  
                            while(obj.rs.next()){
                                id=obj.rs.getString("stock_id");
                                stock_date=obj.rs.getString("stock_date");
                                stock_time=obj.rs.getString("stock_time");
                                product_id=obj.rs.getString("product_name");
                               // stock_price=obj.rs.getString("stock_price");
                                stock_expirydate=obj.rs.getString("stock_expirydate");
                                stock_manufacturedate=obj.rs.getString("stock_manufacturedate");
                                //stock_batch=obj.rs.getString("stock_batchno");
                                stock_count=obj.rs.getString("stock_count");
                            %>
                            <tr>
                                <td><%=id%></td>
                                <td><%=stock_date %></td>
                                <td><%=stock_time %></td>
                                <td><%=product_id%></td>
                             
                                <td><%=stock_expirydate %></td>
                                <td><%=stock_manufacturedate%></td>
                              
                                <td><%=stock_count %></td>
                                <td><a href="stock.jsp?edid=<%=id%>&sd=<%=stock_date%>&st=<%=stock_time%>&pdt=<%=product_id%>&sed=<%=stock_expirydate%>&smd=<%=stock_manufacturedate%>&sc=<%=stock_count%>">Edit</a></td>
                                <td><a href="stock.jsp?did=<%=id%>">Delete</a></td>
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


