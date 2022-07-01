<%-- 
    Document   : registrationresponse
    Created on : 13 Apr, 2022, 2:08:36 AM
    Author     : AVINASH KUMAR
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    boolean result=(boolean)request.getAttribute("result");
    boolean userfound=(boolean)request.getAttribute("userfound");
    if(userfound==true)
        out.println("uap");
    else if(result==true)
        out.println("success");
    else
        out.println("error");
%>
