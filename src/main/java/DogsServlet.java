import mysql.business.Pet;
import mysql.business.PetDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/dogs")
public class DogsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Pet> dogs = PetDB.selectAllDogs();
        request.setAttribute("dogs", dogs);
        getServletContext().getRequestDispatcher("/dogs.jsp").forward(request, response);
    }
}
