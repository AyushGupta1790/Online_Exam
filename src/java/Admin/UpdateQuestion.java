/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Admin;

import db.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class UpdateQuestion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>"
                    + "<html lang='en'>"
                    + "<head>"
                    + "    <meta charset='UTF-8'>"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                    + "    <title>Document</title>"
                    + "    <link href='https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@800&family=Baloo+Bhaina+2:wght@800&display=swap' rel='stylesheet'>"
                    + "    <style>"
                    + "        /* CSS RESET  */"
                    + "        body{"
                    + "            font-family: 'Baloo Bhai 2', cursive;"
                    + "            margin: 0px;"
                    + "            padding: 0px;"
                    + "            background: url(Images/Student7.jpg);"
                    + "            background-repeat:no-repeat ;"
                    + "background:cover;"
                    + "           background-size: 100% 100%;  "
                    + "           font-family: Baloo Bhai;  "
                    + "           "
                    + "        }"
                    + "        .navbar"
                    + "        {"
                    + "         display: inline-block;"
                    + "         border: 3px solid white;"
                    + "        margin-left: 0%;"
                    + "         margin-top: 25px;"
                    + "         border-radius: 5px;"
                    + "        }"
                    + "        .navbar li{"
                    + "            display: inline-block;"
                    + "        }"
                    + "        .navbar li a{"
                    + "            color: white;"
                    + "            font-size:23px;"
                    + "            padding: 15px;"
                    + "            text-decoration: none;"
                    + "        }"
                    + "        .navbar li a:hover{"
                    + "           "
                    + "           color: grey;"
                    + "           font-size:23px;"
                    + "           padding:15px;"
                    + "           text-decoration: none; "
                    + "       }"
                    + "     "
                    + ""
                    + "    "
                    + "    </style>"
                    + "</head>"
                    + "<body>"
                    + "    <header>"
                    + "        <div class='navbar'>"
                    + "        <ul>"
                    + "        <li><a href='StudentList'> Student List</a> </li>"
                    + "        <li><a href='addques'>Add Question</a></li>"
                    + "        <li><a href='QuestionList'>Question List</a></li>"
                    + "        <li> <a href='UpdateQuestion'>Update Question</a></li>"
                    + "        <li><a href='Result'>Result</a></li>"
                    + "        <li><a href='ViewFeedback'>View Feedback</a></li>"
                    + "        <li><a href='ChangePassword'>Change Password</a></li>"
                    + "        <li><a href='LogOut'>Log Out</a></li>"
                    + "        </ul>"
                    + "    </div><hr>"
                    + "    </header>");
            out.println("<center><h1>Update/Delete Question List</h1>"
                    + "<div style='width:1300px;min-height:500px;border:2px solid blue;background-color:lightyellow;'>"
                    + "<table width=1300px border=1 cellspacing=0 cellpadding=5>"
                    + "<tr bgcolor=grey>"
                    + "<th>Question id</th> "
                    + "<th>Question</th> "
                    + "<th>Option1</th> "
                    + "<th>Option2</th> "
                    + "<th>Option3</th> "
                    + "<th>Option4</th> "
                    + "<th>Result</th>"
                    + "<th>Action1</th>"
                    + "<th>Action2</th>"
                    + "</tr> ");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from ques_mstr");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                out.println("<tr><td>" + db.rst.getString(1) + "</td>"
                        + "<td>" + db.rst.getString(2) + "</td>"
                        + "<td>" + db.rst.getString(3) + "</td>"
                        + "<td>" + db.rst.getString(4) + "</td>"
                        + "<td>" + db.rst.getString(5) + "</td>"
                        + "<td>" + db.rst.getString(6) + "</td>"
                        + "<td>" + db.rst.getString(7) + "</td>"
                        + "<th style='background-color:lightgreen;'><a href='QuesUpdate?qid=" + db.rst.getString(1) + " '>Update</th> "
                        + "<th style='background-color:red;'><a href='QuesDelete?qid=" + db.rst.getString(1) + " '>Delete</th> "
                        + "</tr>");
            }

            out.println("</table></div></body></html>");
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
