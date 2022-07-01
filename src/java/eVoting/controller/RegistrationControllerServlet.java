package eVoting.controller;

import eVoting.dao.RegistrationDao;
import eVoting.dto.UserDetails;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationControllerServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        RequestDispatcher rd=null;
        UserDetails user = new UserDetails();
        user.setUserid(request.getParameter("userid"));
        user.setPassword(request.getParameter("password"));
        user.setAddress(request.getParameter("address"));
        user.setCity(request.getParameter("city"));
        user.setEmail(request.getParameter("email"));
        user.setMobile(request.getParameter("mobile"));
        user.setUsername(request.getParameter("username"));
        user.setGender(request.getParameter("gender"));
        try
        {
            boolean result=false,userfound=false;
            if(!RegistrationDao.searchUser(user.getUserid()))
            {
                RegistrationDao.registerUser(user);
                result=true;
            }
            else
            {
                userfound=true;
            }
            request.setAttribute("result", result);
            request.setAttribute("userfound", userfound);
            request.setAttribute("username", user.getUsername());
            rd=request.getRequestDispatcher("registrationresponse.jsp");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            rd=request.getRequestDispatcher("showexception.jsp");
        }
        finally
        {
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}