package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import eVoting.dto.CandidateDetails;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public final class electionresult2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
//	if(userid==null){
//		session.invalidate();
//		response.sendRedirect("accessdenied.html");
//		return;
//	}
	String data=(String)request.getAttribute("status");
	StringBuffer displayBlock = new StringBuffer("<table>");
	
	if(data.equalsIgnoreCase("party")){
		LinkedHashMap <String, Integer> result=(LinkedHashMap)request.getAttribute("result");
		int votecount = (int)request.getAttribute("votecount");
		Iterator it=result.entrySet().iterator();
		int pos=0;
		displayBlock.append("<tr><th>Position</th><th>Party</th><th>Vote Count</th><th>Vote %</th></tr>");
		while(it.hasNext()){
			pos++;
			Map.Entry<String, Integer> e=(Map.Entry)it.next();
			String party=e.getKey();
			float voteper=(e.getValue()*100.0f)/votecount;
			displayBlock.append("<tr><td>"+pos+"</td><td>"+party+"</td><td>"+e.getValue()+"</td><td>"+voteper+"</td></tr>");	
		}
		displayBlock.append("</table>");
	}else if(data.equalsIgnoreCase("gender")){
		LinkedHashMap <String, Integer> result=(LinkedHashMap)request.getAttribute("result");
		int votecount = (int)request.getAttribute("votecount");
		Iterator it=result.entrySet().iterator();
		int pos=0;
		displayBlock.append("<tr><th>Position</th><th>Gender</th><th>Vote Count</th><th>Vote %</th></tr>");
		while(it.hasNext()){
			pos++;
			Map.Entry<String, Integer> e=(Map.Entry)it.next();
			String gender=e.getKey();
			System.out.println(gender);
			float voteper=(e.getValue()*100.0f)/votecount;
			displayBlock.append("<tr><td>"+pos+"</td><td>"+gender+"</td><td>"+e.getValue()+"</td><td>"+voteper+"</td></tr>");	
		}
		displayBlock.append("</table>");
	}
	
	out.println(displayBlock);

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
