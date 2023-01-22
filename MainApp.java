package OOP_DZ_1;

public class MainApp {

    public static void main(String[] args) {

        Persona father = new Persona("male", "John", 30, "Lib1", "dog");
        Persona son = new Persona("male", "Pit", 8, "Lib2", "cat");

        father.personaLib.AddBook("Достоевский", "Идиот", "русский");
        son.personaLib.AddBook("Народное творчество", "Азбука", "русский");

        father.PersAnimal.AddAnimal("бульдог", "Граф");
        son.PersAnimal.AddAnimal("шотландская", "Мурка");

        father.addName(son);
        father.Voice();

        System.out.println("*".repeat(15));
        View.treeView(father, 0);
        System.out.println("*".repeat(15));
        View.bookView(father);
        View.bookView(son);

        System.out.println("*".repeat(15));
        View.animalView(father);
        View.animalView(son);


    }
}