package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public loginController() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[LoginController] Page Load");

        Cookie cookie = new Cookie("name", "OST");
        cookie.setMaxAge(600);
        resp.addCookie(cookie);

        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        System.out.println("[LoginController] ID << " + id);
        System.out.println("[LoginController] Pw << " + pw);

        //resp.getWriter().append("Served at >> ").append(req.getContextPath());
        RequestDispatcher reqDispatch = req.getRequestDispatcher("ex01/result01.jsp");
        reqDispatch.forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}