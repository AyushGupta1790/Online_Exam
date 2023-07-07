/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Admin;

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
public class AdminLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>"
                    + "<html lang='en'>"
                    + "<head>"
                    + "    <meta charset='UTF-8'>"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                    + "    <title>Document</title>"
                    + " <link href=https://fonts.googleapis.com/css2?family=Baloo+Bhaina+2:wght@800&display=swap rel=stylesheet>"
                    + "        <!-- CSS only -->"
                    + "        <link href=https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css rel=stylesheet integrity=sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi crossorigin=anonymous>"
                    + "        <!-- JavaScript Bundle with Popper -->"
                    + "        <script src=https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js integrity=sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3 crossorigin=anonymous></script>  "
                    + "        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css' integrity='sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==' crossorigin='anonymous' referrerpolicy='no-referrer'/>"
                    + "    <style>"
                    + "        .box{"
                    + "            background-color:black;"
                    + "            width: 400px;"
                    + "            height: 450px;"
                    + "            border-radius: 5px;"
                    + "            margin-top: 100px;"
                    + "            box-shadow: 12px 12px red ;"
                    + "color:white;"
                    + "         }"
                    + ".row{"
                    + "margin-top:20px}"
                    + "    </style>"
                    + "</head> "
                    + "<body bgcolor='	#383838'>"
                    + "    "
                    + "<div class='container'>"
                    + "   <center><div class='box'><h1 id='login'> Admin Login </h1><hr>"
                    + "<form action='AdminLoginConf' class='form-group'>"
                    + "<div class='row'>"
                    + "<div class ='col'><select name='user'><option value='Admin'>Admin</select></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class ='col'><input type='text' name='email' placeholder='Email'></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class ='col'><input type='password' name='pswd' placeholder='Password'></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class ='col'><input type=submit class='btn btn-primary btn' value='login' name='login'></div>"
                    + "</div>"
                    + "<div class='row text-center'>"
                    + "<div class ='col'>"
                    + "    <label style='color: white;  font-size: 17px;'>"
                    + "        <input type='checkbox' checked='checked' name='remember'> Remember me  </label> "
                    + "</div>"
                  
                    + "</form>"
                    + "</div>"
                    + "</div></center> </body>"
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
