
package aaps;

import db.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StuRegConf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StuRegConf</title>");
            out.println("</head>");
            out.println("<body>");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("insert into stu_info values (?,?,?,?,?,?,?,?,?,?)");
            db.pstmt.setString(1, request.getParameter("email"));
            db.pstmt.setString(2, request.getParameter("sname"));
            db.pstmt.setString(3, request.getParameter("qua"));
            db.pstmt.setString(4, request.getParameter("dob"));
            db.pstmt.setString(5, request.getParameter("gender"));
            db.pstmt.setString(6, request.getParameter("addr"));
            db.pstmt.setString(7, request.getParameter("city"));
            db.pstmt.setString(8, request.getParameter("state"));
            db.pstmt.setString(9, request.getParameter("pin"));
            db.pstmt.setString(10, request.getParameter("cont"));
            int i = db.pstmt.executeUpdate();
            db.pstmt = db.con.prepareStatement("insert into login values (?,?,?)");
            db.pstmt.setString(1, request.getParameter("email"));
            db.pstmt.setString(2, request.getParameter("pswd"));
            db.pstmt.setString(3, "Student");
            int i1 = db.pstmt.executeUpdate();
            if (i > 0 && i1 > 0) {
                response.sendRedirect("index.html?msg=You Are Registered Successfully");
            } else {
             response.sendRedirect("Registration?msg=Error, Please Enter Correct Details");  
            }

            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
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
