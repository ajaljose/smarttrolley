package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            int a=0,b=0,c=0;
            String x = request.getParameter("opr");
            if(request.getParameter("ok")!=null)
            {
            if (request.getParameter("x")=="+")
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a+b;
            }
            else if (request.getParameter("x")=="-")
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a-b;
            }
            else if(request.getParameter("x")=="*")
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a*b;
            }
            else if(request.getParameter("x")=="/")
            {
                a=Integer.parseInt(request.getParameter("txtno1"));
                b=Integer.parseInt(request.getParameter("txtno2"));
                c=a/b;
            }
            }
        
      out.write("\n");
      out.write("        <form method=\"post\" name=\"frmcalc\">\n");
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
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"opr\">\n");
      out.write("                            <option value=\"0\">--------select--------</option>\n");
      out.write("                            <option value=\"1\">+</option>\n");
      out.write("                            <option value=\"2\">-</option>\n");
      out.write("                            <option value=\"3\">*</option>\n");
      out.write("                            <option value=\"4\">/</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"submit\" id=\"ok\" name=\"ok\" value=\"ok\"></td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Result</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"number\" id=\"txtresult\" name=\"txtresult\" value=\"");
      out.print(c );
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
