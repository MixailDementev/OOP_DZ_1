package OOP_DZ_1;

import java.util.*;

public class Persona {

    public String FullName;

    public Persona(String Name) {
        this.FullName = Name;
    }

    ArrayList<Persona> listName = new ArrayList<>();

    public void addName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }
}