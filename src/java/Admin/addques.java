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
public class addques extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>"
                + "<html lang='en'>"
                + "<head>"
                + "    <meta charset='UTF-8'>"
                + "    <meta http-equiv='X-UA-Compatible' content='IE=edge'>"
                + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                + "    <!-- CSS only -->"
                + "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi' crossorigin='anonymous'>"
                + "<!-- JavaScript Bundle with Popper -->"
                + "<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js' integrity='sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3' crossorigin='anonymous'></script>"
                + ""
                + "    <title>Document</title>"
                + "    <style>"
                + "     "
                + "    .row{"
                + "        margin-top: 10px;"
                + "        padding: auto;"
                + "    }"
                + "    .col{"
                + "        margin-bottom:2px;"
                + "        font-size: 20px;"
                + "    }"
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
        out.println("    <div class='container ' style='padding:0px 400px;'>"
                + "        <div class='row text-center a ' style='background-color: pink;' >"
                + "            <div class='col' style='font-size: 30px; color:blue'>Add Question</div>"
                + "        </div>"
                + "        <form class='form-control' action='#'>"
                + "        <div class='row'>"
                + "            <div class='col'>Question ID</div>"
                + "           <input type='text' placeholder='ENTER QUESTION ID' required name='qid'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col'>Question</div>"
                + "            <input type='text' placeholder='ENTER QUESTION ' required name='que'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col'>Option 1</div>"
                + "            <input type='text' placeholder='Option 1' required name='op1'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col'>Option 2</div>"
                + "            <input type='text' placeholder='Option 2' required name='op2'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col'>Option 3</div>"
                + "            <input type='text' placeholder='Option 3' required name='op3'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col'>Option 4</div>"
                + "            <input type='text' placeholder='Option 4' required name='op4'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col'>Answer</div>"
                + "            <input type='text' placeholder='Enter Correct Option' required name='ans'>"
                + "        </div>"
                + "        <div class='row'>"
                + "            <div class='col' style='text-align: right;'>"
                + "            <input type='submit' class='btn btn-primary ' value='Add' name='add'>"
                + "            </div>"
                + "            <div class='col ' >"
                + "                <input type='submit' class='btn btn-danger ' value='Reset' name='reset'>"
                + "        </div>"
                + "        </div>"
                + "    </form>"
                + "    </div>"
                + "</body>"
                + "</html>");

        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("insert into ques_mstr values(?,?,?,?,?,?,?)");
            db.pstmt.setString(1, request.getParameter("qid"));
            db.pstmt.setString(2, request.getParameter("que"));
            db.pstmt.setString(3, request.getParameter("op1"));
            db.pstmt.setString(4, request.getParameter("op2"));
            db.pstmt.setString(5, request.getParameter("op3"));
            db.pstmt.setString(6, request.getParameter("op4"));
            db.pstmt.setString(7, request.getParameter("ans"));

            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                response.sendRedirect("addques?msg=Question added Succesfully.");
            }
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
