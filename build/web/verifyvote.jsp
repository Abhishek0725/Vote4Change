<%-- 
    Document   : verifyvote
    Created on : 13 Apr, 2022, 2:15:51 AM
    Author     : AVINASH KUMAR
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//	String userid=(String)session.getAttribute("userid");
//	if(userid==null){
//		session.invalidate();
//		response.sendRedirect("accessdenied.html");
//		return;
//	}
	boolean result=(boolean)request.getAttribute("result");
	if(result==true)
		out.println("success");
	else
		out.println("failed");
%>
