/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinejavashopfabfab;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Isaac
 */
public class Controller extends HttpServlet {

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
        // Get session object
        HttpSession session = request.getSession(true);

        // Get the visitor
        Visitor visitor = (Visitor) session.getAttribute("visitor");

        String title = "Welcome Back to FabFab";

        String action = "";

        // if the session is new, the cart won't exist.
        if (visitor == null) {
            visitor = new Visitor();
            if (request.getParameter("ViewAll") != null) {

                action = "ViewAll";

            }

            if (request.getParameter("Add") != null) {

                action = "Add";

            }

            if (request.getParameter("cartContent") != null) {

                action = "cartContent";

            }

            if (request.getParameter("ViewArticle") != null) {

                action = "ViewArticle";

            }

            if (request.getParameter("watchList") != null) {

                action = "watchList";

            }

            if (request.getParameter("remove") != null) {

                action = "remove";

            }

            if (request.getParameter("removeAll") != null) {

                action = "removeAll";

            }

        } else {

            if (request.getParameter("ViewAll") != null) {

                action = "ViewAll";

            }

            if (request.getParameter("Add") != null) {

                action = "Add";

            }

            if (request.getParameter("cartContent") != null) {

                action = "cartContent";

            }

            if (request.getParameter("ViewArticle") != null) {

                action = "ViewArticle";

            }

            if (request.getParameter("watchList") != null) {

                action = "watchList";

            }

            if (request.getParameter("remove") != null) {

                action = "remove";

            }

            if (request.getParameter("removeAll") != null) {

                action = "removeAll";

            }

        }

        if (action.equals("ViewAll")) {

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>ViewAll</title>");
                out.println("</head>");
                out.println("<body>");

                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("<th>FabricName</th>");

                for (Articles art : Articles.values()) {

                    out.println("<td>" + art.getValue() + "</td>");

                }
                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");

                out.println("</body>");
                out.println("</html>");
            }

        }

        if (action.equals("Add")) {

            visitor.listItemsBasket.add(request.getParameter("Add"));

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");

                out.println("</head>");
                out.println("<body>");
                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("<th>FabricName added</th>");

                out.println("<td>" + request.getParameter("Add") + "</td>");
                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");
                out.println("</body>");
                out.println("</html>");
            }

        }
        if (action.equals("cartContent")) {
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet CartContent</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("<th>Cart content</th>");
                for (int i = 0; i < visitor.getListItemsBasket().size(); i++) {
                    if (visitor.getListItemsBasket().get(i) != null) {
                        out.println("<td>" + visitor.getListItemsBasket().get(i) + "</td>" + "<br/>");
                    }
                    //out.println(visitor.getListItemsBasket().get(i));
                }
                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        if (action.equals("ViewArticle")) {
            visitor.addWatch(request.getParameter("ViewArticle"));
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>ViewArticle</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("<th>View Article</th>");

                for (Articles art : Articles.values()) {
                    if (art.getValue().equals(request.getParameter("ViewArticle"))) {

                        out.println("<td>" + art.getValue() + "</td>" + "<br/>");
                        out.println("<td>" + art.getColour() + "</td>" + "<br/>");
                        out.println("<td>" + art.getKey() + "</td>" + "<br/>");
                        out.println("<td>" + art.getCountry() + "</td>" + "<br/>");

                    }

                }

                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        if (action.equals("watchList")) {
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title> watchList</title>");
                out.println("</head>");
                out.println("<body>");

                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("<th>WatchListItems</th>");

                for (int i = 0; i < visitor.getWatchListItem().size(); i++) {

                    if (visitor.getWatchListItem().get(i) != null) {
                        out.println("<td>" + visitor.getWatchListItem().get(i) + "</td>" + "<br/>");
                    }

                }
                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        if (action.equals("remove")) {
            visitor.listItemsBasket.remove(request.getParameter("remove"));

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Remove</title>");
                out.println("</head>");
                out.println("<body>");

                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("<th>Fabric removed</th>");

                out.println("<td>" + request.getParameter("remove") + "</td>" + "</h1>");

                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        if (action.equals("removeAll")) {
            visitor.listItemsBasket.clear();

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Remove</title>");
                out.println("</head>");
                out.println("<body>");

                out.println("<table border=\"1\" style=\"width:100%\">");
                out.println("<tr>");

                out.println("The shopping basket has been cleared");

                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");
                out.println("<br>");
                out.println("<center><a href=\"index.jsp\">Back</a></center>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        session.setAttribute("visitor", visitor);
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
