package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import eVoting.dto.CandidateDetails;
import org.json.JSONObject;

public final class newjspadminShowUpdateCandidate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

//    String userid=(String)session.getAttribute("userid");
//    if(userid==null)
//    {
//    	session.invalidate();
//        response.sendRedirect("accessdenied.html");
//        return;
//    }
    String result=(String)request.getAttribute("result");
    StringBuffer displayBlock=new StringBuffer();
    if(result!=null && result.equalsIgnoreCase("candidateList"))
    {
    	ArrayList<String> candidateList=(ArrayList)request.getAttribute("candidateId");
    	displayBlock.append("<option value=''>Choose Id</option>");
    	for(String c:candidateList){
    		displayBlock.append("<option value='"+c+"'>"+c+"</option>");
    	}
    	JSONObject json = new JSONObject();
    	json.put("cid", displayBlock.toString());
    	out.println(json);
    	System.out.println(displayBlock);
    }
    else if(result!=null && result.equalsIgnoreCase("details")) 
    {
    	CandidateDetails cd =(CandidateDetails)request.getAttribute("candidate");
    	ArrayList<String> cityList=(ArrayList<String>)request.getAttribute("cities");
    	String str="<img src='data:image/png;base64,"+cd.getSymbol()+"' style='width:200px;height:130px;' />";
    	displayBlock.append("<form method='post' enctype='multipart/form-data' id='fileUploadForm'>");
    	displayBlock.append("<table><tr><th>User Id:</th><td><input type='text' id='uid' disabled value='"+cd.getUserId()+"' /></td></tr>"
    			+"<tr><th>Candidate Name:</th><td><input type='text' id='cname' disabled value='"+cd.getCandidateName()+"' /></td></tr>"
    			+"<tr><th>City</th><td><select id='city'>");
    	for(String c:cityList){
               displayBlock.append("<option value='"+c+"'>"+c+"</option>");
        }
    	displayBlock.append("</select></td></tr>"
    			+"<tr><th>Party:</th><td><input type='text' id='party' value='"+cd.getParty()+"' /></td></tr>"
    			+"<tr><td colspan='2'><input type='file' name='files' value='Select Image'></td></tr>"
    			+"<tr><th><input type='button' value='Update Candidate' onclick='updateCandidate()' id='updatecnd'></th>"
    			+"<th><input type='reset' value='Clear' onclick='clearText()'</th></tr></table></form>"
    			+"<tr><th>Symbol:</th><td id='image'>"+str+"</td></tr>");
    	JSONObject json=new JSONObject();
    	json.put("subdetails", displayBlock.toString());
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
