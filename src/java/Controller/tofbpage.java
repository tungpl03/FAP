/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Feedback;

/**
 *
 * @author Admin
 */
public class tofbpage extends HttpServlet {

    Feedback f;

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tofbpage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tofbpage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String fbid = request.getParameter("fbid");
        f = new Feedback(fbid, null, null, null, null, null, null, null, null, null, null, null, null);
        f.getFeedbackById();
        request.setAttribute("f", f);
        request.getRequestDispatcher("Feedbackpage.jsp").forward(request, response);
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
//        String fid = request.getParameter("fid");
        String punctuality = request.getParameter("punctuality");
        String teaching_skills = request.getParameter("teaching_skills");
        String topic_coverage = request.getParameter("topic_coverage");
        String teacher_support = request.getParameter("teacher_support");
        String response_time = request.getParameter("response_time");
        String comment = request.getParameter("comment");
        int editnumber = f.getEditnumberbyId();
        int diem = Integer.parseInt(punctuality) + Integer.parseInt(teaching_skills) + Integer.parseInt(topic_coverage) + Integer.parseInt(teacher_support) + Integer.parseInt(response_time);
        String fbid = request.getParameter("fbid");
        if (punctuality == null || teaching_skills == null || topic_coverage == null || teacher_support == null || response_time == null) {
            String err = "Please choose one answer for the question";
            request.setAttribute("err", err);
            request.setAttribute("f", f);
            request.getRequestDispatcher("Feedbackpage.jsp").forward(request, response);
        } else {
            Feedback fb = new Feedback(fbid, punctuality, teaching_skills, topic_coverage, teacher_support, response_time, comment, diem, editnumber);
            fb.updateFeedback();
            editnumber++;
            fb.updateEditnumber();
            String success = "Feedback successful, Thank you!";
            request.setAttribute("suc", success);
            request.setAttribute("f", f);
            request.getRequestDispatcher("Feedbackpage.jsp").forward(request, response);
        }
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
