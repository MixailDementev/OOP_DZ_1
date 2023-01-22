package OOP_DZ_1;

import java.util.*;

public class Persona extends Human {
    public Library personaLib;
    public Klass_animals PersAnimal;

    public Persona(String Sex, String Name, int Age, String personaLib, String PersAnimal) {
        setSex(Sex);
        setName(Name);
        setAge(Age);
        this.personaLib = new Library(personaLib);
        this.PersAnimal = new Klass_animals(PersAnimal);
    }

    ArrayList<Persona> listName = new ArrayList<>();

    public void addName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = getName();
        System.out.println("My name is " + name);
    }

    public void name() {

    }
}