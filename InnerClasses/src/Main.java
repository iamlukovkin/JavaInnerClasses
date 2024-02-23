import creational.*;

public class Main {
    public static void main(String... args) {
        Department university = new Department("Кафедра ЭВМ");

        university.addPosition("Ассистент");
        university.addWorker("Дарья Амелина", "Ассистент");

        university.addPosition("Старший преподаватель");
        university.addWorker("Александр Сергеевич Бастрычкин", "Старший преподаватель");

        university.addPosition("Доцент");
        university.addWorker("Дмитрий Игоревич Устюков", "Доцент");

        university.addPosition("Профессор");
        university.addWorker("Костров Борис Васильевич", "Профессор");

        System.out.println(university);
    }
}