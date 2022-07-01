package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import eVoting.dto.UserDetails;
import java.util.ArrayList;

public final class showUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

//	String userid=(String)session.getAttribute("userid");
//	if(userid==null)
//        {
//		session.invalidate();
//		response.sendRedirect("accessdenied.html");
//		return;
//	}
	ArrayList<UserDetails> userList=(ArrayList<UserDetails>)request.getAttribute("users");
	StringBuffer displayBlock = new StringBuffer("<table class='showUser'>");
	displayBlock.append("<tr><th>User Id</th><th>Username</th><th>Address</th><th>City</th><th>Email</th><th>Mobile No</th></tr>");
	for(UserDetails user:userList)
        {
		displayBlock.append("<tr><td>"+user.getUserid()+"</td><td>"+user.getUsername()+"</td><td>"+user.getAddress()+"</td><td>"+user.getCity()+"</td><td>"+user.getEmail()+"</td><td>"+user.getMobile()+"</td><tr>");
	}
	displayBlock.append("</table>");
	out.println(displayBlock.toString());
	System.out.println(displayBlock);

      out.write('\n');
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
