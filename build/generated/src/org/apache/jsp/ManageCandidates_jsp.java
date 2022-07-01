package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageCandidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"jsscript/AdminOptions.js\"></script>\n");
      out.write("        <script src=\"jsscript/jquery.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link href=\"stylesheet/backgroundimage.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/pageheader.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/admin.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Admin Actions</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

//            String userid=(String)session.getAttribute("userid");
//            String usertype=(String)session.getAttribute("usertype");
//            if(userid==null || usertype==null || usertype.equalsIgnoreCase("voter"))
//            {
//                session.invalidate();
//                response.sendRedirect("accessdenied.html");
//                return;
//            }
            StringBuffer sbf=new StringBuffer("<div class='sticky'><div class='candidate'>Vote For Change</div><br/><div class='subcandidate'>Admin Actions Page</div><br/><br/><div class='logout'><a href='login.html'>Logout</a></div></div><div class='container'><div id='dv1' onclick='addCandidatesform()'><img src='images/addcandidate.png' height='300px' width='300px' /><br><h3>Add Candidate</h3></div><div id='dv2' onclick='updateCandidatesform()'><img src='images/update1.jpg' height='300px' width='300px'><br><h3>Update Candidates</h3></div><div id='dv3' onclick='showCandidatesform()'><img src='images/candidate.jpg' height='300px' width='300px'><br><h3>Show Candidates</h3></div><div id='dv4' onclick='deleteCandidatesform()'><img src='images/update3.jpg' height='300px' width='300px'><br><h3>Delete Candidates</h3></div></div><br/><br/><div align='center' id='result'></div>");
            out.println(sbf);
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
