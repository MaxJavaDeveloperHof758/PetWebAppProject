package mysql.business;

import java.io.Serializable;

public class Pet implements Serializable {
    private int petId;
    private String petType;
    private String petName;
    private int petAge;
    private String petColor;
    private String petOwner;
    public Pet(){}

    public Pet(int petId, String petType, String petName, int petAge, String petColor, String petOwner) {
        this.petId = petId;
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.petColor = petColor;
        this.petOwner = petOwner;
    }

    public Pet(String petType, String petName, int petAge, String petColor, String petOwner) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.petColor = petColor;
        this.petOwner = petOwner;
    }

    public int getPetId() {
        return petId;
    }

    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public String getPetColor() {
        return petColor;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }
}
