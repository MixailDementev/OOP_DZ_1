package OOP_DZ_1;

public class MainApp {
    
    public static void main(String[] args) {
        Persona Father = new Persona("Дубов Павел Владимирович");
        Persona Son = new Persona("Дубов Сергей Павлович");
        Persona Daughter = new Persona("Иванова Ольга Павловна");
        Persona Grandson = new Persona("Дубов Кирилл Сергеевич");
        Persona Grandson_2 = new Persona("Иванов Иван Иванович");
        Persona Granddauter = new Persona("Дубова Людмила Сергеевна");
        Persona Granddauter_2 = new Persona("Березова Екатерина Ивановна");
        Persona Grandgranddauter = new Persona("Березова Тамара Сергеевна");
        Father.addName(Son);
        Father.addName(Daughter);
        Son.addName(Grandson);
        Son.addName(Granddauter);
        Daughter.addName(Granddauter_2);
        Daughter.addName(Grandson_2);
        Granddauter_2.addName(Grandgranddauter);

        Family.treeView(Father,0);
    }
}