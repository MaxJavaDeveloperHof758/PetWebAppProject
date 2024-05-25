import mysql.business.Pet;
import mysql.business.PetDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int petId= Integer.parseInt(request.getParameter("id"));
            Pet pet= PetDB.selectOnePet(petId);
            if(pet!=null){
                request.setAttribute("pet",pet);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request,response);
            }else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request,response);
            }
        }catch (Exception ex){
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request,response);
        }
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        try{
            int petId= Integer.parseInt(request.getParameter("petId"));
            String petType=request.getParameter("petType");
            String petName=request.getParameter("petName");
            int petAge= Integer.parseInt(request.getParameter("petAge"));
            String petColor=request.getParameter("petColor");
            String petOwner=request.getParameter("petOwner");
            Pet pet=new Pet(petId,petType,petName,petAge,petColor,petOwner);
            PetDB.update(pet);
            response.sendRedirect(request.getContextPath()+"/view");
        }catch (Exception ex){
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request,response);
        }
    }
}
