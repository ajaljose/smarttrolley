<%-- 
    Document   : showproduct
    Created on : Feb 11, 2020, 6:58:06 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<!DOCTYPE html>
<%
    if(request.getParameter("sid")!=null){
        String sid=request.getParameter("sid");
    
%>

   
    <%
        int i=0;
        obj.readData("select * from tb_stock where stock_id="+sid);
    String stid="",pid="",sd="",st="",sp="",exp="",md="",bat="",sc="";
    while(obj.rs.next()){
        if(i==0){
            %>
            <table align="center" border="1" cellspacing="0" cellpadding="3" width="300">
             <tr>
                <th>Stock id</th> 
                <th>Product id</th>
                <th>Stock date</th> 
                <th>Stock time</th> 
                <th>Stock price</th>
                <th>Stock expiry date</th> 
                <th>Stock manufacture date</th> 
                <th>Stock batch number</th>
                <th>Stock count</th> 
            </tr>
            <%
            i=1;
        }
        stid=obj.rs.getString("stock_id");
        pid=obj.rs.getString("product_id");
        sd=obj.rs.getString("stock_date");
        st=obj.rs.getString("stock_time");
        sp=obj.rs.getString("stock_price");
        exp=obj.rs.getString("stock_expirydate");
        md=obj.rs.getString("stock_manufacturedate");
        bat=obj.rs.getString("stock_batchno");
        sc=obj.rs.getString("stock_count");

    %>
    <tr>
        <td><%=stid %></td>
        <td><%=pid %></td>
        <td><%=sd %></td>
        <td><%=st %></td>
        <td><%=sp %></td>
        <td><%=exp %></td>
        <td><%=md %></td>
        <td><%=bat %></td>
        <td><%=sc %></td>

    </tr>
    <%
        }
    %>
            </table>
            <%
    if(i==0){
        out.print("<h5><center>0 results found</center></h5>");
    }
      } 
    %>