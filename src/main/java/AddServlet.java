import mysql.business.Pet;
import mysql.business.PetDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/add.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        try{
            String petType=request.getParameter("petType");
            String petName=request.getParameter("petName");
            int petAge= Integer.parseInt(request.getParameter("petAge"));
            String petColor=request.getParameter("petColor");
            String petOwner=request.getParameter("petOwner");
            Pet pet=new Pet(petType,petName,petAge,petColor,petOwner);
            PetDB.insert(pet);
            response.sendRedirect(request.getContextPath()+"/view");
        }catch (Exception ex){
            getServletContext().getRequestDispatcher("/add.jsp").forward(request,response);
        }
    }
}
