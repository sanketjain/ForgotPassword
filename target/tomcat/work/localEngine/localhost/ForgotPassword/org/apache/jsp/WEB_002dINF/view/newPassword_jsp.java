package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=US-ASCII");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n");
      out.write("<title>Home Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("Enter New Password for ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t<form action=\"#\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Password</td>\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"txtPass\"> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Retype-Password</td>\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"txtPass\"> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<td colspan=\"2\"><center><input type=\"button\" value=\"Save\"> </center> </td>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</table>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
