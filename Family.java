package OOP_DZ_1;

public class Family {

    public static void treeView(Persona root, int space) {
        String line = "   ".repeat(space);
        if (space == 1) {
            line += "[ребенок] ";
        } else if (space >= 2) {
            line += "[" + "пра- ".repeat(space - 2) + "внук] ";
        }
        line += root.FullName;
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
}