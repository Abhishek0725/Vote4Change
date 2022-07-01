package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import eVoting.dto.UserDetails;
import java.util.ArrayList;
import org.json.JSONObject;

public final class showRemoveUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");

//      String userid=(String)session.getAttribute("userid");
//      if(userid==null){
//         session.invalidate();
//         response.sendRedirect("accessdenied.html");
//         return;
//      }

      String result=(String)request.getAttribute("data");
      StringBuffer displayBlock=new StringBuffer("");
      
      if(result.equalsIgnoreCase("id")){
        ArrayList<String> userId=(ArrayList<String>)request.getAttribute("userId");  
    	displayBlock.append("<option value=''>Choose Id</option>");
      	for(String id:userId){
      		displayBlock.append("<option value='"+id+"'>"+id+"</option>");
      	}
      	JSONObject json = new JSONObject();
      	json.put("uid", displayBlock.toString());
      	out.println(json);
      	System.out.println(displayBlock);
      }else if(result.equalsIgnoreCase("user")){
    	  UserDetails user=(UserDetails)request.getAttribute("user");
    	  displayBlock.append("<table><tr><th>Username:</th><td>"+user.getUsername()+"</td></tr>");
    	  displayBlock.append("<tr><th>Email:</th><td>"+user.getEmail()+"</td></tr>");
    	  displayBlock.append("<tr><th>Mobile No:</th><td>"+user.getMobile()+"</td></tr>");
    	  displayBlock.append("<tr><th>Address:</th><td>"+user.getAddress()+"</td></tr>");
    	  displayBlock.append("<tr><th>City:</th><td>"+user.getCity()+"</td></tr></table>");
    	  JSONObject json = new JSONObject();
    	  json.put("userDetails", displayBlock.toString());
    	  out.println(json);
    	  System.out.println(displayBlock);
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
