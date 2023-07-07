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
public class Registration extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html> "
                    + "<html lang='en'> "
                    + "<head> "
                    + "    <meta charset='UTF-8'> "
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                    + " <link href=https://fonts.googleapis.com/css2?family=Baloo+Bhaina+2:wght@800&display=swap rel=stylesheet>"
                    + "        <!-- CSS only -->"
                    + "        <link href=https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css rel=stylesheet integrity=sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi crossorigin=anonymous>"
                    + "        <!-- JavaScript Bundle with Popper -->"
                    + "        <script src=https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js integrity=sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3 crossorigin=anonymous></script>  "
                    + "        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css' integrity='sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==' crossorigin='anonymous' referrerpolicy='no-referrer'/>"
                    + "    <title>Document</title> "
                    + "    <style> "
                    + "         body { "
                    + "            margin: 0px; "
                    + "            padding: 0px; "
                    + "            background: url(Images/regbgjpg.jpg); "
                    + "            background-repeat: no-repeat; "
                    + "            background-size: 1550px 1016px; "
                    + "            color: white; "
                    + "            /* font-family: 'Baloo Bhaina 2', cursive; */ "
                    + "            background-color: rgba(0, 0, 0, 0.329); "
                    + "}"
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
                    + ""
                    + "        }"
                    + "           .navbar a:hover {"
                    + "            background-color: lightslategray;"
                    + "            color: cyan;"
                    + "            font-size: 33px;"
                    + "            border-radius: 20px;"
                    + "        }"
                    + "        .container{ "
                    + "            width: 730px; "
                    + "            min-height: 740px; "
                    + "            /* border: 2px solid orange ; */ "
                    + "            margin-left: 0px; "
                    + "padding:10px;"
                    + "            background-color:rgb(140, 89, 213);"
                    + "            Font-size:25px;"
                    + "color:white;"
                 
                    + "        }"
                    + ".row{"
                    + " margin-top:10px;"
                    + "} "
                    + "    </style> "
                    + "</head> "
                    + "<body>"
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
                    + "    </header> "
                    + "<div class='container form-row align-items-center  ' style='padding:40px;padding-top:100px;box-sizing:border-box;'> "
                    + " <div class='row text-center' >"
                    + "<div class='col' style='font-size:40px;'><u><b>Registration Form</b></u></div>"
                    + "</div> "
                    + "<form action='StuRegConf'>"
                    + "<div class='row'>"
                    + "<div class='col'>Email Id:</div>"
                    + "<div class='col'>Student Name:</div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><input type='email'  name='email' id='customControlValidation1' required></div>"
                    + "<div class='col'><input type='text' name='sname' required></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'>Qualification:</div>"
                    + "<div class='col'>Date of Birth:</div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><select name='qua'>"
                    + "<option value='BCA'>BCA</option> "
                    + "<option value='B.Tech'>B.Tech</option> "
                    + "<option value='B.COM'>B.Com</option> "
                    + " <option value='BBA'>BBA</option> "
                    + "<option value='BSC'>BSC</option> "
                    + "<option value='Diploma'>Diploma</option> "
                    + " <option value='MBA'>MBA</option> "
                    + " <option value='B.Voc'>B.Voc</option></select></td>  </div>"
                    + "<div class='col'><input type='date' name=dob></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'>Address:</div>"
                    + "<div class='col'>Gender:</div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><input type='text' name='addr'></div>"
                    + "<div class='col'><input type='radio' name='gender' value='male'>"
                    + "<label for='male'>Male</label> "
                    + "<input type='radio' name='gender' value='female'> "
                    + " <label for='female'>Female</label></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'>City:</div>"
                    + "<div class='col'>State:</div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><input type='text' name='city'></div>"
                    + "<div class='col'><select name='state' class='form-control form-control-lg' >"
                    + "        <option value='Andhra Pradesh'>Andhra Pradesh</option> "
                    + "        <option value='Andaman and Nicobar Islands'>Andaman and Nicobar Islands</option> "
                    + "        <option value='Arunachal Pradesh'>Arunachal Pradesh</option> "
                    + "        <option value='Assam'>Assam</option> "
                    + "        <option value='Bihar'>Bihar</option> "
                    + "        <option value='Chandigarh'>Chandigarh</option> "
                    + "        <option value='Chhattisgarh'>Chhattisgarh</option> "
                    + "        <option value='Dadar and Nagar Haveli'>Dadar and Nagar Haveli</option> "
                    + "        <option value='Daman and Diu'>Daman and Diu</option> "
                    + "        <option value='Delhi'>Delhi</option> "
                    + "        <option value='Lakshadweep'>Lakshadweep</option> "
                    + "        <option value='Puducherry'>Puducherry</option> "
                    + "        <option value='Goa'>Goa</option> "
                    + "        <option value='Gujarat'>Gujarat</option> "
                    + "        <option value='Haryana'>Haryana</option> "
                    + "        <option value='Himachal Pradesh'>Himachal Pradesh</option> "
                    + "        <option value='Jammu and Kashmir'>Jammu and Kashmir</option> "
                    + "        <option value='Jharkhand'>Jharkhand</option> "
                    + "        <option value='Karnataka'>Karnataka</option> "
                    + "        <option value='Kerala'>Kerala</option> "
                    + "        <option value='Madhya Pradesh'>Madhya Pradesh</option> "
                    + "        <option value='Maharashtra'>Maharashtra</option> "
                    + "        <option value='Manipur'>Manipur</option> "
                    + "        <option value='Meghalaya'>Meghalaya</option> "
                    + "        <option value='Mizoram'>Mizoram</option> "
                    + "        <option value='Nagaland'>Nagaland</option> "
                    + "        <option value='Odisha'>Odisha</option> "
                    + "        <option value='Punjab'>Punjab</option> "
                    + "        <option value='Rajasthan'>Rajasthan</option> "
                    + "        <option value='Sikkim'>Sikkim</option> "
                    + "        <option value='Tamil Nadu'>Tamil Nadu</option> "
                    + "        <option value='Telangana'>Telangana</option> "
                    + "        <option value='Tripura'>Tripura</option> "
                    + "        <option value='Uttar Pradesh'>Uttar Pradesh</option> "
                    + "        <option value='Uttarakhand'>Uttarakhand</option> "
                    + "        <option value='West Bengal'>West Bengal</option> "
                    + "        </select>"
                    + " </div>"
                    + " </div>"
                    + "<div class='row'>"
                    + "<div class='col'>Pin:</div>"
                    + "<div class='col'>Contact:</div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><input type='number' name=pin></div>"
                    + "<div class='col'><input type='number' name=cont></div>"
                    + "</div>"
                    + " "
                    + "<div class='row'>"
                    + "<div class='col'>Password:</div>"
                    + "<div class='col'>Confirm Password:</div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><input type='password' name=pswd></div>"
                    + "<div class='col'><input type='password' name=cpswd></div>"
                    + "</div>"
                    + "<div class='row'>"
                    + "<div class='col'><input type=submit class='btn btn-primary btn-lg' value='SUBMIT'></div>"
                    + "<div class='col'><input type=reset class='btn btn-primary btn-lg' value='Reset'></div>"
                    + "</div>"
                    + "</form> "
                    + "</div> "
                    + "<div> "
                    + "    <img style='width:100%;' src='Images/Placement - Copy.png' alt=''> "
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
