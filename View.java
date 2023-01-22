package OOP_DZ_1;

public class View {

    public static void treeView(Persona root, int space) {
        String line = "   ".repeat(space);
        if (space == 1) {
            line += "[ребенок] ";
        } else if (space >= 2) {
            line += "[" + "пра- ".repeat(space - 2) + "внук] ";
        }
        line += root.getName();
        if (root.listName.size() != 0) {
            System.out.println(line);
            System.out.println(" ".repeat(line.length()) + "|");
        } else {
            System.out.println(line);
        }
        for (Persona a : root.getListName()) {
            treeView(a, space + 1);
            if (!a.equals(root.getListName().get(root.getListName().size() - 1))) {
                System.out.println(" ".repeat(line.length()) + "|");
            }
        }
    }

    public static void bookView(Persona root) {
        System.out.println(root.personaLib.LibraryName);
        for (LibraryBooks a : root.personaLib.listBooks) {
            System.out.println(a.bAuthor + " " + a.bName + " " + a.bLanguage + " ");
        }
    }

    public static void animalView(Persona root){
        System.out.println("Type of animals: " + root.PersAnimal.AnName);
        for (ListAnimals a: root.PersAnimal.listAnimals) {
            System.out.println(a.bAnimal + " " + a.bName);
        }
    }
}