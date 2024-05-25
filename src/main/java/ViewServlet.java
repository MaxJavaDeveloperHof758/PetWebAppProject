import mysql.business.Pet;
import mysql.business.PetDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Pet> pets= PetDB.selectAllPets();
        request.setAttribute("pets",pets);
        getServletContext().getRequestDispatcher("/view.jsp").forward(request,response);
    }
}
