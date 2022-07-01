<%-- 
    Document   : showexception
    Created on : 13 Apr, 2022, 2:14:06 AM
    Author     : AVINASH KUMAR
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Exception ex=(Exception)request.getAttribute("exception");
    System.out.println("Exception is:"+ex);
    out.println("Some Exception occurred:"+ex.getMessage());
%>    