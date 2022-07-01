package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import eVoting.dto.CandidateInfo;

public final class showcandidate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"jsscript/vote.js\"></script>\n");
      out.write("        <script src=\"jsscript/jquery.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link href=\"stylesheet/backgroundimage.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/pageheader.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"stylesheet/showcandidate.css\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <title>Show Candidate</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

//            String userid=(String)session.getAttribute("userid");
//            if(userid==null){
//                session.invalidate();
//                response.sendRedirect("accessdenied.html");
//                return;
//            }
        
      out.write("\n");
      out.write("        <div class='sticky'>\n");
      out.write("            <div class='candidate'>VOTE FOR CHANGE</div><br>\n");
      out.write("            <div class='subcandidate'>Whom do you want to vote ?</div><br><br>\n");
      out.write("            <div class='logout'><a href='LoginControllerServlet?logout=logout'>logout</a></div>\n");
      out.write("         </div>\n");
      out.write("\t\t\n");
      out.write("        ");

        	ArrayList<CandidateInfo> candidateList=(ArrayList<CandidateInfo>)request.getAttribute("candidateList");
        	StringBuffer displayBlock=new StringBuffer("");
        	displayBlock.append("<div class='buttons'>");
        	for(CandidateInfo c:candidateList){
        		System.out.println(c.getCandidateId());
        		displayBlock.append("<input type='radio' name='flat' id='"+c.getCandidateId()+"' value='"+c.getCandidateId()+"' onclick='addvote()'/>");
        		displayBlock.append("<label for='"+c.getCandidateId()+"'><img src='data:image/jpg;base64,"+c.getSymbol()+"' id='"+c.getCandidateId()+"' style='width:300px;height:200px; cursor:pointer;'/></label>");
        		displayBlock.append("<br><div class='candidateprofile'><p>Candidate Id:"+c.getCandidateId()+"<br>");
        		displayBlock.append("Candidate Name:"+c.getCandidateName()+"<br>");
        		displayBlock.append("Party:"+c.getParty()+"<br></p></div>");
        	}
        	displayBlock.append("</div>");
        	out.println(displayBlock);
        
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div align='center' id='result'></div>\n");
      out.write("    </body>\n");
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
