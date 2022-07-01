<%-- 
    Document   : failure
    Created on : 13 Apr, 2022, 2:07:12 AM
    Author     : AVINASH KUMAR
--%>

<%
    String userid=(String)session.getAttribute("userid");
    if(userid==null)
    {
        session.invalidate();
        response.sendRedirect("accessdenied.html");
        return;
    }
    out.println("failed");
%>