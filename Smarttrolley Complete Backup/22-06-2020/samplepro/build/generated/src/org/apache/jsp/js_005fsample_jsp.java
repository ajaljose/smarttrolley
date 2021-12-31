package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class js_005fsample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>J Script</title>\n");
      out.write("        <script>\n");
      out.write("           \n");
      out.write("            function total()\n");
      out.write("            {\n");
      out.write("                var a,b,c;\n");
      out.write("                a=document.getElementById(\"txtno1\").value;\n");
      out.write("                b=document.getElementById(\"txtno2\").value;\n");
      out.write("                c=parseInt(a)+parseInt(b);\n");
      out.write("                document.getElementById(\"txtresult\").value=c;\n");
      out.write("            }\n");
      out.write("            function minus()\n");
      out.write("            {\n");
      out.write("                var a,b,c;\n");
      out.write("                a=parseInt(document.getElementById(\"txtno1\").value);\n");
      out.write("                b=parseInt(document.getElementById(\"txtno2\").value);\n");
      out.write("                c=parseInt(a)-parseInt(b);\n");
      out.write("                document.getElementById(\"txtresult\").value=c;\n");
      out.write("            }\n");
      out.write("            function mul()\n");
      out.write("            {\n");
      out.write("                var a,b,c;\n");
      out.write("                a=parseInt(document.getElementById(\"txtno1\").value);\n");
      out.write("                b=parseInt(document.getElementById(\"txtno2\").value);\n");
      out.write("                c=parseInt(a)*parseInt(b);\n");
      out.write("                document.getElementById(\"txtresult\").value=c;\n");
      out.write("            }\n");
      out.write("            function div()\n");
      out.write("            {\n");
      out.write("                var a,b,c;\n");
      out.write("                a=parseFloat(document.getElementById(\"txtno1\").value);\n");
      out.write("                b=parseFloat(document.getElementById(\"txtno2\").value);\n");
      out.write("                c=a/b;\n");
      out.write("                document.getElementById(\"txtresult\").value=c;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>No1</td>\n");
      out.write("                    <td><input type=\"number\" id=\"txtno1\" name=\"txtno1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>No2</td>\n");
      out.write("                    <td><input type=\"number\" id=\"txtno2\" name=\"txtno2\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select operation</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"button\" id=\"btnadd\" name=\"btnadd\" value=\"+\" onclick=\"total()\">\n");
      out.write("                        <input type=\"button\" id=\"btnminus\" name=\"btnminus\" value=\"-\" onclick=\"minus()\">\n");
      out.write("                        <input type=\"button\" id=\"btnmul\" name=\"btnmul\" value=\"*\" onclick=\"mul()\">\n");
      out.write("                        <input type=\"button\" id=\"btndiv\" name=\"btndiv\" value=\"/\" onclick=\"div()\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Result</td>\n");
      out.write("                    <td><input type=\"number\" id=\"txtresult\" name=\"txtresult\" value=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
