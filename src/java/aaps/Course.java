/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package aaps;

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
public class Course extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html> "
                    + "<html lang='en'> "
                    + "<head> "
                    + "    <meta charset='UTF-8'> "
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'> "
                    + "    <title>Document</title> "
                    + " <link href=https://fonts.googleapis.com/css2?family=Baloo+Bhaina+2:wght@800&display=swap rel=stylesheet>"
                    + "        <!-- CSS only -->"
                    + "        <link href=https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css rel=stylesheet integrity=sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi crossorigin=anonymous>"
                    + "        <!-- JavaScript Bundle with Popper -->"
                    + "        <script src=https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js integrity=sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3 crossorigin=anonymous></script>  "
                    + "        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css' integrity='sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==' crossorigin='anonymous' referrerpolicy='no-referrer'/>"
                    + "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />"
                    + "    <style> "
                    + "         body { "
                    + "            margin: 0px; "
                    + "            padding: 0px; "
                    + "            background: url(Images/Student7.jpg); "
                    + "            background-repeat: no-repeat; "
                    + "            background-size: 1550px 8000px; "
                    + "            color: white; "
                    + "            background-color: rgba(0, 0, 0, 0.329); "
                    + " "
                    + " "
                    + "        } "
                    + "    .navbar {"
                    + "            background-color:  rgb(65, 63, 63);"
                    + "            color: white;"
                    + "            border-radius: 10px;"
                    + "            position:fixed;"
                    + "            top:0;"
                    + "width:100%"
                    + "        }"
                    + ""
                    + "            .navbar li {"
                    + "                display: inline-block;"
                    + ""
                    + "            }"
                    + ""
                    + "          .nav-text {"
                    + "            font-size: 57px;"
                    + "            font-family: cursive;"
                    + "            font-weight: 100;"
                    + ""
                    + "        }"
                    + ""
                    + "        .navbar a {"
                    + "            text-decoration: none;"
                    + "            font-size: 30px;"
                    + "            margin-left: 30px;"
                    + "            margin-right: 30px;"
                    + "            color:white;"
                    + ""
                    + "        }"
                    + "           .navbar a:hover {"
                    + "            background-color: lightslategray;"
                    + "            color: cyan;"
                    + "            font-size: 33px;"
                    + "            border-radius: 20px;"
                    + "        }"
                    + "    </style> "
                    + "</head> "
                    + "<body> "
                    + "<header style= background-color: rgb(0,0,0); background-color: rgba(0, 0, 0, 0.26)>"
                    + "        <div class=navbar>"
                    + "            <div class=nav-text>Online Exam</div>"
                    + "            <ul>"
                    + "                <li><a href=index.html><i class=fa-solid fa-house></i> Home </a></li>"
                    + "               <li> <a href=Course> <i class=fa-solid fa-graduation-cap></i>Course </a></li>"
                    + "              <li>  <a href=Registration><i class=fa-solid fa-right-to-bracket></i>Registration</a></li>"
                    + "              <li>  <a href=Contact><i class=fa-solid fa-message-middle></i>Contact Us</a></li>"
                    + "            </ul>"
                    + "        </div>"
                    + "    <div> "
                    + "        <img src='Images/Placement - Copy (2).png' style='width: 1550px; height: 720px;'> "
                    + "    </div> "
                    + "    </header> "
                    + "<div> "
                    + "    <img src='Images/Placement - Copy.png' alt='' > "
                    + "</div> "
                    + " "
                    + "</body> "
                    + "</html>");

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
