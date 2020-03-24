package org.apache.jsp.OrchidCollege;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SetAQues14_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SetProperty</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"SetAQues14.jsp\" method=\"get\"> \n");
      out.write("             <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name : </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"name\"/> </td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Price : </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"price\"/> </td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>QTY : </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"qty\"/> </td>\n");
      out.write("                </tr>\n");
      out.write("                  \n");
      out.write("                 <tr>\n");
      out.write("                    <td> </td>\n");
      out.write("                    <td> <input type=\"submit\" > </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("       \n");
      out.write("        </from>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (request.getParameter("name") != null) {
        String uname = request.getParameter("name");
        String price = request.getParameter("price");
        String qty = request.getParameter("qty");


      out.write('\n');
      out.write('\n');
      bean.OrchidSetAQues14 bean = null;
      synchronized (session) {
        bean = (bean.OrchidSetAQues14) _jspx_page_context.getAttribute("bean", PageContext.SESSION_SCOPE);
        if (bean == null){
          bean = new bean.OrchidSetAQues14();
          _jspx_page_context.setAttribute("bean", bean, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bean"), "name",
uname);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bean"), "price",
price);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bean"), "qty",
qty);
      out.write('\n');
      out.write('\n');

        response.sendRedirect("ProcesssSetAQues14.jsp");
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
