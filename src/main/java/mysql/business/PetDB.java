package mysql.business;

import java.sql.*;
import java.util.ArrayList;

public class PetDB {
    private static String url="jdbc:mysql://localhost:3306/mydb";
    private static String username="root";
    private static String password="Maks99hof758_";
    public static ArrayList<Pet> selectAllPets(){
        ArrayList<Pet> pets=new ArrayList<Pet>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn= DriverManager.getConnection(url,username,password)){
                Statement statement=conn.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM pets");
                while(resultSet.next()){
                    int petId=resultSet.getInt(1);
                    String petType=resultSet.getString(2);
                    String petName=resultSet.getString(3);
                    int petAge=resultSet.getInt(4);
                    String petColor=resultSet.getString(5);
                    String petOwner=resultSet.getString(6);
                    Pet pet=new Pet(petId,petType,petName,petAge,petColor,petOwner);
                    pets.add(pet);
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return pets;
    }
    public static ArrayList<Pet> selectAllCats(){
        ArrayList<Pet> cats=new ArrayList<Pet>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn= DriverManager.getConnection(url,username,password)){
                Statement statement=conn.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM pets WHERE petType='cat'");
                while(resultSet.next()){
                    int petId=resultSet.getInt(1);
                    String petType=resultSet.getString(2);
                    String petName=resultSet.getString(3);
                    int petAge=resultSet.getInt(4);
                    String petColor=resultSet.getString(5);
                    String petOwner=resultSet.getString(6);
                    Pet pet=new Pet(petId,petType,petName,petAge,petColor,petOwner);
                    cats.add(pet);
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return cats;
    }
    public static ArrayList<Pet> selectAllDogs(){
        ArrayList<Pet> dogs=new ArrayList<Pet>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn= DriverManager.getConnection(url,username,password)){
                Statement statement=conn.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM pets WHERE petType='dog'");
                while(resultSet.next()){
                    int petId=resultSet.getInt(1);
                    String petType=resultSet.getString(2);
                    String petName=resultSet.getString(3);
                    int petAge=resultSet.getInt(4);
                    String petColor=resultSet.getString(5);
                    String petOwner=resultSet.getString(6);
                    Pet pet=new Pet(petId,petType,petName,petAge,petColor,petOwner);
                    dogs.add(pet);
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return dogs;
    }
    public static Pet selectOnePet(int id){
        Pet pet=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn=DriverManager.getConnection(url,username,password)){
                String sql="SELECT * FROM pets WHERE petId=?";
                try(PreparedStatement preparedStatement=conn.prepareStatement(sql)){
                    preparedStatement.setInt(1,id);
                    ResultSet resultSet=preparedStatement.executeQuery();
                    if(resultSet.next()){
                        int petId=resultSet.getInt(1);
                        String petType=resultSet.getString(2);
                        String petName=resultSet.getString(3);
                        int petAge=resultSet.getInt(4);
                        String petColor=resultSet.getString(5);
                        String petOwner=resultSet.getString(6);
                        pet=new Pet(petId,petType,petName,petAge,petColor,petOwner);
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return pet;
    }
    public static int insert(Pet pet){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn=DriverManager.getConnection(url,username,password)){
                String sql="INSERT INTO pets (petId,petType,petName,petAge,petColor,petOwner) VALUES (?,?,?,?,?,?)";
                try(PreparedStatement preparedStatement=conn.prepareStatement(sql)){
                    preparedStatement.setInt(1,pet.getPetId());
                    preparedStatement.setString(2,pet.getPetType());
                    preparedStatement.setString(3,pet.getPetName());
                    preparedStatement.setInt(4,pet.getPetAge());
                    preparedStatement.setString(5,pet.getPetColor());
                    preparedStatement.setString(6,pet.getPetOwner());
                    return preparedStatement.executeUpdate();
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public static int update (Pet pet){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn=DriverManager.getConnection(url,username,password)){
                String sql="UPDATE pets SET petId=?, petType=?, petName=?, petAge=?, petColor=?, petOwner=? WHERE petId=?";
                try(PreparedStatement preparedStatement=conn.prepareStatement(sql)){
                    preparedStatement.setInt(1,pet.getPetId());
                    preparedStatement.setString(2,pet.getPetType());
                    preparedStatement.setString(3,pet.getPetName());
                    preparedStatement.setInt(4,pet.getPetAge());
                    preparedStatement.setString(5,pet.getPetColor());
                    preparedStatement.setString(6,pet.getPetOwner());
                    preparedStatement.setInt(7,pet.getPetId());
                    return preparedStatement.executeUpdate();
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public static int delete(int id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection conn=DriverManager.getConnection(url,username,password)){
                String sql="DELETE FROM pets WHERE petId=?";
                try(PreparedStatement preparedStatement=conn.prepareStatement(sql)){
                    preparedStatement.setInt(1,id);
                    return preparedStatement.executeUpdate();
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}
