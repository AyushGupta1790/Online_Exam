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

public class QuesUpdate extends HttpServlet {

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
                    + "    <title>Update Question</title>"
                    + "    <link href='https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@800&family=Baloo+Bhaina+2:wght@800&display=swap' rel='stylesheet'>"
                    + "    <style>"
                    + "        /* CSS RESET  */"
                    + "        body{"
                    + "            font-family: 'Baloo Bhai 2', cursive;"
                    + "            margin: 0px;"
                    + "            padding: 0px;"
                    + "            background: url(Images/Student7.jpg);"
                    + "            background-repeat:no-repeat ;"
                    + "           background-size: 1550px 800px;  "
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
            String qid = request.getParameter("qid");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from ques_mstr where qid=?");
            db.pstmt.setString(1, qid);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                out.println("<center><h1>Update Question</h1>"
                        + "<form action=''>"
                        + "<table width=400 height=400 border=1 bgcolor='lightblue'>"
                        + "<tr><td width=200>Question Id</td><td><input type=text value='" + db.rst.getString(1) + "' name=qid></td></tr>"
                        + "<tr><td width=200>Question</td><td><input type=text value='" + db.rst.getString(2) + "' name=ques></td></tr>"
                        + "<tr><td width=200>Option1 </td><td><input type=text value='" + db.rst.getString(3) + "' name=op1></td></tr>"
                        + "<tr><td width=200>Option2 </td><td><input type=text value='" + db.rst.getString(4) + "'name=op2></td></tr>"
                        + "<tr><td width=200>Option3 </td><td><input type=text value='" + db.rst.getString(5) + "' name=op3></td></tr>"
                        + "<tr><td width=200>Option4 </td><td><input type=text value='" + db.rst.getString(6) + "' name=op4></td></tr>"
                        + "<tr><td width=200>Answer </td><td><input type=text value='" + db.rst.getString(7) + "' name=ans></td></tr>"
                        + "<tr><td width=200><input type=submit value=submit name=opr></td><td><input type=submit value=reset></td></tr>"
                        + "</table></form></center>");
            }
            if (request.getParameter("opr") != null) {
                String id = request.getParameter("qid");
                String ques = request.getParameter("ques");
                String op1 = request.getParameter("op1");
                String op2 = request.getParameter("op2");
                String op3 = request.getParameter("op3");
                String op4 = request.getParameter("op4");
                String ans = request.getParameter("ans");
                db.pstmt = db.con.prepareStatement("update ques_mstr set ques=?,opt1=?,opt2=?,opt3=?,opt4=?,ans=? where qid=?");
                db.pstmt.setString(1, ques);
                db.pstmt.setString(2, op1);
                db.pstmt.setString(3, op2);
                db.pstmt.setString(4, op3);
                db.pstmt.setString(5, op4);
                db.pstmt.setString(6, ans);
                db.pstmt.setString(7, id);
                int i = db.pstmt.executeUpdate();
                if (i > 0) {
                    response.sendRedirect("QuestionList");
                }

            }
            out.println("</body></html>");
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
