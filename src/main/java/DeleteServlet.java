import mysql.business.PetDB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int petId=Integer.parseInt(request.getParameter("petId"));
            PetDB.delete(petId);
            response.sendRedirect(request.getContextPath()+"/view");
        }catch (Exception ex){
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request,response);
        }
    }
}
