package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import eVoting.dto.CandidateInfo;

public final class votedenied_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"jsscript/adminoptions.js\"></script>\n");
      out.write("        <script src=\"jsscript/jquery.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link href=\"stylesheet/backgroundimage.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/pageheader.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/admin.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/result.css\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <title>Vote Denied Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

//            String userid=(String)session.getAttribute("userid");
//            if(userid==null){
//                session.invalidate();
//                response.sendRedirect("accessdenied.html");
//                return;
//            }  
            CandidateInfo cd = (CandidateInfo)request.getAttribute("candidate");
        	StringBuffer displayBlock = new StringBuffer("");
        		
        	displayBlock.append("<div class='sticky'>");
        	displayBlock.append("<div class='candidate'>VOTE FOR CHANGE</div><br>");
        	displayBlock.append("<div class='subcandidate'>Your Vote Already Taken</div><br><br>");
        	displayBlock.append("<div class='logout'><a href='LoginControllerServlet?logout=logout'>logout</a></div></div>");
			displayBlock.append("<br><br><br><br><br><br><div align='center'><table>");
			displayBlock.append("<tr><th>Candidate Id:</th><td>"+cd.getCandidateId()+"</td></tr>");
			displayBlock.append("<tr><th>Candidate Name:</th><td>"+cd.getCandidateName()+"</td></tr>");
			displayBlock.append("<tr><th>Party:</th><td>"+cd.getParty()+"</td></tr>");
			displayBlock.append("<tr><th>Symbol:</th><td><img src='data:image/jpg;base64,"+cd.getSymbol()+"' style='width:300px;height:200px;'");
			displayBlock.append("</table></div>");
			out.println(displayBlock);
        
      out.write("  \n");
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
