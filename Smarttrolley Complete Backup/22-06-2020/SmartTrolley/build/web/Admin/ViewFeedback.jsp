<%-- 
    Document   : ViewFeedback
    Created on : 08-Apr-2020, 08:53:37
    Author     : hp -pc
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
         <table align="center" border="1" cellspacing="0" cellpadding="4" width="400" id="tab">
                            <tr>
                                <th>user Name</th>
                                <th>Address</th>
                                <th>Contact</th>
                                <th>feedback</th>
                                 <th>Date</th>
                            </tr>
                            <%
                                obj.readData("select * from tbl_feedback f inner join tb_register u on u.id=f.user_id");
                            String i="",sid="",tid="",feed="",dte="";
                            while(obj.rs.next()){
                                i=obj.rs.getString("name");
                                sid=obj.rs.getString("address");
                                tid=obj.rs.getString("contactno");
                                feed=obj.rs.getString("feedback_content");
                                 dte=obj.rs.getString("feedback_date");
                            %>
                            <tr>
                                <td><%=i %></td>
                                <td><%=sid %></td>
                                <td><%=tid %></td>
                                <td><%=feed %></td>
                                <td><%=dte %></td>
                                </tr>
                            <%
                            }
                            %>
                        </table>
                    </td>
                
            </table>
    </body>
</html>
