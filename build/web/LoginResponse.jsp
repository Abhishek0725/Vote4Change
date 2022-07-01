<%-- 
    Document   : LoginResponse
    Created on : 13 Apr, 2022, 1:59:55 AM
    Author     : AVINASH KUMAR
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String usertype=(String)request.getAttribute("result");
    String userid=(String)request.getAttribute("userid");
    if(userid!=null && usertype!=null)
    {
        HttpSession sess=request.getSession();
        sess.setAttribute("userid",userid);
        sess.setAttribute("usertype",usertype);
        if(usertype.equalsIgnoreCase("admin"))
        {
            String url="AdminControllerServlet;jsessionid="+session.getId();
            out.println(url);
        }
        else if(usertype.equalsIgnoreCase("voter"))
        {
            String url="VotingControllerServlet;jsessionid="+session.getId();
            out.println(url);
        }
        else
            out.println("error");
    }
%>
