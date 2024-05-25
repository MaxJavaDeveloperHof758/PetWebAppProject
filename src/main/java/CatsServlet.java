import mysql.business.Pet;
import mysql.business.PetDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/cats")
public class CatsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ArrayList<Pet> cats = PetDB.selectAllCats();
            request.setAttribute("cats", cats);
            getServletContext().getRequestDispatcher("/cats.jsp").forward(request, response);
        }
    }
