package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      DB.ConnectionClass obj = null;
      synchronized (_jspx_page_context) {
        obj = (DB.ConnectionClass) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if(request.getParameter("sid")!=null){
        String sid=request.getParameter("sid");
    

      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("    ");

        int i=0;
        obj.readData("select * from tb_stock where stock_id="+sid);
    String stid="",pid="",sd="",st="",sp="",exp="",md="",bat="",sc="";
    while(obj.rs.next()){
        if(i==0){
            
      out.write("\n");
      out.write("            <table align=\"center\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" width=\"300\">\n");
      out.write("             <tr>\n");
      out.write("                <th>Stock id</th> \n");
      out.write("                <th>Product id</th>\n");
      out.write("                <th>Stock date</th> \n");
      out.write("                <th>Stock time</th> \n");
      out.write("                <th>Stock price</th>\n");
      out.write("                <th>Stock expiry date</th> \n");
      out.write("                <th>Stock manufacture date</th> \n");
      out.write("                <th>Stock batch number</th>\n");
      out.write("                <th>Stock count</th> \n");
      out.write("            </tr>\n");
      out.write("            ");

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

    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(stid );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(pid );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(sd );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(st );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(sp );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(exp );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(md );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(bat );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(sc );
      out.write("</td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("            </table>\n");
      out.write("            ");

    if(i==0){
        out.print("<h5><center>0 results found</center></h5>");
    }
      } 
    
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
